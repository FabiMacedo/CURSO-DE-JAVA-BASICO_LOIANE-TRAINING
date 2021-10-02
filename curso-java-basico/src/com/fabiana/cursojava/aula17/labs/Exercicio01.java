package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*1. Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inv�lido
	    e continue pedindo at� que o usu�rio informe um valor v�lido.*/
		
		Scanner aux = new Scanner(System.in);
		double nota = 0;
		//flag
		boolean notaValida = false;
		
		do {
			System.out.println("Informe uma nota de 0 at� 10");
			nota = aux.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("A nota informada � "+ nota);
			} else {
				//notaValida = false;
				System.out.println("Por favor, informe uma nota v�lida!");
			}
			
		} while (!notaValida); //ou notaValida == false
		
	}

}
