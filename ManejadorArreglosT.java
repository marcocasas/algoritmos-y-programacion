public class ManejadorArreglosGenericos {
	public static <T> void moveLeft(T array[], int length, int position) {
		for(int i = position; i<length-1; i++) {
			array[i] = array[i+1];
		}
	}
	
	public static <T> void moveRight(T array[], int length, int position) {
		for(int i = length; i>position; i--) {
			array[i] = array[i-1];
		}
	}
	
	public static <T> String toString(T array[], int length){
		StringBuilder str = new StringBuilder();
		int i;
		
		for (i = 0; i<length; i++) {
			str.append(array[i]).append("\n");
		}
		
		return str.toString();
	}
	
	public static <T> int seqSearch(T array[], int length, T toSearch) {
		int i = 0;
		
		while (i<length && !array[i].equals(toSearch)) {
			i++;
			
			if (i == length) {
				i = -1;
			}
		}
		
		return i;
	}
	
	public static <T extends Comparable <T>> int binSearch(T array[], int length, T toSearch) {
		int left = 0;
		int right = length - 1;
		int center = (left+right)/2;
		
		while (left < right && !array[center].equals(toSearch)) {
			if (array[center].compareTo(toSearch) > 0) {
				right = center - 1;
			}
			
			else {
				left = center - 1;
			}
			
			center = (right+left)/2;
		}
		
		if (left > right) {
			center = (left+1) * -1; //Nos dice la posición donde debería estar, más uno.
		}
		
		return center;
	}
	
	public static <T extends Comparable <T>> int searchMax(T array[], int length) {
		int index = 0;
		
		for (int i = 1; i < length; i++) {
			if (array[i].compareTo(array[index]) > 0) {
				index = i;
			}
		}
		
		return index;
	}
	
	public static <T extends Comparable <T>> int deleteOrdered(T array[], int size, T dato) {
		int pos = binSearch(array, size, dato);
		
		if (pos >= 0) {
			moveLeft(array, size, pos);
			size--;
		}
		
		return size;
	}
	
	public static <T extends Comparable <T>> int deleteDesordered(T array[], int size, T dato) {
		int pos = binSearch(array, size, dato);
		
		if (pos >= 0) {
			moveLeft(array, size, pos);
			size--;
		}
		
		return size;
	}
        
        public static <T extends Comparable <T>> int insertOrdered(T array[], int size, T dato) {
		if(size < array.length) { //Saber si hay espacio. Comparo el número de elementos con la cantidad posible de elementos
			int pos;
			pos = binSearch(array, size, dato);
			
			if (pos < 0) {
				pos = pos * -1 -1;
			
				moveRight(array,size,pos);
			
				array[pos] = dato;
		
				size = size + 1;
			}
		}
		
		return size;
	}
        
        public static <T extends Comparable <T>> int insertDesordered(T array[], int length, T dato) {
		if (length < array.length) {
			length++;
			array[length] = dato;
		}
		
		return length; //Regreso el tamaño porque fuera de mi método no se refleja el cambio.
	}
}
