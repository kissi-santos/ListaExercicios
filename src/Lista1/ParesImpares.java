package Lista1;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número: ");
		numero = scan.nextInt();
		
		for(int i = numero; i >= 0; i--){
			if(i % 2 == 0){
				System.out.printf("%d é par ", i);
			}		
		}
		
		System.out.println();
		
		for(int j = numero; j >= 0; j--){
			if(j % 2 == 1){
				System.out.printf("%d é impar ", j);
			}		
		}
	}

}
