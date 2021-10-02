package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		/*28. Os números primos possuem várias aplicações dentro da Computação, por exemplo na Criptografia. 
		Um número primo é aquele que é divisível apenas por um e por ele mesmo. Faça um programa que peça um número inteiro 
		e determine se ele é ou não um número primo.*/
		
		Scanner aux = new Scanner(System.in);
		
		int num;
		boolean primo = true;
		
		System.out.println("Digite um número:");
		num = aux.nextInt();
		
		for (int i=2; i<num; i++) {
			if(num%i==0) {
				System.out.println("Não é um número primo - É divisível por "+i);
				primo = false;
			}
		}
		
		if (primo) {
			System.out.println(num+" é um número primo.");
		}


	}

}
