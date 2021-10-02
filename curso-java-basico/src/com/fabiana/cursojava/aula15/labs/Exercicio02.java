package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		int num1 = aux.nextInt();
		
		if (num1 >= 0) {
			System.out.println("O número "+ num1 +" é positivo");
		} else {
			System.out.println("O número "+ num1 +" é negativo");
		}
		

	}

}
