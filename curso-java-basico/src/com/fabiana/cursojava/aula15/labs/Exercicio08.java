package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*8. Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto voc� deve comprar, 
		sabendo que a decis�o � sempre pelo mais barato.*/
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Digite o pre�o do primeiro produto");
		double produto1 = aux.nextDouble();
		System.out.println("Digite o pre�o do segundo produto");
		double produto2 = aux.nextDouble();
		System.out.println("Digite o pre�o do terceiro produto");
		double produto3 = aux.nextDouble();

		double menorPreco = produto1;
		
		if (produto2 < menorPreco) {
			menorPreco = produto2;
		}
		if (produto3 < menorPreco) {
			menorPreco = produto3;
		}
		
		System.out.println("1� Produto R$" + produto1 + "\n2� Produto R$" + produto2 + "\n3� Produto R$" + produto3);
		System.out.println("O produto mais barato � R$" + menorPreco + ", voc� pode comprar");
		
	}

}
