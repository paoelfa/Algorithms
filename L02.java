package br.ucsal;

import java.util.Scanner;

public class L02 {

	public static void main(String[] args) {
		Scanner mw=new Scanner(System.in);

		System.out.println("Informe o valor das duas notas, respectivamente:");
		Double a1=mw.nextDouble(),
				a2=mw.nextDouble(),
				media;
			double p1=4.0,p2=6.0;
		if (a1>=0 && a1<=10 && a2>=0 && a2<=10) {
			
			media=(a1*p1 +a2*p2)/(p1+p2);
			
			System.out.printf("A média é: %.2f", media);
			
			if (media >=6) {
				System.out.println("Aprovado");
			}else if(media < 6 && media >4) {
				System.out.println("prova final");
			} else {
				System.out.println("reprovado.");
			}
		} else {
			System.out.println("os valores não são válidos.");
		}
		mw.close();
	}

}
