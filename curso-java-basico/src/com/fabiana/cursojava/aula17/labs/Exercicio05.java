package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*5. Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. 
		Valide a entrada e permita repetir a operação.*/
		
		Scanner aux = new Scanner(System.in);
		double popA, popB;
		int cont = 0;
		double taxaA, taxaB;
		boolean valido = false;
		
		do {
			System.out.println("Informe a qde. da população A");
			popA = aux.nextInt();
			if (popA > 0) {
				valido = true;
			} else {
				System.out.println("População A precisa ser maior que 0");
			}
			
		} while(!valido);
		
		valido = false;
		
		do {
			System.out.println("Informe a qde. da população B");
			popB = aux.nextInt();
			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("População B precisa ser maior que 0");
			}
			
		} while(!valido);
		
		valido = false;
		
		do {
			System.out.println("Informe a taxa de crescimento da população A");
			taxaA = aux.nextDouble();
			if (taxaA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa da população A precisa ser maior que 0");
			}
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Informe a taxa de crescimento da população B");
			taxaB = aux.nextDouble();
			if (taxaB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa da população B precisa ser maior que 0");
			}
		} while (!valido);
		
		
		if (taxaA <= taxaB ) {
			System.out.println("O país A jamais vai superar a população do pais B");
			
		} else {
			if (popA < popB) {
				while (popA <= popB) {
					popA += popA * (taxaA/100);
					popB += popB * (taxaB/100);
					cont++;
				}
			
			} else {
				while (popB <= popA) {
					popA += popA * (taxaA/100);
					popB += popB * (taxaB/100);
					cont++;
				}
			}
		}
		
		
		System.out.println("População A "+popA);
		System.out.println("População B "+popB);
		System.out.println("Em quantos anos a população A será igual a população B? Em "+cont+" anos.");

	}

}
