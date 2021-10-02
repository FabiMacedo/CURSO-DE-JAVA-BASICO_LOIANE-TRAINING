package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*11. As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores e lhe 
		 contrataram para desenvolver o programa que calcular� os reajustes.
		� Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte crit�rio, 
		baseado no sal�rio atual:
		� sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
		� sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
		� sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		� sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o aumento ser realizado, informe na tela:
		� o sal�rio antes do reajuste;
		� o percentual de aumento aplicado;
		� o valor do aumento;
		� o novo sal�rio, ap�s o aumento.*/
		
		Scanner aux = new Scanner(System.in);
		double novoSalario, percent, aumento;  
		
		System.out.println("Sistema de reajuste de sal�rios");
		System.out.println("Informe o seu sal�rio atual");
		double salario = aux.nextDouble();
		
		if (salario <= 280) {
			percent = 0.2;
			aumento = salario * percent;
			novoSalario = salario + aumento;
			
		} else if (salario > 280 && salario<= 700) {
			percent = 0.15;
			aumento = salario * percent;
			novoSalario = salario + aumento;
			
		} else if (salario > 700 && salario<= 1500) {
			percent = 0.1;
			aumento = salario * percent;
			novoSalario = salario + aumento;
			
		} else {
			percent = 0.05;
			aumento = salario * percent;
			novoSalario = salario + aumento;
			
		}
		
		System.out.println("*** Status do reajuste salarial ***");
		System.out.println("Valor do sal�rio R$" + salario);
		System.out.println("Valor do percentual aplicado: " + (percent * 100) + "%");
		System.out.println("Valor do aumento R$" + aumento);
		System.out.println("Valor do novo sal�rio R$" + novoSalario);

	}

}
