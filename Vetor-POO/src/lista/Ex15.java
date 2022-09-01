package lista;

import java.util.Arrays;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final int NUM = 5;
		
		int[] vet = new int[NUM];
		
		for (int i = 0; i < NUM; i++) {
			do {
				System.out.println("Digite um número");
				vet[i] = scan.nextInt();
			} while (vet[i]>20 || vet[i]<0);
		}
		
		Arrays.sort(vet);
		
		for (int i = 0; i < vet.length; i++) {
			if (i==0) {
				System.out.print(vet[i]+"#");
			}else {
				if (vet[i]==vet[i-1]) {
					System.out.print("#");
				}else {
					System.out.println("");
					System.out.print(vet[i]+"#");
				}
			}
		}
		
		scan.close();

	}

}
