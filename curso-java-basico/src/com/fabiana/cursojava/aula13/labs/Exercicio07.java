package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*Fa�a um Programa que calcule a �rea de um quadrado, 
		 * em seguida mostre o dobro desta �rea para o usu�rio.*/ 
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Calcular a �rea de um quadrado");
		System.out.println("Digite o valor de um lado do quadrado: ");
		double ladoQuadrado = aux.nextDouble();
		
		//ou double area = ladoQuadrado * ladoQuadrado;
		
		double area = Math.pow(ladoQuadrado, 2);
		double dobroArea = area * 2;
		
		System.out.println("A �rea do quadrado � " + area + "\nE a �rea em dobro � " + dobroArea);

	}

}
