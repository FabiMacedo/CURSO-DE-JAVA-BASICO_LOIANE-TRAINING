package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		/*28. Os n�meros primos possuem v�rias aplica��es dentro da Computa��o, por exemplo na Criptografia. 
		Um n�mero primo � aquele que � divis�vel apenas por um e por ele mesmo. Fa�a um programa que pe�a um n�mero inteiro 
		e determine se ele � ou n�o um n�mero primo.*/
		
		Scanner aux = new Scanner(System.in);
		
		int num;
		boolean primo = true;
		
		System.out.println("Digite um n�mero:");
		num = aux.nextInt();
		
		for (int i=2; i<num; i++) {
			if(num%i==0) {
				System.out.println("N�o � um n�mero primo - � divis�vel por "+i);
				primo = false;
			}
		}
		
		if (primo) {
			System.out.println(num+" � um n�mero primo.");
		}


	}

}
