package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		/*17. Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio. Ex.: 5! = 5.4.3.2.1=120*/ 

		Scanner aux = new Scanner(System.in);
		
		int num = 0;
		int fatorial = 1;
		
		System.out.println("Sistema de c�lculo do fatorial.\nDigite um n�mero inteiro:");
		num = aux.nextInt();
		
		System.out.println(num+"! = ");
		
		for (int i=num; i>0; i--) {
			fatorial *= i;
			System.out.println(i);
		}
		
		System.out.println("Resultado: "+fatorial);
	}

}
