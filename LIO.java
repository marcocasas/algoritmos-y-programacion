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
		length = 0;
	}
}
