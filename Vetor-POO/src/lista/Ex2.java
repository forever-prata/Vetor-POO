package lista;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float[] vet = new float[10];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite o valor da posição "+(i+1));
			vet[i] = scan.nextFloat();
		}
		
		System.out.println("--------");
		
		for (int i = 9; i >= 0; i--) {
			System.out.println(vet[i]);
		}
		
		scan.close();

	}

}
