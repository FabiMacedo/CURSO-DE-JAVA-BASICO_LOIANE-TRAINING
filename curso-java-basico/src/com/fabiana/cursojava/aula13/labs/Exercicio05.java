package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*5. Fa�a um Programa que converta metros para cent�metros.*/ 
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Conversor de metros para cent�metros");
		System.out.println("Digite um n�mero em metros: ");
		double metros = aux.nextDouble();
		
		double centimetros = metros * 100;
		System.out.println("O valor de " + metros + " metros convertido para centimetros � " + centimetros + "cm.");
		

	}

}
