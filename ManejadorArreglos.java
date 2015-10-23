package clasesgenerales;

public class ManejadorArreglos {
	
	public static double sumarElementos(double array[], int indice) {
		double suma = 0;
		
		for (int i = 0; i<indice; i++) {
			suma = suma + array[i];
		}
		
		return suma;
	}
	
	public static double calculaProm(double array[], int indice) {
		double prom = ManejadorArreglos.sumarElementos(array, indice) / array.length; //Length es un atributo de la clase Array.
		return prom;
	}
	
	public static int obtenMayor(double array[], int indice) {
		double max = -1000;
		int indexMax = -404;
		
		for (int i = 0; i<indice; i++) {
			if(array[i]>max) {
				max = array[i];
				indexMax = i;
			}
		}
		
		return indexMax;
	}
	
	public static int obtenMenor(double array[], int indice) {
		double min = 100000000;
		int indexMin = -404;
		
		for (int i = 0; i<indice; i++) {
			if(array[i]<min) {
				min = array[i];
				indexMin = i;
			}
		}
		
		return indexMin;
	}
	
	public static int mayoresQueValor(double array[], int index, double valor) {
		int suma = 0;
		
		for (int i = 0; i<index; i++) {
			if(array[i]>valor) {
				suma = suma + 1;
			}
		}
		
		return suma;
	}
	
	public static int menoresQueValor(double array[], int index, double valor) {
		int suma = 0;
		
		for (int i = 0; i<index; i++) {
			if(array[i]<valor) {
				suma = suma + 1;
			}
		}
		
		return suma;
	}
	
	public static int busquedaSecuencial(double array[], int length, double aBuscar) {
		int i = 0;
		
		while (i <= length && array[i] != aBuscar) { //¡Orden sí importa!
			i++;
		}
		
		if(i == length) {
			i = -404;
		}
		
		return i;
	}
	
	public static int busquedaBinaria(double array[], int length, double aBuscar) { //SOLAMENTE PARA ARREGLOS ORDENADOS.
		int left, right, center;
		left = 0;
		right = length - 1;
		center = (left+right)/2; //???
		
		while(left<=right && aBuscar != array[center]) {
			if (aBuscar < array[center]) {
				right = center - 1;
			}
			
			else {
				left = center + 1;
			}
			
			center = (left + right) / 2;
		}
		
		if (left>right) { //Si fracaso.
			center = center + 1 * -1;
		}
		
		return center;
	}

	public static int insertaDatoDesord(double array[], int length, double dato) {
		if (length < array.length) {
			length++;
			array[length] = dato;
		}
		
		return length; //Regreso el tamaño porque fuera de mi método no se refleja el cambio.
	}
	
	public static int insertaDatoOrdenado(double array[], int length, double dato) {
		if(length < array.length) { //Saber si hay espacio. Comparo el número de elementos con la cantidad posible de elementos
			int pos;
			pos = busquedaBinaria(array, length, dato);
			
			if (pos < 0) {
				pos = pos * -1 -1;
			
				recorreDer(array,length,pos);
			
				array[pos] = dato;
		
				length = length + 1;
			}
		}
		
		return length;
	}
	
	public static int eliminaDatoDesord(double array[], int length, double dato) {
		int pos = busquedaSecuencial(array, length, dato);
		
		if (pos>=0) {
			array[pos] = array[length-1];
			--length;
		}
		
		return length;
	}

	public static int eliminaDatoOrdenado(double array[], int length, double dato) {
		int pos = busquedaBinaria(array, length, dato);
		
		if (pos >= 0) {
			recorrerIzq(array, length, pos);
			length--;
		}
		
		return length;
	}
	
	public static void recorreDer(double array[], int length, int posicion) {
		for(int i = length; i>posicion; i--) {
			array[i] = array[i-1];
		}
	}
	
	public static void recorrerIzq(double array[], int length, int posicion) {
		for(int i = posicion; i<length-1; i++) {
			array[i] = array[i+1];
		}
	}
	
}
