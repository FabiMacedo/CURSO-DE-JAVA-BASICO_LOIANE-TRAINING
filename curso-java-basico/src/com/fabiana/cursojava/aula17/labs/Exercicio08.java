package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*8. Faça um programa que leia 5 números e informe a soma e a média dos números.*/
		
		Scanner aux = new Scanner(System.in);
		
		double num = 0, soma = 0, media = 0;
		
		for (int i=0; i<5; i++) {
			System.out.println("Informe um número:");
			num = aux.nextDouble(); 
			soma += num;
		}
		
		media = soma/5;
		
		System.out.println("A soma de todos os números é "+soma+"\nE a média é "+media);
	}

}
