package lista;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] vet = new String[10];
		String[] consoantes = new String[10];
		
		int consoante = 0;
		int aux = 0;
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite a letra da posição "+(i+1)+" : ");
			vet[i] = scan.nextLine();
			
			if (vet[i].equals("a")||vet[i].equals("e")||vet[i].equals("i")||vet[i].equals("o")||vet[i].equals("u")) {
				System.out.println("Vogal");
			}else {
				consoante++;
				consoantes[aux] = vet[i];
				aux++;
			}
		}
		
		System.out.println("Consoantes = "+consoante);
		
		for (int i = 0; i < consoantes.length; i++) {
			if (consoantes[i]!= null) {
				System.out.println(consoantes[i]);
			}
		}
		
		scan.close();

	}

}
