package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//2. Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro");
		int num1 = aux.nextInt();
		
		if (num1 >= 0) {
			System.out.println("O n�mero "+ num1 +" � positivo");
		} else {
			System.out.println("O n�mero "+ num1 +" � negativo");
		}
		

	}

}
