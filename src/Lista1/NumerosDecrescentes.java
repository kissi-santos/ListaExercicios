package Lista1;

import java.util.Scanner;

public class NumerosDecrescentes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número: ");
		numero = scan.nextInt();
		
		for(int i = numero; i >= 0; i--){
			System.out.println(i);
		}
	}

}
