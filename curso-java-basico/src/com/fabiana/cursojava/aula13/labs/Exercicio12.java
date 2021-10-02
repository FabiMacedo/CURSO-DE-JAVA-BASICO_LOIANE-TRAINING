package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*12. Tendo como dados de entrada a altura de uma pessoa, construa um
		algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
		(72.7*altura) - 58*/ 
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Calcule seu peso ideal");
		System.out.println("Informe sua altura");
		double altura = aux.nextDouble();
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("O seu peso ideal é " + pesoIdeal);
	}

}
