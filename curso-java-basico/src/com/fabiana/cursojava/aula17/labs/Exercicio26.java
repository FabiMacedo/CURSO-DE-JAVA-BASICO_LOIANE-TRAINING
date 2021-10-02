package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		/*26. Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio. Ex.: 5! = 5.4.3.2.1=120. 
		A sa�da deve ser conforme o exemplo abaixo: 
		Fatorial de: 5 
		5! = 5 . 4 . 3 . 2 . 1 = 120*/
		
		Scanner aux = new Scanner(System.in);
		
		int num = 0;
		int fatorial = 1;
		String output;
		
		System.out.println("Sistema de c�lculo do fatorial.\nDigite um n�mero inteiro:");
		num = aux.nextInt();
		
		System.out.println("Fatorial de "+num);
		
		//System.out.print(num+"! = "); ou
		output = num+"! = ";
		
		for (int i=num; i>1; i--) {
			fatorial *= i;
			//System.out.print(i+" . ");
			output += i+" . ";
		}
		
		System.out.println(output+"1 = "+fatorial);
		

	}

}
