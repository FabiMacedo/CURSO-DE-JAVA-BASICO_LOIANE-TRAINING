package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*9. Fa�a um Programa que leia tr�s n�meros e mostre-os em ordem decrescente.*/
		
		Scanner aux = new Scanner(System.in);
		
		int numAux = 0;
		
		System.out.println("Digite o primeiro n�mero inteiro");
		int num1 = aux.nextInt();
		System.out.println("Digite o segundo n�mero inteiro");
		int num2 = aux.nextInt();
		System.out.println("Digite o terceiro n�mero inteiro");
		int num3 = aux.nextInt();
		
		System.out.println("Primeiro n�mero: " + num1 + "\nSegundo n�mero: " + num2 + "\nTerceiro n�mero: " + num3);
		
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
		
		System.out.println("N�meros em ordem decrescente " + num1 + " - " + num2 + " - " + num3);
		
	}

}
