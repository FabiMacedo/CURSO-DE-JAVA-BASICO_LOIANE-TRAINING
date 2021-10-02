package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		/*27. O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa que leia as um conjunto 
		indeterminado de temperaturas, e informe ao final a menor e a maior temperaturas informadas, bem como a média das 
		temperaturas.*/

		Scanner aux = new Scanner(System.in);
		
		int qtdTemp;
		double temperatura;
		double maior = Double.MIN_VALUE; 
		double menor = Double.MAX_VALUE; 
		double soma = 0;
		double media;
		
		System.out.println("Digite a quantidade de temperaturas a ser informada");
		qtdTemp = aux.nextInt();
		
		for (int i=1; i<=qtdTemp; i++) {
			System.out.println("Informe a "+i+"ª temperatura");
			temperatura = aux.nextDouble();
			
			soma += temperatura;
			
			if (temperatura > maior) {
				maior = temperatura;
			}
			
			if (temperatura < menor) {
				menor = temperatura;
			}
			
		}
		
		media = soma/qtdTemp;
		
		System.out.println("A maior temperatura registrada foi "+maior);
		System.out.println("A menor temperatura registrada foi "+menor);
		System.out.println("A média das temperaturas registradas foi "+media);
				
	}

}
