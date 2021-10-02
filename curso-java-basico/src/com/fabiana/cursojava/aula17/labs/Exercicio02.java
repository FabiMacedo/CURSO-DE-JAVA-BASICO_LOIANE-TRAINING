package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha igual ao nome do usu�rio, 
		 mostrando uma mensagem de erro e voltando a pedir as informa��es.*/
		
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
				System.out.println("Informa��o v�lida!\nLogin efetuado com sucesso!");
			}
			
		} while (!infoValida);
		
		
		
	}

}
