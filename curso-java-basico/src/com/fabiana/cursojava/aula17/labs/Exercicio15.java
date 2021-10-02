package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		/*15. A s�rie de Fibonacci � formada pela sequ�ncia 1,1,2,3,5,8,13,21,34,55... 
		 * Fa�a um programa capaz de gerar a s�rie at� o en�simo termo.*/
		
		Scanner aux = new Scanner(System.in);
		
		int n;
		int primeiro=1;
		int segundo=1;
		int proximo = 0;
		
		System.out.println("Sistema gerador da s�rie de Fibonacci");
		System.out.println("Entre com o n-�simo termo da s�rie de Fibonacci:");
		n = aux.nextInt();
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		if (n==1 || n==2) {
			System.out.println("O termo digitado � "+n+", n�o � poss�vel continuar.");
		} else {
			for (int i=3; i<=n; i++) {
				proximo = primeiro + segundo;
				primeiro = segundo;
				segundo = proximo;
				
				System.out.println(proximo);
			}
		}
		
	}

}
