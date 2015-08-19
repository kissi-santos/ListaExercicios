package Lista1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero, result = 0, num1 = 0, num2 = 1;
		
		System.out.println("Digite um número: ");
		numero = scan.nextInt();
		
		for(int i = 0; i <= numero; i++){
			num1 = num2;
			num2 = result;
			result = num1 + num2;
			
			System.out.println(result);
		}
	}

}
