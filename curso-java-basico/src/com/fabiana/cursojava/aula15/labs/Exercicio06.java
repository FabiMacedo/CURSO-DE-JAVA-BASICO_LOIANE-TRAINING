package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*6. Faça um Programa que leia três números e mostre o maior deles.*/
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro");
		int num1 = aux.nextInt();
		System.out.println("Digite o segundo número inteiro");
		int num2 = aux.nextInt();
		System.out.println("Digite o terceiro número inteiro");
		int num3 = aux.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O maior número digitado foi " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("O maior número digitado foi " + num2);
		} else if (num3 >= num1 && num3 >= num2){
			System.out.println("O maior número digitado foi " + num3);
		}

	}

}
