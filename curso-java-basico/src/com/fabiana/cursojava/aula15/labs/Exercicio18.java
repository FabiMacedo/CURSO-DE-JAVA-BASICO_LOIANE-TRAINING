package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		/*18.Fa�a um Programa que pe�a um n�mero inteiro e determine se ele � par ou �mpar. 
		Dica: utilize o operador m�dulo (resto da divis�o).*/
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro");
		int numero = aux.nextInt();
		
		if (numero%2==0) {
			System.out.println("O n�mero � par.");
		} else {
			System.out.println("O n�mero � impar.");
		}

	}

}
