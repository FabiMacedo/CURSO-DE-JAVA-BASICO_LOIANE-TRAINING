package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		/*19. Fa�a um programa que calcule o mostre a m�dia aritm�tica de N notas.*/
		
		Scanner aux = new Scanner(System.in);
		
		double nota, media, soma = 0;
		int  qtdNota;
		
		System.out.println("Quantas notas deseja informar?");
		qtdNota = aux.nextInt();
		
		for (int i=0; i<qtdNota; i++) {
			System.out.println("Informe a "+(i+1)+"� nota");
			nota = aux.nextDouble();
			soma += nota; 
		}
		
		media = soma/qtdNota;
		
		System.out.println("A media das "+qtdNota+" notas informadas � "+media);
		
	}

}
