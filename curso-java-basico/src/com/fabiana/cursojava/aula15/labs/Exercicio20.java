package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		/*20.Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
		a. "Telefonou para a vítima?"
		b. "Esteve no local do crime?"
		c. "Mora perto da vítima?"
		d. "Devia para a vítima?"
		e. "Já trabalhou com a vítima?" 
		O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
		Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", 
		entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".*/
		
		Scanner aux = new Scanner(System.in);
	
		int verdadeiro = 0;
		String classificacao = null;
		
		System.out.println("Sistema de investição criminal.\nResponda as perguntas abaixo com: Sim - S | Não - N");
		System.out.println("Você telefonou para a vítima?");
		String resp = aux.nextLine();
		if (resp.equalsIgnoreCase("S")) {
			verdadeiro += + 1;
		}
		
		System.out.println("Você esteve no local do crime?");
		String resp2 = aux.nextLine();
		if (resp2.equalsIgnoreCase("S")) {
			verdadeiro += + 1;
		}
		
		System.out.println("Você mora perto da vítima?");
		String resp3 = aux.nextLine();
		if (resp3.equalsIgnoreCase("S")) {
			verdadeiro += + 1;
		}
		
		System.out.println("Você devia para a vítima?");
		String resp4 = aux.nextLine();
		if (resp4.equalsIgnoreCase("S")) {
			verdadeiro += + 1;
		}
		
		System.out.println("Você já trabalhou com a vítima?");
		String resp5 = aux.nextLine();
		if (resp5.equalsIgnoreCase("S")) {
			verdadeiro += + 1;
		}
		
		System.out.println("Status da Classificação:");
		
		if (verdadeiro == 2) {
			System.out.println("Você é considerado Suspeito do crime");
			
		} else if (verdadeiro == 3 || verdadeiro == 4) {
			System.out.println("Você é considerado Cúmplice do crime");
			
		} else if (verdadeiro == 5) {
			System.out.println("Você é considerado Culpado do crime");
			
		} else {
			System.out.println("Você é considerado Inocente");
		}
		
	}

}
