package lista;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um String: ");
		String str = scan.nextLine();
		
		String[] letras = str.split("", str.length());
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		scan.close();
	}

}
