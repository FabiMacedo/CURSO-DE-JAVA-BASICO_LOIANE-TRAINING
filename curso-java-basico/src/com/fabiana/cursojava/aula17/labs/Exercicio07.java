package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*7. Fa�a um programa que leia 5 n�meros e informe o maior n�mero.*/
		
		Scanner aux = new Scanner(System.in);
		
		double num = 0, maior = 0;
				
		for (int i=0; i<5; i++) {
			System.out.println("Informe um n�mero:");
			num = aux.nextDouble(); 
			if (num > maior) {
				maior = num;
			}
		}
		
		System.out.println("O maior n�mero digitado foi "+maior);
	}

}

/*Loiane
 
	Scanner aux = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE; menor valor poss�vel para Integer
		
		for (int i=0; i<5; i++) {
			System.out.println("Entre com um n�mero:");
			num = aux.nextDouble(); 
			
			if (num > maior) {
				maior = num;
				System.out.println("O n�mero maior mudou:");
			}
		}
		
		System.out.println("O maior numero digitado foi "+maior);
*/


