package com.fabiana.cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		/*A diferença está na execução:
		& - Se o resultado da primeira expressão for falso, 
		o java compara com a outra expressão
		&& - Se o resultado da primeira expressão for falso,
		o java não realiza a comparação com a outra expressão 
		pois já entende que o resultado será falso
		*/ 
		boolean resultado1 = falso & verdadeiro;
		boolean resultado2 = falso && verdadeiro;
		System.out.println(resultado1);
		System.out.println(resultado2);
		

	}

}
