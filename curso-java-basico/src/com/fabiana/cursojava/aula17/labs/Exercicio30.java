package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		/*30. Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário, 
		mas a tabuada não deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final deve ser informado 
		também pelo usuário, conforme exemplo abaixo:
		Montar a tabuada de: 5 
		Começar por: 4 
		Terminar em: 7 
		Vou montar a tabuada de 5 começando em 4 e terminando em 7: 
		5 X 4 = 20 
		5 X 5 = 25 
		5 X 6 = 30 
		5 X 7 = 35
		Obs.: Você deve verificar se o usuário não digitou o final menor que o inicial.*/

		Scanner aux = new Scanner(System.in);
		
		boolean valido = false;
		int num;
		int valorInicial;
		int valorFinal;
		
		
		do {
			System.out.println("Digite um número inteiro entre 1 e 10 para gerar uma tabuada");
			num = aux.nextInt();
			
			if (num <= 0 || num > 10) {
				System.out.println("Informe um número válido");	
			} else {
				do {
					System.out.println("Agora digite um número para começar:");
					valorInicial = aux.nextInt();
					
					System.out.println("Agora digite um número para terminar:");
					valorFinal = aux.nextInt();
					
					if (valorFinal <= valorInicial) {
						System.out.println("O valor final não pode ser menor que o valor inicial.\nTente novamente!");
						
					} else {
						System.out.println("Vou montar a tabuada do "+num+" começando em "+valorInicial+" e terminando em "+valorFinal);
						for (int i=valorInicial; i<=valorFinal; i++) {
							System.out.println(num+" x "+i+" = "+(num*i));
						}
					
					valido = true;
					}
				} while (valido == false);
			}
			
		} while (valido == false);

	}

}
