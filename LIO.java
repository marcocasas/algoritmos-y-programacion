public class LIO <T extends Comparable <T>> { //Lista Indexada Ordenada
	private T collection[];
	private int length;
	private final int MAX = 20;
	
	public LIO() {
		collection = (T[]) new Comparable[MAX];
		length = 0;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		
		for (int i = 0; i<length; i++) {
			str.append(collection[i]).append("\n");
		}
		
		return str.toString();
	}
	
	public int size() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public boolean contains(T obj) {
		return (ManejadorArreglosGenericos.binSearch(collection, length, obj) >= 0);
	}
	
	public int indexOf(T obj) {
		int index = ManejadorArreglosGenericos.binSearch(collection, length, obj);
		
		if (index < 0) {
			index = -1;
		}
		
		return index;
	}
	
	public void clear() {
		collection = new Comparable[MAX];
		length = 0;
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
		
		if (collection.length == length) {
			ensureCapacity(length*2);
		}
		
		pos = ManejadorArreglosGenericos.binSearch(collection, length, obj);
				
		if (pos < 0) {
			pos = pos * -1 -1;
			ManejadorArreglosGenericos.moveRight(collection, length, pos);
			collection[pos] = obj;
			length++;
			response = true;
		}
		
		return response;
	}
	
	public boolean remove(T obj) {
		int newSize;
		boolean response;
		
		//newSize = ManejadorArregloGenericos.deleteOrdered();
		
		if (size == newSize) {
			response = false;
		}
		
		else {
			response = true;
			size = newSize;
		}
		
		return response;
	}
}
