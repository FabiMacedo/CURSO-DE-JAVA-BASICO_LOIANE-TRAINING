package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		/*17. Fa�a um Programa que pe�a um n�mero correspondente a um determinado ano e em seguida informe se este ano 
		� ou n�o bissexto.*/
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Informe um ano");
		int ano = aux.nextInt();
		
		if (ano%4==0 && ano%100!=0 || ano%400==0) {
			System.out.println("O ano de "+ano+" � bisexto.");
		} else {
			System.out.println("O ano de "+ano+" n�o � bisexto.");
		}

	}

}
