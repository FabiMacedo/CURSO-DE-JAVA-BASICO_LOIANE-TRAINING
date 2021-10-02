package com.fabiana.cursojava.aula17.labs;

public class Exercicio09 {

	public static void main(String[] args) {
		/*9. Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.*/
		
		System.out.println("Os números ímpares entre 0 e 50 são ");
		
		for (int i=0; i<50; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}

	}

}
