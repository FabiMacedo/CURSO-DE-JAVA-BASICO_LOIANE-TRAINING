package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*10. Fa�a um Programa que pe�a a temperatura em graus Celsius,
		transforme e mostre em graus Farenheit.*/ 
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Conversor de graus Celsius para graus Farenheit");
		System.out.println("Informe a temperatura em graus Celsius");
		double celsius = aux.nextDouble();
		
		//ou double farenheit = ( 9 * celsius + 160 ) / 5;
		double farenheit = (celsius * 1.8) + 32;
		
		System.out.println("A temperatura " + celsius + "�C convertida em graus Farenheit � " + farenheit + "�F");
	}

}
