package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*9. Faça um Programa que leia três números e mostre-os em ordem decrescente.*/
		
		Scanner aux = new Scanner(System.in);
		
		int numAux = 0;
		
		System.out.println("Digite o primeiro número inteiro");
		int num1 = aux.nextInt();
		System.out.println("Digite o segundo número inteiro");
		int num2 = aux.nextInt();
		System.out.println("Digite o terceiro número inteiro");
		int num3 = aux.nextInt();
		
		System.out.println("Primeiro número: " + num1 + "\nSegundo número: " + num2 + "\nTerceiro número: " + num3);
		
		if (num3 >= num2) {
			numAux = num3;
			num3 = num2;
			num2 = numAux;
		}
		
		if(num2 >= num1) {
			numAux = num2;
	        num2 = num1;
	        num1 = numAux;
		}
	        
		if (num3 >= num2) {
			numAux = num3;
			num3 = num2;
			num2 = numAux;
		}
		
		System.out.println("Números em ordem decrescente " + num1 + " - " + num2 + " - " + num3);
		
	}

}
