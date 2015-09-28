import java.util.Scanner;

public class Algo {

	public static void main(String[] args) {
	
		int v, n, f;
	
		System.out.print("Dame un número: ");
		Scanner input = new Scanner(System.in);
		v = input.nextInt();
	
		while(v!=0){
			do {
				System.out.print("Dame un número mayor o igual a uno: ");
				Scanner input2 = new Scanner(System.in);
				n = input2.nextInt();} while(n<1);
		      
			if (n==1){
        			System.out.println("f = 1");
      			}
      	
      			else{
      				f = 1;
        
        			for (int i=2; i<n; i++){
          				f = f*i;
        			}
		  
        			System.out.println("n = " + n);
        			System.out.println("f = " + f);
        		}
      
      			System.out.print("Dame un número: ");
      			Scanner input3 = new Scanner(System.in);
      			v = input3.nextInt();
    		}
	}
}
