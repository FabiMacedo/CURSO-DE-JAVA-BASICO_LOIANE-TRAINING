package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido
	    e continue pedindo até que o usuário informe um valor válido.*/
		
		Scanner aux = new Scanner(System.in);
		double nota = 0;
		//flag
		boolean notaValida = false;
		
		do {
			System.out.println("Informe uma nota de 0 até 10");
			nota = aux.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("A nota informada é "+ nota);
			} else {
				//notaValida = false;
				System.out.println("Por favor, informe uma nota válida!");
			}
			
		} while (!notaValida); //ou notaValida == false
		
	}

}
