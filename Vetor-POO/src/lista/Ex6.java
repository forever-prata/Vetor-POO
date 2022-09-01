package lista;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float[] medias = new float[10];
		float total = 0;
		int aprovado = 0;
		
		for (int i = 0; i < medias.length; i++) {
			total = 0;
			for (int j = 0; j < 4; j++) {
				System.out.println("Digite a nota "+(j+1)+" do aluno "+(i+1)+" : ");
				total += scan.nextFloat();
			}
			medias[i]=total/4;
			
			if (medias[i]>=7) {
				aprovado++;
			}
		}
			
		System.out.println("Numero de alunos com média maior ou igual a 7 : "+aprovado);
		
		scan.close();

	}

}
