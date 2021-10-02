package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*9. Faça um Programa que peça a temperatura em graus Farenheit,
		transforme e mostre a temperatura em graus Celsius.
		o C = (5 * (F-32) / 9).*/ 
		
		Scanner aux = new Scanner(System.in);
		System.out.println();
		
		System.out.println("Conversor de graus Farenheit para graus Celsius");
		System.out.println("Informe a temperatura em graus Farenheit");
		double farenheit = aux.nextDouble();
		double celsius = (5 * (farenheit-32) / 9);
		
		System.out.println("A temperatura" + farenheit + "ºF convertida para graus Celsius é " + celsius + "ºC");
		
		
		

	}

}
