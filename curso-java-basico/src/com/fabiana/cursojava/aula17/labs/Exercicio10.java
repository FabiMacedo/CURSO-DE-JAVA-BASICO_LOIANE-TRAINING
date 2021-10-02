package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*10. Fa�a um programa que receba dois n�meros inteiros e gere os n�meros inteiros que 
		est�o no intervalo compreendido por eles.*/
		
		Scanner aux = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite um n�mero inteiro");
		num1 = aux.nextInt();
		
		System.out.println("Digite um outro n�mero inteiro");
		num2 = aux.nextInt();
		
		if (num1 == num2) {
			System.out.println("Os n�meros s�o iguais!");
			
		} else if (num1 < num2) {
			System.out.println("Os n�meros entre "+num1+" e "+num2+" s�o:");
			for (int i= num1; i<num2; i++) {
				System.out.println(i+", ");
			}
		} else if (num1 > num2) {
			System.out.println("Os n�meros entre "+num1+" e "+num2+" s�o:");
			for (int i=num1; i>=num2; i--) {
				System.out.println(i+", ");
			}
		}
		
	}

}
