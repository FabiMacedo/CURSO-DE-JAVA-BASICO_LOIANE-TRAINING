package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*8. Fa�a um Programa que pergunte quanto voc� ganha por hora e o
		n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
		sal�rio no referido m�s.*/
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Informe o valor recebido por hora: ");
		double salHora = aux.nextDouble();
		
		System.out.println("Informe o n�mero de horas trabalhadas no m�s: ");
		double horaTrab = aux.nextDouble();
		
		double salTotal = salHora * horaTrab;
		
		System.out.println("O sal�rio mensal � R$" + salTotal);
		
	}

}
