package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/*13.Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e mostre o primeiro n�mero elevado ao segundo n�mero. 
		N�o utilize a fun��o de pot�ncia da linguagem.*/ 
		
		Scanner aux = new Scanner(System.in);
		
		int base, expoente, potencia = 1;
				
		System.out.println("Digite um n�mero inteiro da base");
		base = aux.nextInt();
		
		System.out.println("Digite um outro n�mero inteiro para o expoente");
		expoente = aux.nextInt();
		
		
		for (int i=1; i<=expoente; i++) {
			potencia *=  base;
		}
		//1� vez potencia = potencia * base; potencia = 1 * 3; ou 3 =  1 * 3;
		//2� vez potencia = potencia * base; potencia = 3 * 3; ou 9 =  3 * 3;
		//3� vez potencia = potencia * base; potencia = 9 * 3; ou 27 =  9 * 3; potencia = 27;
		
		System.out.println("A base "+base+" elevado ao expoente "+expoente+" � a pot�ncia "+potencia);

	}

}
