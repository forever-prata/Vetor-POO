package lista;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			float[] vet = new float[4];
			float soma = 0;
			
			for (int i = 0; i < vet.length; i++) {
				System.out.println("Digite a nota "+(i+1));
				vet[i] = scan.nextFloat();
			}
			
			for (int i = 0; i < vet.length; i++) {
				System.out.print(vet[i]+" |");
				soma += vet[i];
			}
			
			float media = soma / 4;
			System.out.println("");
			System.out.println("A média das notas é : "+media);
			
			scan.close();

	}

}
