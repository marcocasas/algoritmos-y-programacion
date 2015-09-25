public class Rectangulo {
	
	//Atributos de la  clase Rectangulo.
	private double base, altura;
	
	//Constructor por omisión.
	public Rectangulo(){
	}
	
	//Constructor con parámetros.
	public Rectangulo(double a, double b){
		altura = a;
		base = b;
	}
	
	//Función para calcular el área.
	public double calcArea(){
		double area = base * altura;
		return area;
	}
	
	//Función para calcular el perímetro.
	public double calcPeri(){
		return 2 * (base + altura);
	}	
	
	//Método para asignar un nuevo valor a la altura.
	public void setAltura(double a){
		altura = a;
	}
	
	//Método para asignar un nuevo valor a la base.
	public void setBase(double b){
		altura = b;
	}
	
	//Método para obtener el valor de la altura.
	public double getAltura(){
		return altura;
	}
	
	//Método para obtener el valor de la base.
	public double getBase(){
		return base;
	}
	
	public String toString(){
		return ("Hola");
	}
	
	//Funcionalidad mínima equals()
	public boolean equals(Rectangulo segRectComparar){
		if (this.calcArea() == segRectComparar.calcArea()){
			return true;
		}
		
		else {
			return false;
		}
	}
	
	//Funcionalidad mínima compareTo()
	public int compareTo(Rectangulo segRectComparar){
		if (this.calcArea() >= segRectComparar.calcArea()){
			return 1;
		}
		
		else if (this.calcArea() <= segRectComparar.calcArea()){
			return -1;
		}
		
		else {
			return 0;
		}
	}
}
