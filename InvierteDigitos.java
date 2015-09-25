import java.util.Scanner;

public class InvierteDigitos {

	public static void main(String[] args) {
		
		int x, n, k;
		
		x = 0;
		
		System.out.print("Dame un número: ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		input.close();
		
		while (n>0){
			k = n%10;
			x = x * 10 + k;
			n = n/10;
		}
		
		System.out.print("Resultado: " + x);
	}

}
