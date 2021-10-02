package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*12. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, 
		 que depende do salário bruto (conforme tabela abaixo) e 
		 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). 
		 O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora
		 e a quantidade de horas trabalhadas no mês.
		• Desconto do IR:
		• Salário Bruto até 900 (inclusive) - isento
		• Salário Bruto até 1500 (inclusive) - desconto de 5%
		• Salário Bruto até 2500 (inclusive) - desconto de 10%
		• Salário Bruto acima de 2500 - desconto de 20% 
		Imprima na tela as informações, dispostas conforme o exemplo abaixo. 
		No exemplo o valor da hora é 5 e a quantidade de hora é 220. Salário Bruto: (5 * 220) : R$ 1100,00 (-) IR (5%) : R$ 55,00 
		(-) INSS ( 10%) : R$ 110,00 FGTS (11%) : R$ 121,00 Total de descontos : R$ 165,00 Salário Líquido : R$ 935,00*/

		Scanner aux = new Scanner(System.in);
		double salarioBruto, ir, inss, fgts, totalDesc, salarioLiq;  
		
		System.out.println("Sistema de Pagamento de Salário");
		System.out.println("Informe o valor do salário/hora");
		double salarioHora = aux.nextDouble();
		
		System.out.println("Informe a quantidade de hora trabalhada/mês");
		int horaMes = aux.nextInt();
		
		salarioBruto = salarioHora * horaMes;
		inss = salarioBruto * 0.1;
		fgts = salarioBruto * 0.11;
		
		if (salarioBruto <= 900) {
			ir = 0;
		} else if (salarioBruto <= 1500) {
			ir = salarioBruto * 0.05;
		} else if (salarioBruto <= 2500) {
			ir = salarioBruto * 0.1;
		} else {
			ir = salarioBruto * 0.2;
		}
		
		totalDesc = inss + ir;
		salarioLiq = salarioBruto - totalDesc;
		
		System.out.println("*** Status salarial ***");
		System.out.println("Salário Bruto R$" + salarioBruto);
		System.out.println("IR R$" + ir);
		System.out.println("INSS R$" + inss);
		System.out.println("FGTS R$" + fgts);
		System.out.println("Total dos descontos R$" + totalDesc);
		System.out.println("Salário Líquido R$" + salarioLiq);
		
		
	}

}
