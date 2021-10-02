package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//1. Faça um Programa que peça dois números e imprima o maior deles.
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro");
		int num1 = aux.nextInt();
		System.out.println("Digite o segundo número inteiro");
		int num2 = aux.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior número digitado foi o primeiro"+ num1);
		} else {
			System.out.println("O maior número digitado foi o segundo"+ num2);
		}

	}

}
