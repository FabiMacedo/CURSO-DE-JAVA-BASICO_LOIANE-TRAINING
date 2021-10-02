package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		/*20.Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o:
		a. "Telefonou para a v�tima?"
		b. "Esteve no local do crime?"
		c. "Mora perto da v�tima?"
		d. "Devia para a v�tima?"
		e. "J� trabalhou com a v�tima?" 
		O programa deve no final emitir uma classifica��o sobre a participa��o da pessoa no crime. 
		Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita", 
		entre 3 e 4 como "C�mplice" e 5 como "Assassino". Caso contr�rio, ele ser� classificado como "Inocente".*/
		
		Scanner aux = new Scanner(System.in);
	
		int verdadeiro = 0;
		String classificacao = null;
		
		System.out.println("Sistema de investi��o criminal.\nResponda as perguntas abaixo com: Sim - S | N�o - N");
		System.out.println("Voc� telefonou para a v�tima?");
		String resp = aux.nextLine();
		if (resp.equalsIgnoreCase("S")) {
			verdadeiro += + 1;
		}
		
		System.out.println("Voc� esteve no local do crime?");
		String resp2 = aux.nextLine();
		if (resp2.equalsIgnoreCase("S")) {
			verdadeiro += + 1;
		}
		
		System.out.println("Voc� mora perto da v�tima?");
		String resp3 = aux.nextLine();
		if (resp3.equalsIgnoreCase("S")) {
			verdadeiro += + 1;
		}
		
		System.out.println("Voc� devia para a v�tima?");
		String resp4 = aux.nextLine();
		if (resp4.equalsIgnoreCase("S")) {
			verdadeiro += + 1;
		}
		
		System.out.println("Voc� j� trabalhou com a v�tima?");
		String resp5 = aux.nextLine();
		if (resp5.equalsIgnoreCase("S")) {
			verdadeiro += + 1;
		}
		
		System.out.println("Status da Classifica��o:");
		
		if (verdadeiro == 2) {
			System.out.println("Voc� � considerado Suspeito do crime");
			
		} else if (verdadeiro == 3 || verdadeiro == 4) {
			System.out.println("Voc� � considerado C�mplice do crime");
			
		} else if (verdadeiro == 5) {
			System.out.println("Voc� � considerado Culpado do crime");
			
		} else {
			System.out.println("Voc� � considerado Inocente");
		}
		
	}

}
