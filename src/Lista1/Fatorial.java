package Lista1;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		int fator = 1, numero;
		
		
		System.out.println("Digite um n�mero: ");
		numero = scan.nextInt();
		
		for(int i = numero; i >= 0; i--){			
			if(i > 0){
				fator *= i;
				System.out.println(fator);
			}else{				
				fator *= 1;
				System.out.println(fator);
			}
		}
		
	}

}
