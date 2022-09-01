package lista;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vet = new int[10];
		int[] vet2 = new int[10];
		int[] soma = new int[20];
		int aux = 0;
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite o valor "+(i+1+" do vetor 1 : "));
			vet[i] = scan.nextInt();
			
			System.out.println("Digite o valor "+(i+1+" do vetor 2 : "));
			vet2[i] = scan.nextInt();
		}
		
		for (int i = 0; i < soma.length; i++) {
			if (i%2 == 0) {
				soma[i]=vet[aux];
			}else {
				soma[i]=vet2[aux];
				aux++;
			}
			
		}
		
		for (int i = 0; i < soma.length; i++) {
			System.out.println(soma[i]);
		}
		
		scan.close();
	}

}
