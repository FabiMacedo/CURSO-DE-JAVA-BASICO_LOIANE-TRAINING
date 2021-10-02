package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*4. Fa�a um Programa que verifique se uma letra digitada � vogal ou consoante.*/ 
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Digite uma letra ");
		String letra = aux.nextLine();
		
		if (letra.length() > 1) {
			System.out.println("N�o � uma letra v�lida");
		} else {
			switch (letra) {
				case "a":
				case "e": 
				case "i":
				case "o":
				case "u":
				case "A":
				case "E": 
				case "I":
				case "O":
				case "U":
					System.out.println("Voc� digitou " + letra + ", ela � uma vogal.");
				break;
				default: 
					System.out.println("Voc� digitou " + letra + ", ela � uma consoante.");
			}
		}
		
		
		if (letra.length() > 1) {
			System.out.println("N�o � uma letra v�lida");
		} else {
			if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
				System.out.println("Voc� digitou " + letra + ", ela � uma vogal.");
			} else {
				System.out.println("Voc� digitou " + letra + ", ela � uma consoante.");
			}
		}
		

	}

}
