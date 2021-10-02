package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*Faça um Programa que calcule a área de um quadrado, 
		 * em seguida mostre o dobro desta área para o usuário.*/ 
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Calcular a área de um quadrado");
		System.out.println("Digite o valor de um lado do quadrado: ");
		double ladoQuadrado = aux.nextDouble();
		
		//ou double area = ladoQuadrado * ladoQuadrado;
		
		double area = Math.pow(ladoQuadrado, 2);
		double dobroArea = area * 2;
		
		System.out.println("A área do quadrado é " + area + "\nE a área em dobro é " + dobroArea);

	}

}
