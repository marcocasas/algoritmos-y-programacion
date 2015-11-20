public class LID <T> {
	private T collection[];
	private int size;
	private final int MAX = 20;
	
	public LID() {
		collection = (T[]) new Object[MAX];
		size = 0;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		
		for (int i = 0; i<size; i++) {
			str.append(collection[i]).append("\n");
		}
		
		return str.toString();
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public T set(T obj, int index) {
		T resul = null;
		
		if (index < size && index >= 0) {
			resul = collection[index];
			collection[index] = obj;
			
			ManejadorArreglosGenericos.moveLeft(collection, size, index);
			
			size = size-1;
		}
		
		return resul;
	}

	public T get(int index) {
		T result = null;
		
		if (index < size && index >= 0) {
			result = collection[index];
		}
		
		return result;
	}
	
	public void clear() {
		collection = (T[]) new Object[MAX];
		size = 0;
	}
	
	public void ensureCapacity(int val) {
		T newCol[] = (T[]) new Object[val];
		
		for (int i = 0; i < collection.length; i++) {
			newCol[i] = collection[i];
		}
		
		collection = newCol;
	}
	
	public int indexOf(T obj) {
		return ManejadorArreglosGenericos.seqSearch(collection, size, obj);
	}
	
	public boolean contains(T obj) {
		return ManejadorArreglosGenericos.seqSearch(collection, size, obj) >= 0;
	}
	
	public void addFirst(T obj) {
		if (size == collection.length) {
			ensureCapacity(size*2);
		}
		
		ManejadorArreglosGenericos.moveRight(collection, size, 0);
		
		collection[0] = obj;
		
		size++;
	}
	
	public void addLast(T obj) {
		if (size == collection.length) {
			ensureCapacity(size*2);
		}
		
		collection[size] = obj;
		
		size++;
	}
	
	public void add(int pos, T obj) {
		if (pos >= 0 && pos <= size) {
			if (size == collection.length) {
				ensureCapacity(size*2);
			}
			
			ManejadorArreglosGenericos.moveRight(collection, size, pos);
			
			collection[pos] = obj;
			
			size++;
		}
	}
	
	public T remove(int pos) {
		T result = null;
		
		if (pos >= 0 && pos < size) {
			result = collection[pos];
			
			collection[pos] = collection[size-1];
			collection[size-1] = null;
			
			size--;
		}
		
		return result;
	}
	
	public boolean remove(T obj) {
		boolean resp = false;
		
		int i = indexOf(obj);
		
		if (i>= 0) {
			resp = remove(i) != null;
		}
		
		resp = remove(i) != null;
		
		return resp;
	}
}
