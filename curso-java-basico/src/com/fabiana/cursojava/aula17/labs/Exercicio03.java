package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*3. Faça um programa que leia e valide as seguintes informações:
		a. Nome: maior que 3 caracteres;
		b. Idade: entre 0 e 150;
		c. Salário: maior que zero;
		d. Sexo: 'f' ou 'm';
		e. Estado Civil: 's', 'c', 'v', 'd';*/
		
		Scanner aux = new Scanner(System.in);
		
		String nome = null;
		String sexo = null;
		String estadoCivil = null;
		int idade = 0;
		double salario = 0;
		boolean infoValida = false;
		
		do {
			System.out.println("Digite seu nome (no mínimo 4 letras):");
			nome = aux.next();
			if (nome.length() <= 3) {
				System.out.println("Por favor, informe o nome com mais de 3 letras!");
				
			} else {
				infoValida = true;
			}
		} while (!infoValida);
		
		//reutilização da variável (flag) infoValida
		infoValida = false;
		
		do {
			System.out.println("Digite sua idade:");
			idade = aux.nextInt();
			if (idade < 0 || idade > 150) {
				System.out.println("Voce deve ter entre 0 e 150 anos!");
				
			} else {
				infoValida = true;
			}
			
		} while (!infoValida);
			
		infoValida = false;	
		
		do {
			System.out.println("Digite seu salário:");
			salario = aux.nextDouble();
			if (salario < 0) {
				System.out.println("Informe um salário válido!");
				
			} else {
				infoValida = true;
			}
			
		} while (!infoValida);
		
		infoValida = false;	
		
		do {	
			System.out.println("Digite seu sexo:\nF para Feminino | M para Masculino");
			sexo = aux.next();
			if (!(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M"))) {
				System.out.println("Escolha um dos sexos válidos!");
			} else {
				infoValida = true;
			}
		} while (!infoValida);
		
		infoValida = false;	
		
		do {
			System.out.println("Digite seu estado civil:\nC - Casado(a) | S - Solteiro(a) | V - Viúvo(a) | D - Divorciado(a)");
			estadoCivil = aux.next();
			if (!(estadoCivil.equalsIgnoreCase("C") || estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D"))) {
				System.out.println("Escolha um estado civil válido!"); 
			} else {
				infoValida = true;
			}
		} while (!infoValida);	
		
		System.out.println("Informações Coletadas:");
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Sexo: "+sexo);
		System.out.println("Estado Civil: "+estadoCivil);
		System.out.println("Salário: "+salario);
		
	}

}
