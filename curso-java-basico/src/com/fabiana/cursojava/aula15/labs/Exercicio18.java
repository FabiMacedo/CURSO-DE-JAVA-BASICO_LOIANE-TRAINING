package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		/*18.Faça um Programa que peça um número inteiro e determine se ele é par ou ímpar. 
		Dica: utilize o operador módulo (resto da divisão).*/
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro");
		int numero = aux.nextInt();
		
		if (numero%2==0) {
			System.out.println("O número é par.");
		} else {
			System.out.println("O número é impar.");
		}

	}

}
