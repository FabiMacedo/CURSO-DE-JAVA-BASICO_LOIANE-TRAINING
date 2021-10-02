package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		/*18. Faça um programa que peça o tamanho de um arquivo para download
		(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
		informe o tempo aproximado de download do arquivo usando este link
		(em minutos).*/ 
		
		Scanner aux = new Scanner(System.in);
		System.out.println();
		
		System.out.println("Informe o tamanho do arquivo em (MB)");
		double tamArquivo = aux.nextDouble();
		
		System.out.println("Informe a velocidade da internet (em Mbps)");
		double velocidade = aux.nextDouble();
		
		double tempoDown = tamArquivo / velocidade;
		System.out.println("O tempo para download é de " + tempoDown);
		
	}

}
