public class LIO <T extends Comparable <T>> { //Lista Indexada Ordenada
	private T collection[];
	private int size;
	private final int MAX = 20;
	
	public LIO() {
		collection = (T[]) new Comparable[MAX];
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
	
	public boolean contains(T obj) {
		return (ManejadorArreglosGenericos.binSearch(collection, size, obj) >= 0);
	}
	
	public int indexOf(T obj) {
		int index = ManejadorArreglosGenericos.binSearch(collection, size, obj);
		
		if (index < 0) {
			index = -1;
		}
		
		return index;
	}
	
	public void clear() {
		collection = (T[]) new Comparable[MAX];
		size = 0;
	}
	
	public void ensureCapacity(int val) {
		T newCol[] = (T[]) new Comparable[val];
		
		for (int i = 0; i < collection.length; i++) {
			newCol[i] = collection[i];
		}
		
		collection = newCol;
	}
	
	public boolean add(T obj) {
		boolean response = false;
		int pos;
		
		if (collection.length == size) {
			ensureCapacity(size*2);
		}
		
		pos = ManejadorArreglosGenericos.binSearch(collection, size, obj);
				
		if (pos < 0) {
			pos = pos * -1 -1;
			ManejadorArreglosGenericos.moveRight(collection, size, pos);
			collection[pos] = obj;
			size++;
			response = true;
		}
		
		return response;
	}
	
	public boolean remove(T obj) {
		boolean response = false;
		int newSize = ManejadorArreglosGenericos.deleteOrdered(collection, size, obj);
		
		if (size > newSize) {
			response = true;
			size = newSize;
		}
		
		return response;
	}
	
	public T remove(int index) {
		T result = null;
		
		if (index < size && index >= 0) {
			result = collection[index];
		}
		
		return result;
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
}
