package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*11. Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real.
		Calcule e mostre:
		a. o produto do dobro do primeiro com metade do segundo .
		b. a soma do triplo do primeiro com o terceiro.
		c. o terceiro elevado ao cubo.*/ 
		
		Scanner aux = new Scanner(System.in);
			
		System.out.println("Digite um n�mero inteiro");
		int num1 = aux.nextInt();
		
		System.out.println("Digite outro n�mero inteiro");
		int num2 = aux.nextInt();
		
		System.out.println("Agora digite um n�mero real");
		double num3 = aux.nextDouble();
		
		double calculo1 = (num1 * 2) * (num2/2); 
		double calculo2 = (num1 * 3) + num3;
		double calculo3 = num3 * num3 * num3;
		
		System.out.println("O c�lculo do produto do dobro do primeiro n�mero com metade do segundo n�mero � " + calculo1);
		System.out.println("O c�lculo da soma do triplo do primeiro n�mero com o terceiro n�mero � " + calculo2);
		System.out.println("O c�lculo do terceiro n�mero elevado ao cubo � " + calculo3);
		
	}

}
