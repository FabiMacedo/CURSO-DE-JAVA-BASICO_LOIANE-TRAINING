package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*12. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
		O usuário deve informar de qual número ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo: 
		Tabuada de 5: 5 X 1 = 5 5 X 2 = 10 ... 5 X 10 = 50*/ 
		
		Scanner aux = new Scanner(System.in);
		
		boolean valido = false;
		int num;
		
		do {
			System.out.println("Digite um número inteiro entre 1 e 10");
			num = aux.nextInt();
			if (num <= 0 || num > 10) {
				System.out.println("Informe um número válido");
			} else {
				System.out.println("Tabuada do "+num);
				
				for (int i=1; i<=10; i++) {
					System.out.println(num+" x "+i+" = "+(num*i));
				}
			
			valido = true;
			}
		} while (valido == false);

	}

}
