package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		/*20. Fa�a um programa que pe�a para n pessoas a sua idade, ao final o programa dever� verificar se a 
		m�dia de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e ent�o, dizer se a turma � jovem, 
		adulta ou idosa, conforme a m�dia calculada.*/
		
		Scanner aux = new Scanner(System.in);
		
		double idade, media, soma = 0;
		int  qtdPessoas;
		
		System.out.println("Quantas pessoas desejam informar a idade?");
		qtdPessoas = aux.nextInt();
		
		for (int i=0; i<qtdPessoas; i++) {
			System.out.println("Informe a idade da "+(i+1)+"� pessoa");
			idade = aux.nextDouble();
			soma += idade;  
		}
		
		media = soma/qtdPessoas;
		
		System.out.println("A media da idade das "+qtdPessoas+" pessoas � "+media);
		
		if (media >=0 && media <= 25) {
			System.out.println("A turma � jovem!");
		} else if (media > 25 && media <= 60) {
			System.out.println("A turma � adulta!");
		} else {
			System.out.println("A turma � idosa!");
		}
		

	}

}
