package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		/*34. Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que calcule o valor de H com N termos.*/

		Scanner aux = new Scanner(System.in);
		int H;
		double soma = 0;
		
		System.out.println("Digite o valor de H:");
		H = aux.nextInt();
		
		System.out.print("H = 1 + ");
		
		for (int i=1; i<=H; i++) {
			soma += (1/i);
			System.out.print("1/"+i+" + ");
		}
		
		System.out.println("\nSoma = "+soma);
		
	}

}
