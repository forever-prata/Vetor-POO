package lista;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[20];
		int[] par = new int[20];
		int auxp = 0;
		int[] inpar = new int[20];
		int auxi = 0;
		
		for (int i = 0; i < num.length; i++) {
			do {
				System.out.println("Digite o número (diferente de 0) da posição "+(i+1)+" : ");
				num[i] = scan.nextInt();
			} while (num[i]==0);
			 
			
			if (num[i]%2 == 0) {
				par[auxp] = num[i];
				auxp++;
			}else {
				inpar[auxi] = num[i];
				auxi++;
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("----pares----");
		for (int i = 0; i < par.length; i++) {
			if (par[i]!=0) {
				System.out.println(par[i]);
			}
		}
		
		System.out.println("----inpares----");
		for (int i = 0; i < inpar.length; i++) {
			if (inpar[i]!=0) {
				System.out.println(inpar[i]);
			}
		}
		
		scan.close();

	}

}
