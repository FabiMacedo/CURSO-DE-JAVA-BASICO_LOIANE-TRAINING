package com.fabiana.cursojava.aula17.labs;

public class Exercicio09 {

	public static void main(String[] args) {
		/*9. Fa�a um programa que imprima na tela apenas os n�meros �mpares entre 1 e 50.*/
		
		System.out.println("Os n�meros �mpares entre 0 e 50 s�o ");
		
		for (int i=0; i<50; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}

	}

}
