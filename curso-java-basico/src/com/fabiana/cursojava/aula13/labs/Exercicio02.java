package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*2. Faça um Programa que peça um número e então mostre a
		mensagem O número informado foi [número].*/ 
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		int num = aux.nextInt();
		
		System.out.println("O número informado é " + num);
		
		

	}

}
