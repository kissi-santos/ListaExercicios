package Lista2;
import java.util.Scanner;

public class MostraNumeros {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		int vetor;		
		
		System.out.println("Digite um número: ");
		vetor = scan.nextInt();
		
		int[] v = new int[vetor];
		
		for(int i = 0; i < vetor; i++){
			System.out.println("Digito um valor");
			v[i] = scan.nextInt();
		}
		for(int i = 0; i < vetor; i++){
			System.out.println(v[i]);			
		}
	}

}
