package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		/*33. Faça um programa que mostre os n termos da Série a seguir: S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m.
		Imprima no final a soma da série.*/

		Scanner aux = new Scanner(System.in);
		int n;
		double soma = 0;
		
		System.out.println("Digite o valor de n:");
		n = aux.nextInt();
		
		System.out.print("S = ");
		
		for (int i=1, j=1; i<=n; i++, j+=2 ) {
			
			System.out.print(i+"/"+j+" + ");
			soma += i/j;
		}
		
		System.out.println("\nSoma = "+soma);
	}

}
