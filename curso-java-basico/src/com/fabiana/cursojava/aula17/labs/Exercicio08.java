package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*8. Fa�a um programa que leia 5 n�meros e informe a soma e a m�dia dos n�meros.*/
		
		Scanner aux = new Scanner(System.in);
		
		double num = 0, soma = 0, media = 0;
		
		for (int i=0; i<5; i++) {
			System.out.println("Informe um n�mero:");
			num = aux.nextDouble(); 
			soma += num;
		}
		
		media = soma/5;
		
		System.out.println("A soma de todos os n�meros � "+soma+"\nE a m�dia � "+media);
	}

}
