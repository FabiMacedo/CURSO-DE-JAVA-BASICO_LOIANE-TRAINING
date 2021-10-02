package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		/*
		 * 15. Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa dever�
		 * informar se os valores podem ser um tri�ngulo. Indique, caso os lados formem
		 * um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno. Dicas: � Tr�s
		 * lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que
		 * o terceiro; � Tri�ngulo Equil�tero: tr�s lados iguais; � Tri�ngulo Is�sceles:
		 * quaisquer dois lados iguais; � Tri�ngulo Escaleno: tr�s lados diferentes;
		 */

		Scanner aux = new Scanner(System.in);

		System.out.println("Sistema de tipos de tri�ngulo");
		System.out.println("Informe o primeiro lado");
		int lado1 = aux.nextInt();
		System.out.println("Informe o segundo lado");
		int lado2 = aux.nextInt();
		System.out.println("Informe o terceiro lado");
		int lado3 = aux.nextInt();
		
		if (((lado1 + lado2) > lado3) || 
			((lado1 + lado3) > lado2) || 
			((lado2 + lado3) > lado1)) {
			System.out.println("� um triangulo");
			
			if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
				System.out.println("O Tri�ngulo � Equil�tero, possui tr�s lados iguais.");

			} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
				System.out.println("O Tri�ngulo � Escaleno, possui tr�s lados diferentes.");

			} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
				System.out.println("O Tri�ngulo � Is�sceles, possui quaisquer dois lados iguais.");
			}
			
		} else {
			System.out.println("N�o um triangulo");
		}

	}

}
