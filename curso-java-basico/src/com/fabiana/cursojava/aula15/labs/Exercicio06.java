package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*6. Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.*/
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero inteiro");
		int num1 = aux.nextInt();
		System.out.println("Digite o segundo n�mero inteiro");
		int num2 = aux.nextInt();
		System.out.println("Digite o terceiro n�mero inteiro");
		int num3 = aux.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("O maior n�mero digitado foi " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("O maior n�mero digitado foi " + num2);
		} else if (num3 >= num1 && num3 >= num2){
			System.out.println("O maior n�mero digitado foi " + num3);
		}

	}

}
