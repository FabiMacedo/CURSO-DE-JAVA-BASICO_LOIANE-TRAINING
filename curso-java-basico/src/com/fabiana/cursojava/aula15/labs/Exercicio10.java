package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*10. Fa�a um Programa que pergunte em que turno voc� estuda. 
		 Pe�a para digitar M - matutino ou V - Vespertino ou N - Noturno. 
		 Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inv�lido!", conforme o caso.*/
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Qual turno voc� estuda?");
		System.out.println("Escolha: M para matutino, V para vespertino ou N para noturno");
		String turno = aux.nextLine();
		
		switch (turno) {
		case "M":
		case "m":
			System.out.println("Bom Dia!");
		break;
		case "V":
		case "v":
			System.out.println("Boa Tarde!");
		break;
		case "N":
		case "n":
			System.out.println("Boa Noite!");
		break;
		default: 
			System.out.println("Op��o Inv�lida!");
		}

	}

}
