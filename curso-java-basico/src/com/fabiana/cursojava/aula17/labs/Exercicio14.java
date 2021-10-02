package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/*14. Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares 
		 * e a quantidade de números ímpares.*/
		
		Scanner aux = new Scanner(System.in);
		int num, impar = 0, par = 0;
		
		System.out.println("Informe 10 números inteiros");
		
		for (int i=1; i<=10; i++) {
			System.out.println("Digite o "+i+"º número");
			num = aux.nextInt();
			
			if (num%2==0) {
				par++;
				//par += 1;
				
			} else {
				impar++;
				//impar += 1;
			}
		}
		
		System.out.println("Quantidade de números pares digitados: "+par);
		System.out.println("Quantidade de números impares digitados: "+impar);

	}

}
