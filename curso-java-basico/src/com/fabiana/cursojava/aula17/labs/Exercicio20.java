package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		/*20. Faça um programa que peça para n pessoas a sua idade, ao final o programa deverá verificar se a 
		média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, 
		adulta ou idosa, conforme a média calculada.*/
		
		Scanner aux = new Scanner(System.in);
		
		double idade, media, soma = 0;
		int  qtdPessoas;
		
		System.out.println("Quantas pessoas desejam informar a idade?");
		qtdPessoas = aux.nextInt();
		
		for (int i=0; i<qtdPessoas; i++) {
			System.out.println("Informe a idade da "+(i+1)+"ª pessoa");
			idade = aux.nextDouble();
			soma += idade;  
		}
		
		media = soma/qtdPessoas;
		
		System.out.println("A media da idade das "+qtdPessoas+" pessoas é "+media);
		
		if (media >=0 && media <= 25) {
			System.out.println("A turma é jovem!");
		} else if (media > 25 && media <= 60) {
			System.out.println("A turma é adulta!");
		} else {
			System.out.println("A turma é idosa!");
		}
		

	}

}
