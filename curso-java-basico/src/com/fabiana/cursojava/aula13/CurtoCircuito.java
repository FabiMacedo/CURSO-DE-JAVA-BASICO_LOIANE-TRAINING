package com.fabiana.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		/*A diferen�a est� na execu��o:
		& - Se o resultado da primeira express�o for falso, 
		o java compara com a outra express�o
		&& - Se o resultado da primeira express�o for falso,
		o java n�o realiza a compara��o com a outra express�o 
		pois j� entende que o resultado ser� falso
		*/ 
		boolean resultado1 = falso & verdadeiro;
		boolean resultado2 = falso && verdadeiro;
		System.out.println(resultado1);
		System.out.println(resultado2);
		

	}

}
