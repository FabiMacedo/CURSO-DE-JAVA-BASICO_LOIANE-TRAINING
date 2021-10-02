package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		/*19.Fa�a um Programa que leia 2 n�meros e em seguida pergunte ao usu�rio qual opera��o ele deseja realizar. 
		O resultado da opera��o deve ser acompanhado de uma frase que diga se o n�mero �:
		a. par ou �mpar;
		b. positivo ou negativo;*/
		
		Scanner aux = new Scanner(System.in);
		
		double result = 0;
		boolean valida = true;
		
		System.out.println("Informe qual opera��o voc� deseja realizar:\n| Adi��o - A | Subtra��o - S | Multiplica��o - M | Divis�o - D |");
		String operacao = aux.nextLine();
		
		System.out.println("Informe um n�mero inteiro");
		double num1 = aux.nextDouble();
		System.out.println("Informe um outro n�mero inteiro");
		double num2 = aux.nextDouble();
		
		switch (operacao) {
			case "A":
			case "a":
				result = num1 + num2;
				System.out.println("A opera��o escolhoida foi Adi��o.\nO resultado � "+result);
			break;
			case "S":
			case "s":
				result = num1 - num2;
				System.out.println("A opera��o escolhoida foi Subtra��o.\nO resultado � "+result);
			break;
			case "M":
			case "m":
				result = num1 * num2;
				System.out.println("A opera��o escolhoida foi Multiplica��o.\nO resultado � "+result);
			break;
			case "D":
			case "d":
				result = num1 - num2;
				System.out.println("A opera��o escolhoida foi Divis�o.\nO resultado � "+result);
			break;
			default:
				System.out.println("Op��o Inv�lida!");
				valida = false;
		}
		
		if (valida) {
			if (result%2==0) {
				System.out.println("O resultado "+result+" � par.");
			} else {
				System.out.println("O resultado "+result+" � impar.");
			}
			
			if (result >= 0) {
				System.out.println("O resultado "+result+" � positivo.");
			} else {
				System.out.println("O resultado "+result+" � negativo.");
			}
			
		} else {
			System.out.println("Opera��o Inv�lida!");
		}
		
	}

}
