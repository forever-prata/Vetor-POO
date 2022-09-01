package lista;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		
		int soma = 0;
		int mult = 1;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("Digite o número da posição : "+(i+1));
			num[i] = scan.nextInt();
			
			soma+= num[i];
			mult = mult*num[i];
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("----soma----");
		System.out.println(soma);
		System.out.println("----multiplicação----");
		System.out.println(mult);
		
		scan.close();
	}

}
