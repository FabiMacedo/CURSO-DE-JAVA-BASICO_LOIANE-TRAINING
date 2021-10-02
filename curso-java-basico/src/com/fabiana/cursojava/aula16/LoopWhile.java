package com.fabiana.cursojava.aula16;

public class LoopWhile {

	public static void main(String[] args) {
		
		int i = 0;
		int max = 10;
		System.out.println("Contando até "+max);
		
		//Enquanto: primeiro avalia a expressão 
		//e se for verdadeira, executa o bloco
		while (i <= max) {
			System.out.println("Valor de i: "+i);
			i++; //i = i + 1; ou i += 1;
		}
		
		System.out.println(i); //valor 11
		
		//Faça enquanto: primeiro executa o bloco 
		//depois avalia a expressão 
		do {
			i++;
			System.out.println("Valor de i: "+i);
			
		} while (i < 15);
		
		System.out.println(i);
		
	}

}
