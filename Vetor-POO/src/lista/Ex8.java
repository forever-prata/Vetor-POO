package lista;

import java.util.Random;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		String[] vogais = new String[5];
		String[] consoantes = new String[21];
		
		int num = 0;
		
		vogais[0]="a";
		vogais[1]="e";
		vogais[2]="i";
		vogais[3]="o";
		vogais[4]="u";
		
		consoantes[0]="b"; 
		consoantes[1]="c";
		consoantes[2]="d";
		consoantes[3]="f"; 
		consoantes[4]="g"; 
		consoantes[5]="h"; 
		consoantes[6]="j"; 
		consoantes[7]="k"; 
		consoantes[8]="l"; 
		consoantes[9]="m"; 
		consoantes[10]="n"; 
		consoantes[11]="p"; 
		consoantes[12]="q"; 
		consoantes[13]="r"; 
		consoantes[14]="s"; 
		consoantes[15]="t"; 
		consoantes[16]="v"; 
		consoantes[17]="w"; 
		consoantes[18]="x"; 
		consoantes[19]="y";
		consoantes[20]="z";
		
		
		do {
			System.out.println("Digite o tamanho da senha: ");
			num = scan.nextInt();
		} while (num>24);
		
		String[] senha = new String[num];
		
		for (int i = 0; i < senha.length; i++) {
			if (i%2!=0) {
				int rnd = new Random().nextInt(vogais.length);
				senha[i]=vogais[rnd];
			}else {
				int rnd = new Random().nextInt(consoantes.length);
				senha[i]=consoantes[rnd];
			}
		}
		
		for (int i = 0; i < senha.length; i++) {
			System.out.print(senha[i]);
		}
		
		scan.close();

	}

}
