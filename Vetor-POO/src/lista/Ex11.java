package lista;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma Data no formato nome;sobrenome;sobrenome ");
		String str = scan.nextLine();
		
		String[] letras = str.split(";", str.length());
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		scan.close();
	}

}
