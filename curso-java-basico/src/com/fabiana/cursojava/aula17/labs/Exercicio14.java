package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/*14. Fa�a um programa que pe�a 10 n�meros inteiros, calcule e mostre a quantidade de n�meros pares 
		 * e a quantidade de n�meros �mpares.*/
		
		Scanner aux = new Scanner(System.in);
		int num, impar = 0, par = 0;
		
		System.out.println("Informe 10 n�meros inteiros");
		
		for (int i=1; i<=10; i++) {
			System.out.println("Digite o "+i+"� n�mero");
			num = aux.nextInt();
			
			if (num%2==0) {
				par++;
				//par += 1;
				
			} else {
				impar++;
				//impar += 1;
			}
		}
		
		System.out.println("Quantidade de n�meros pares digitados: "+par);
		System.out.println("Quantidade de n�meros impares digitados: "+impar);

	}

}
