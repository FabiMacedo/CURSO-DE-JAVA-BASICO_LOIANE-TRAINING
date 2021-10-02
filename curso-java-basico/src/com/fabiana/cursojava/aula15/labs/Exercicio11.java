package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*11. As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe 
		 contrataram para desenvolver o programa que calculará os reajustes.
		• Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, 
		baseado no salário atual:
		• salários até R$ 280,00 (incluindo) : aumento de 20%
		• salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
		• salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		• salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
		• o salário antes do reajuste;
		• o percentual de aumento aplicado;
		• o valor do aumento;
		• o novo salário, após o aumento.*/
		
		Scanner aux = new Scanner(System.in);
		double novoSalario, percent, aumento;  
		
		System.out.println("Sistema de reajuste de salários");
		System.out.println("Informe o seu salário atual");
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
		System.out.println("Valor do salário R$" + salario);
		System.out.println("Valor do percentual aplicado: " + (percent * 100) + "%");
		System.out.println("Valor do aumento R$" + aumento);
		System.out.println("Valor do novo salário R$" + novoSalario);

	}

}
