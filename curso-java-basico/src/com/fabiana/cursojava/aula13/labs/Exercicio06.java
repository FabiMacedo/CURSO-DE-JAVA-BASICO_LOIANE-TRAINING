package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*Fa�a um Programa que pe�a o raio de um 
		 * c�rculo, calcule e mostre sua �rea.*/ 
		
		Scanner aux = new Scanner(System.in);
		
		
		System.out.println("Calcular Raio de um c�rculo");
		System.out.println("Digite o valor do raio: ");
		int raio = aux.nextInt();
		
		double area = Math.PI * Math.pow(raio, 2);
		System.out.println("A �rea do c�rculo � " + area);
		

	}

}
