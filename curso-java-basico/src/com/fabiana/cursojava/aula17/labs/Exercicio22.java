package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		/*22. Fa�a um programa que calcule o valor total investido por um colecionador em sua cole��o de CDs 
		e o valor m�dio gasto em cada um deles. O usu�rio dever� informar a quantidade de CDs e o valor para em cada um.*/
		
		Scanner aux = new Scanner(System.in);
		
		int qtdCd;
		double precoCd, soma = 0, media;
		
		System.out.println("Informe a quantidade de cd's");
		qtdCd = aux.nextInt();
		
		for (int i=1; i<=qtdCd; i++) {
			System.out.println("Informe o pre�o do "+i+"� cd");
			precoCd = aux.nextDouble();
			soma += precoCd;
		}
		
		media = soma/qtdCd;
		
		System.out.println("O valor total dos cd's � R$"+soma+"\nA m�dia de pre�o de cada cd � R$"+media);

	}

}
