package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*7. Faça um Programa que leia três números e mostre o maior e o menor deles.*/

		Scanner aux = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro");
		int num1 = aux.nextInt();
		System.out.println("Digite o segundo número inteiro");
		int num2 = aux.nextInt();
		System.out.println("Digite o terceiro número inteiro");
		int num3 = aux.nextInt();
		
		int maiorNum = num1;
		
		if (num2 > maiorNum) {
			maiorNum = num2;
		}
		if (num3 > maiorNum) {
			maiorNum = num3;
		} 
		
		int menorNum = num1;
		
		if (num2 < menorNum) {
			menorNum = num2;
		}
		if (num3 < menorNum) {
			menorNum = num3;
		}
		
		System.out.println("O maior número digitado foi " + maiorNum);
		System.out.println("O menor número digitado foi " + menorNum);
	}

}
