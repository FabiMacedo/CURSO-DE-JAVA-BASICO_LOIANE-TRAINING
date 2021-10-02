package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/*
		 * 13. Faça um Programa que leia um número e exiba o dia correspondente da
		 * semana. (1-Domingo, 2- Segunda etc.), se digitar outro valor deve aparecer
		 * valor inválido.
		 */

		Scanner aux = new Scanner(System.in);
		System.out.println("Entre com um dia da semana (1-7)");
		int diaSemana = aux.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Escolha um dia válido");
		}

	}

}
