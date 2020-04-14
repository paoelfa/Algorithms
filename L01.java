package br.ucsal;

import java.util.Scanner;
public class L01{

			public static void main(String[] args) {
		    Scanner nw = new Scanner(System.in);
		    
		    System.out.println("Informe o valor das suas três notas ");
		    Double n1=nw.nextDouble(),
		    	   n2=nw.nextDouble(),
		    	   n3=nw.nextDouble(),
		    	   media;
		    media= (n1+n2+n3)/3;
		    
		    System.out.println("a média é:"+ media);
		    if (media>=6) {
		    	System.out.println("Aluno aprovado.");
		    } else {
		    	System.out.println("Aluno reprovado.");
		    }
		    
		    
			}

		}
