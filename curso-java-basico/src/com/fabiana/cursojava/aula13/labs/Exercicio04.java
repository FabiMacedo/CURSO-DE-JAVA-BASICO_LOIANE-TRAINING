package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*4. Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.*/ 

		Scanner aux = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota:");
		double nota1 = aux.nextDouble();
		
		System.out.println("Informe a segunda nota:");
		double nota2 = aux.nextDouble();
		
		System.out.println("Informe a terceira nota:");
		double nota3 = aux.nextDouble();
		
		System.out.println("Informe a quarta nota:");
		double nota4 = aux.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/ 4;
		
		System.out.println("Primeira nota: " + nota1);
		System.out.println("Segunda nota: " + nota2);
		System.out.println("Terceira nota: " + nota3);
		System.out.println("Quarta nota: " + nota4);
		System.out.println("A m�dia � " + media);
		
	}

}
