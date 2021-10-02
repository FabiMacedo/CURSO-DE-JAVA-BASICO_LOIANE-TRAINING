package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*Faça um Programa que peça o raio de um 
		 * círculo, calcule e mostre sua área.*/ 
		
		Scanner aux = new Scanner(System.in);
		
		
		System.out.println("Calcular Raio de um círculo");
		System.out.println("Digite o valor do raio: ");
		int raio = aux.nextInt();
		
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("A área do círculo é " + area);
		

	}

}
