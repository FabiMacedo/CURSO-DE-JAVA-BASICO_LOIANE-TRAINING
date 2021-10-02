package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*5. Altere o programa anterior permitindo ao usu�rio informar as popula��es e as taxas de crescimento iniciais. 
		Valide a entrada e permita repetir a opera��o.*/
		
		Scanner aux = new Scanner(System.in);
		double popA, popB;
		int cont = 0;
		double taxaA, taxaB;
		boolean valido = false;
		
		do {
			System.out.println("Informe a qde. da popula��o A");
			popA = aux.nextInt();
			if (popA > 0) {
				valido = true;
			} else {
				System.out.println("Popula��o A precisa ser maior que 0");
			}
			
		} while(!valido);
		
		valido = false;
		
		do {
			System.out.println("Informe a qde. da popula��o B");
			popB = aux.nextInt();
			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("Popula��o B precisa ser maior que 0");
			}
			
		} while(!valido);
		
		valido = false;
		
		do {
			System.out.println("Informe a taxa de crescimento da popula��o A");
			taxaA = aux.nextDouble();
			if (taxaA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa da popula��o A precisa ser maior que 0");
			}
		} while (!valido);
		
		valido = false;
		
		do {
			System.out.println("Informe a taxa de crescimento da popula��o B");
			taxaB = aux.nextDouble();
			if (taxaB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa da popula��o B precisa ser maior que 0");
			}
		} while (!valido);
		
		
		if (taxaA <= taxaB ) {
			System.out.println("O pa�s A jamais vai superar a popula��o do pais B");
			
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
		
		
		System.out.println("Popula��o A "+popA);
		System.out.println("Popula��o B "+popB);
		System.out.println("Em quantos anos a popula��o A ser� igual a popula��o B? Em "+cont+" anos.");

	}

}
