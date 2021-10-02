package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*11. Altere o programa anterior para mostrar no final a soma dos números.*/
		
		Scanner aux = new Scanner(System.in);
		int num1, num2, soma = 0;
		
		System.out.println("Digite um número inteiro");
		num1 = aux.nextInt();
		
		System.out.println("Digite um outro número inteiro");
		num2 = aux.nextInt();
		
		if (num1 == num2) {
			System.out.println("Os números são iguais!");
			soma = num1+num2;
			
		} else if (num1 < num2) {
			System.out.println("Os números entre "+num1+" e "+num2+" são:");
			for (int i= num1; i<=num2; i++) {
				System.out.println(i+", ");
				soma += i; 
			}
		} else if (num1 > num2) {
			System.out.println("Os números entre "+num1+" e "+num2+" são:");
			for (int i=num1; i>=num2; i--) {
				System.out.println(i+", ");
				soma += i; 
			}
		}
		
		System.out.println("A soma dos números entre "+num1+" e "+num2+" são: "+soma);
		
	}

}
