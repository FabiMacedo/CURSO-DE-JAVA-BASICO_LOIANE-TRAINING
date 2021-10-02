package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*7. Faça um programa que leia 5 números e informe o maior número.*/
		
		Scanner aux = new Scanner(System.in);
		
		double num = 0, maior = 0;
				
		for (int i=0; i<5; i++) {
			System.out.println("Informe um número:");
			num = aux.nextDouble(); 
			if (num > maior) {
				maior = num;
			}
		}
		
		System.out.println("O maior número digitado foi "+maior);
	}

}

/*Loiane
 
	Scanner aux = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE; menor valor possível para Integer
		
		for (int i=0; i<5; i++) {
			System.out.println("Entre com um número:");
			num = aux.nextDouble(); 
			
			if (num > maior) {
				maior = num;
				System.out.println("O número maior mudou:");
			}
		}
		
		System.out.println("O maior numero digitado foi "+maior);
*/


