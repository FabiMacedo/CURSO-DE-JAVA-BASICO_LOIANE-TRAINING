package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*12. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10. 
		O usu�rio deve informar de qual n�mero ele deseja ver a tabuada. A sa�da deve ser conforme o exemplo abaixo: 
		Tabuada de 5: 5 X 1 = 5 5 X 2 = 10 ... 5 X 10 = 50*/ 
		
		Scanner aux = new Scanner(System.in);
		
		boolean valido = false;
		int num;
		
		do {
			System.out.println("Digite um n�mero inteiro entre 1 e 10");
			num = aux.nextInt();
			if (num <= 0 || num > 10) {
				System.out.println("Informe um n�mero v�lido");
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
