package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		/*19.Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. 
		O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
		a. par ou ímpar;
		b. positivo ou negativo;*/
		
		Scanner aux = new Scanner(System.in);
		
		double result = 0;
		boolean valida = true;
		
		System.out.println("Informe qual operação você deseja realizar:\n| Adição - A | Subtração - S | Multiplicação - M | Divisão - D |");
		String operacao = aux.nextLine();
		
		System.out.println("Informe um número inteiro");
		double num1 = aux.nextDouble();
		System.out.println("Informe um outro número inteiro");
		double num2 = aux.nextDouble();
		
		switch (operacao) {
			case "A":
			case "a":
				result = num1 + num2;
				System.out.println("A operação escolhoida foi Adição.\nO resultado é "+result);
			break;
			case "S":
			case "s":
				result = num1 - num2;
				System.out.println("A operação escolhoida foi Subtração.\nO resultado é "+result);
			break;
			case "M":
			case "m":
				result = num1 * num2;
				System.out.println("A operação escolhoida foi Multiplicação.\nO resultado é "+result);
			break;
			case "D":
			case "d":
				result = num1 - num2;
				System.out.println("A operação escolhoida foi Divisão.\nO resultado é "+result);
			break;
			default:
				System.out.println("Opção Inválida!");
				valida = false;
		}
		
		if (valida) {
			if (result%2==0) {
				System.out.println("O resultado "+result+" é par.");
			} else {
				System.out.println("O resultado "+result+" é impar.");
			}
			
			if (result >= 0) {
				System.out.println("O resultado "+result+" é positivo.");
			} else {
				System.out.println("O resultado "+result+" é negativo.");
			}
			
		} else {
			System.out.println("Operação Inválida!");
		}
		
	}

}
