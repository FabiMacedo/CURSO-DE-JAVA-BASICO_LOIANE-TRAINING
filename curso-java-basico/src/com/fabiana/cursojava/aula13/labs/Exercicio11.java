package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*11. Faça um Programa que peça 2 números inteiros e um número real.
		Calcule e mostre:
		a. o produto do dobro do primeiro com metade do segundo .
		b. a soma do triplo do primeiro com o terceiro.
		c. o terceiro elevado ao cubo.*/ 
		
		Scanner aux = new Scanner(System.in);
			
		System.out.println("Digite um número inteiro");
		int num1 = aux.nextInt();
		
		System.out.println("Digite outro número inteiro");
		int num2 = aux.nextInt();
		
		System.out.println("Agora digite um número real");
		double num3 = aux.nextDouble();
		
		double calculo1 = (num1 * 2) * (num2/2); 
		double calculo2 = (num1 * 3) + num3;
		double calculo3 = num3 * num3 * num3;
		
		System.out.println("O cálculo do produto do dobro do primeiro número com metade do segundo número é " + calculo1);
		System.out.println("O cálculo da soma do triplo do primeiro número com o terceiro número é " + calculo2);
		System.out.println("O cálculo do terceiro número elevado ao cubo é " + calculo3);
		
	}

}
