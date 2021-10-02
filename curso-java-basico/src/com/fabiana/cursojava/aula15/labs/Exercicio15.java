package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		/*
		 * 15. Faça um Programa que peça os 3 lados de um triângulo. O programa deverá
		 * informar se os valores podem ser um triângulo. Indique, caso os lados formem
		 * um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. Dicas: • Três
		 * lados formam um triângulo quando a soma de quaisquer dois lados for maior que
		 * o terceiro; • Triângulo Equilátero: três lados iguais; • Triângulo Isósceles:
		 * quaisquer dois lados iguais; • Triângulo Escaleno: três lados diferentes;
		 */

		Scanner aux = new Scanner(System.in);

		System.out.println("Sistema de tipos de triângulo");
		System.out.println("Informe o primeiro lado");
		int lado1 = aux.nextInt();
		System.out.println("Informe o segundo lado");
		int lado2 = aux.nextInt();
		System.out.println("Informe o terceiro lado");
		int lado3 = aux.nextInt();
		
		if (((lado1 + lado2) > lado3) || 
			((lado1 + lado3) > lado2) || 
			((lado2 + lado3) > lado1)) {
			System.out.println("É um triangulo");
			
			if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
				System.out.println("O Triângulo é Equilátero, possui três lados iguais.");

			} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
				System.out.println("O Triângulo é Escaleno, possui três lados diferentes.");

			} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
				System.out.println("O Triângulo é Isósceles, possui quaisquer dois lados iguais.");
			}
			
		} else {
			System.out.println("Não um triangulo");
		}

	}

}
