package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*8. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, 
		sabendo que a decisão é sempre pelo mais barato.*/
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Digite o preço do primeiro produto");
		double produto1 = aux.nextDouble();
		System.out.println("Digite o preço do segundo produto");
		double produto2 = aux.nextDouble();
		System.out.println("Digite o preço do terceiro produto");
		double produto3 = aux.nextDouble();

		double menorPreco = produto1;
		
		if (produto2 < menorPreco) {
			menorPreco = produto2;
		}
		if (produto3 < menorPreco) {
			menorPreco = produto3;
		}
		
		System.out.println("1º Produto R$" + produto1 + "\n2º Produto R$" + produto2 + "\n3º Produto R$" + produto3);
		System.out.println("O produto mais barato é R$" + menorPreco + ", você pode comprar");
		
	}

}
