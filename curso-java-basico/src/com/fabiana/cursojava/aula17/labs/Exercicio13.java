package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/*13.Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número. 
		Não utilize a função de potência da linguagem.*/ 
		
		Scanner aux = new Scanner(System.in);
		
		int base, expoente, potencia = 1;
				
		System.out.println("Digite um número inteiro da base");
		base = aux.nextInt();
		
		System.out.println("Digite um outro número inteiro para o expoente");
		expoente = aux.nextInt();
		
		
		for (int i=1; i<=expoente; i++) {
			potencia *=  base;
		}
		//1º vez potencia = potencia * base; potencia = 1 * 3; ou 3 =  1 * 3;
		//2º vez potencia = potencia * base; potencia = 3 * 3; ou 9 =  3 * 3;
		//3º vez potencia = potencia * base; potencia = 9 * 3; ou 27 =  9 * 3; potencia = 27;
		
		System.out.println("A base "+base+" elevado ao expoente "+expoente+" é a potência "+potencia);

	}

}
