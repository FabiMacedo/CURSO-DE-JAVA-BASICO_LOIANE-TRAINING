package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//1. Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero inteiro");
		int num1 = aux.nextInt();
		System.out.println("Digite o segundo n�mero inteiro");
		int num2 = aux.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior n�mero digitado foi o primeiro"+ num1);
		} else {
			System.out.println("O maior n�mero digitado foi o segundo"+ num2);
		}

	}

}
