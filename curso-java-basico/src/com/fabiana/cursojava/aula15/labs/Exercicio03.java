package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*3. Fa�a um Programa que verifique se uma letra digitada � "F" ou "M". Conforme a letra escrever: 
		 F - Feminino, M - Masculino, Sexo Inv�lido.*/
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Digite o seu sexo: F para Feminino | M para Masculino");
		String sexo = aux.nextLine();
		
		switch (sexo) {
		case "M":
		case "m":
			System.out.println("Voc� digitou " + sexo + " Masculino");
		break;
		case "F":
		case "f":
			System.out.println("Voc� digitou " + sexo + " Feminino");
		break;
		default:
			System.out.println("Sexo Inv�lido");
		}
		
		
		if (sexo.equalsIgnoreCase("m")) {
			System.out.println("Voc� digitou " + sexo + " Masculino");
		} else if (sexo.equalsIgnoreCase("f")) {
			System.out.println("Voc� digitou " + sexo + " Feminino");
		} else {
			System.out.println("Sexo Inv�lido");
		}
	}

}
