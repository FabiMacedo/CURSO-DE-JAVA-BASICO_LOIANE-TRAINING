package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*3. Fa�a um Programa que pe�a dois n�meros e imprima a soma.*/
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero:");
		int num1 = aux.nextInt();
		
		System.out.println("Informe o segundo n�mero:");
		int num2 = aux.nextInt();
		
		int soma = num1  + num2;
		System.out.println("A soma dos dois n�meros � " + soma);

	}

}
