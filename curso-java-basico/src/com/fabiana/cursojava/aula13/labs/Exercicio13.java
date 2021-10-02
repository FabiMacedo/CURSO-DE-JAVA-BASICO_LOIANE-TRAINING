package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/*13. Tendo como dados de entrada a altura e o sexo de uma pessoa,
		construa um algoritmo que calcule seu peso ideal, utilizando as
		seguintes fórmulas:
		. Para homens: (72.7*h) - 58
		a. Para mulheres: (62.1*h) - 44.7 (h = altura)
		b. Peça o peso da pessoa e informe se ela está dentro, acima ou
		abaixo do peso.*/ 
		
		Scanner aux = new Scanner(System.in);
		
		double pesoIdeal;
		
		System.out.println("Informe sua altura");
		double altura = aux.nextDouble();
		System.out.println("Informe seu sexo: F para feminino e M para masculino");
		String sexo = aux.next();
		
		switch (sexo) {
			case "M":
				pesoIdeal = (72.7 * altura) - 58;
				System.out.println("O seu peso ideal é " + pesoIdeal);
			break;
			case "F":
				pesoIdeal = (62.1 * altura) - 44.7;
				System.out.println("O seu peso ideal é " + pesoIdeal);
			break;
		}
		

	}

}
