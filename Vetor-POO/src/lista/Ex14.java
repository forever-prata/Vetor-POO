package lista;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float[] altura = new float[30];
		int[] idade = new int[30];
		float soma = 0;
		
		for (int i = 0; i < idade.length; i++) {
			System.out.println("digite a altura ");
			altura[i] = scan.nextFloat();
			soma+= altura[i];
			
			System.out.println("digite a idade ");
			idade[i] = scan.nextInt();
		}
		
		float media = soma/30;
		int count = 0;
		
		for (int i = 0; i < idade.length; i++) {
			if (idade[i]>13) {
				if (altura[i]<media) {
					count++;
				}
			}
		}
		
		System.out.println("alunos com mais de 13 anos possuem altura inferior à média "+count);
		
		scan.close();
	}

}
