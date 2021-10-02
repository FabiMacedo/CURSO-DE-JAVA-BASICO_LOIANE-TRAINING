package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, 
		 mostrando uma mensagem de erro e voltando a pedir as informações.*/
		
		Scanner aux = new Scanner(System.in);
		
		String nome = null;
		String senha = null;
		//flag
		boolean infoValida = false; 
		
		do {
			System.out.println("Insira o seu nome:");
			nome = aux.next();
			
			System.out.println("Insira sua senha: ");
			senha = aux.next();
			
			if (nome.equals(senha)) {
				System.out.println("Por favor, informe uma senha diferente do seu nome!");
				
			} else {
				infoValida = true;
				System.out.println("Informação válida!\nLogin efetuado com sucesso!");
			}
			
		} while (!infoValida);
		
		
		
	}

}
