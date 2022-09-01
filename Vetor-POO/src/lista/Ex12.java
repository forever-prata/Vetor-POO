package lista;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float[] altura = new float[5];
		int[] idade = new int[5];
		float alto = 0;
		float baixo = 9;
		int velho = 0;
		int novo = 150;
		int idalto = 0;
		int idbaixo = 0;
		int idvelho = 0;
		int idnovo = 0;
		
		for (int i = 0; i < idade.length; i++) {
			System.out.println("Digite a idade da pessoa "+(i+1)+" : ");
			idade[i] = scan.nextInt();
			
			System.out.println("Digite a altura da pessoa "+(i+1)+" : ");
			altura[i] = scan.nextFloat();
			
			if (idade[i]<novo) {
				novo = idade[i];
				idnovo = i;
			}else if (idade[i]>velho) {
				velho = idade[i];
				idvelho = i;
			}
			
			if (altura[i]<baixo) {
				baixo = altura[i];
				idbaixo = i;
			}else if (altura[i]>alto) {
				alto = altura[i];
				idalto = i;
			}
		}
		
		for (int i = 5; i > -1; i--) {
			System.out.println(idade[i]);
			System.out.println(altura[i]);
			System.out.println("*****");
		}
		
		System.out.println("----------");
		System.out.println("Mais alto :"+idalto+" com "+alto+" metros e "+idade[idalto]+" anos");
		System.out.println("Mais baixo :"+idbaixo+" com "+baixo+" metros e "+idade[idbaixo]+" anos");
		
		System.out.println("Mais velho :"+idvelho+" com "+velho+" anos e "+altura[idvelho]+" metros");
		System.out.println("Mais novo :"+idnovo+" com "+novo+" anos e "+altura[idnovo]+" metros");
		
		scan.close();

	}

}
