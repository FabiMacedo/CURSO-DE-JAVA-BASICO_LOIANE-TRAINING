package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		/*29. Encontrar números primos é uma tarefa difícil. Faça um programa que gera uma lista dos números primos existentes 
		entre 1 e um número inteiro informado pelo usuário.*/
		
		Scanner aux = new Scanner(System.in);
		
		int num;
		boolean primo = true;
		String output;
		
		System.out.println("Digite até que número deseja encontrar números primos de 1 até?:");
		num = aux.nextInt();
						
		for (int i=1; i<=num; i++) {
			primo = true;
			
			for (int j=2; j<i; j++) {
				if(i%j==0) {
					//System.out.println("Não é um número primo - É divisível por "+i);
					primo = false;
				}
			}
			
			if (primo) {
				System.out.println(i);
				
			}
			
		}
		
	}

}
