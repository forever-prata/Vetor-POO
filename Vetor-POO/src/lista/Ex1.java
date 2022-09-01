package lista;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vet = new int[5]; 
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite o número da posição "+(i+1));
			vet[i] = scan.nextInt();
		}
		
		System.out.println("-----------------");
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		
		scan.close();

	}

}
