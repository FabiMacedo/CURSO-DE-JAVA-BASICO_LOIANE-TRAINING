package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*2. Fa�a um Programa que pe�a um n�mero e ent�o mostre a
		mensagem O n�mero informado foi [n�mero].*/ 
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro");
		int num = aux.nextInt();
		
		System.out.println("O n�mero informado � " + num);
		
		

	}

}
