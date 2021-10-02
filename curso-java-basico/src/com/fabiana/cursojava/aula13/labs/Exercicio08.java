package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*8. Faça um Programa que pergunte quanto você ganha por hora e o
		número de horas trabalhadas no mês. Calcule e mostre o total do seu
		salário no referido mês.*/
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Informe o valor recebido por hora: ");
		double salHora = aux.nextDouble();
		
		System.out.println("Informe o número de horas trabalhadas no mês: ");
		double horaTrab = aux.nextDouble();
		
		double salTotal = salHora * horaTrab;
		
		System.out.println("O salário mensal é R$" + salTotal);
		
	}

}
