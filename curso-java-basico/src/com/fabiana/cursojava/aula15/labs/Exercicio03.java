package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: 
		 F - Feminino, M - Masculino, Sexo Inválido.*/
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Digite o seu sexo: F para Feminino | M para Masculino");
		String sexo = aux.nextLine();
		
		switch (sexo) {
		case "M":
		case "m":
			System.out.println("Você digitou " + sexo + " Masculino");
		break;
		case "F":
		case "f":
			System.out.println("Você digitou " + sexo + " Feminino");
		break;
		default:
			System.out.println("Sexo Inválido");
		}
		
		
		if (sexo.equalsIgnoreCase("m")) {
			System.out.println("Você digitou " + sexo + " Masculino");
		} else if (sexo.equalsIgnoreCase("f")) {
			System.out.println("Você digitou " + sexo + " Feminino");
		} else {
			System.out.println("Sexo Inválido");
		}
	}

}
