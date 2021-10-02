package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		/*29. Encontrar n�meros primos � uma tarefa dif�cil. Fa�a um programa que gera uma lista dos n�meros primos existentes 
		entre 1 e um n�mero inteiro informado pelo usu�rio.*/
		
		Scanner aux = new Scanner(System.in);
		
		int num;
		boolean primo = true;
		String output;
		
		System.out.println("Digite at� que n�mero deseja encontrar n�meros primos de 1 at�?:");
		num = aux.nextInt();
						
		for (int i=1; i<=num; i++) {
			primo = true;
			
			for (int j=2; j<i; j++) {
				if(i%j==0) {
					//System.out.println("N�o � um n�mero primo - � divis�vel por "+i);
					primo = false;
				}
			}
			
			if (primo) {
				System.out.println(i);
				
			}
			
		}
		
	}

}
