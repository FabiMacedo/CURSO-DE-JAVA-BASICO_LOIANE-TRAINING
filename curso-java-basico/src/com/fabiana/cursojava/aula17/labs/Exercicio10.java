package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*10. Faça um programa que receba dois números inteiros e gere os números inteiros que 
		estão no intervalo compreendido por eles.*/
		
		Scanner aux = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite um número inteiro");
		num1 = aux.nextInt();
		
		System.out.println("Digite um outro número inteiro");
		num2 = aux.nextInt();
		
		if (num1 == num2) {
			System.out.println("Os números são iguais!");
			
		} else if (num1 < num2) {
			System.out.println("Os números entre "+num1+" e "+num2+" são:");
			for (int i= num1; i<num2; i++) {
				System.out.println(i+", ");
			}
		} else if (num1 > num2) {
			System.out.println("Os números entre "+num1+" e "+num2+" são:");
			for (int i=num1; i>=num2; i--) {
				System.out.println(i+", ");
			}
		}
		
	}

}
