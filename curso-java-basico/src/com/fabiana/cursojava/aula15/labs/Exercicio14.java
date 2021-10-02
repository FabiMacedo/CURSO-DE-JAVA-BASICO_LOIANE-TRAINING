package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/*
		 * 14. Faça um programa que lê as duas notas parciais obtidas por um aluno numa
		 * disciplina ao longo de um semestre, e calcule a sua média. A atribuição de
		 * conceitos obedece à tabela abaixo: Média de Aproveitamento Conceito Entre 9.0
		 * e 10.0 A Entre 7.5 e 9.0 B Entre 6.0 e 7.5 C Entre 4.0 e 6.0 D Entre 4.0 e
		 * zero E O algoritmo deve mostrar na tela as notas, a média, o conceito
		 * correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou
		 * “REPROVADO” se o conceito for D ou E.
		 */

		Scanner aux = new Scanner(System.in);
		String conceito = null;

		System.out.println("Informe a primeira nota");
		double nota1 = aux.nextDouble();

		System.out.println("Informe a segunda nota");
		double nota2 = aux.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media < 4) {
			conceito = "E";
		} else if (media >= 4 && media < 6) {
			conceito = "D";
		} else if (media >= 6 && media < 7.5) {
			conceito = "C";
		} else if (media >= 7.5 && media < 9) {
			conceito = "B";
		} else if (media >= 9 && media <= 10) {
			conceito = "A";
		}

		System.out.println("Status do aluno");
		System.out.println("Primeira nota: " + nota1);
		System.out.println("Segunda nota: " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);

		switch (conceito) {
		case "A":
		case "B":
		case "C":
			System.out.println("Você foi Aprovado");
			break;
		case "D":
		case "E":
			System.out.println("Você foi Reprovado");
			break;
		}

	}

}
