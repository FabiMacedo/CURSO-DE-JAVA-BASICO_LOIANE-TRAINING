package com.fabiana.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {

		Scanner aux = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero");
		int num = aux.nextInt();
		
		System.out.println("Entre com um limite");
		int max = aux.nextInt();
		
		for (int i=num; i<=max; i++) {
			
			//Quando o primeiro valor verdadeiro for encontrado, 
			//o for deixa de ser executado
			if (i%7 == 0) {
				System.out.println("O valor de i � "+i);
				break;
			
			}
			
		}

	}

}
