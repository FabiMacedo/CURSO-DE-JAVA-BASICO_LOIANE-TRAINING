package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		/*30. Desenvolva um programa que fa�a a tabuada de um n�mero qualquer inteiro que ser� digitado pelo usu�rio, 
		mas a tabuada n�o deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final deve ser informado 
		tamb�m pelo usu�rio, conforme exemplo abaixo:
		Montar a tabuada de: 5 
		Come�ar por: 4 
		Terminar em: 7 
		Vou montar a tabuada de 5 come�ando em 4 e terminando em 7: 
		5 X 4 = 20 
		5 X 5 = 25 
		5 X 6 = 30 
		5 X 7 = 35
		Obs.: Voc� deve verificar se o usu�rio n�o digitou o final menor que o inicial.*/

		Scanner aux = new Scanner(System.in);
		
		boolean valido = false;
		int num;
		int valorInicial;
		int valorFinal;
		
		
		do {
			System.out.println("Digite um n�mero inteiro entre 1 e 10 para gerar uma tabuada");
			num = aux.nextInt();
			
			if (num <= 0 || num > 10) {
				System.out.println("Informe um n�mero v�lido");	
			} else {
				do {
					System.out.println("Agora digite um n�mero para come�ar:");
					valorInicial = aux.nextInt();
					
					System.out.println("Agora digite um n�mero para terminar:");
					valorFinal = aux.nextInt();
					
					if (valorFinal <= valorInicial) {
						System.out.println("O valor final n�o pode ser menor que o valor inicial.\nTente novamente!");
						
					} else {
						System.out.println("Vou montar a tabuada do "+num+" come�ando em "+valorInicial+" e terminando em "+valorFinal);
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
