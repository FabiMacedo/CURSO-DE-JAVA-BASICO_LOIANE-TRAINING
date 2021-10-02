package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*12. Fa�a um programa para o c�lculo de uma folha de pagamento, sabendo que os descontos s�o do Imposto de Renda, 
		 que depende do sal�rio bruto (conforme tabela abaixo) e 
		 3% para o Sindicato e que o FGTS corresponde a 11% do Sal�rio Bruto, mas n�o � descontado (� a empresa que deposita). 
		 O Sal�rio L�quido corresponde ao Sal�rio Bruto menos os descontos. O programa dever� pedir ao usu�rio o valor da sua hora
		 e a quantidade de horas trabalhadas no m�s.
		� Desconto do IR:
		� Sal�rio Bruto at� 900 (inclusive) - isento
		� Sal�rio Bruto at� 1500 (inclusive) - desconto de 5%
		� Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
		� Sal�rio Bruto acima de 2500 - desconto de 20% 
		Imprima na tela as informa��es, dispostas conforme o exemplo abaixo. 
		No exemplo o valor da hora � 5 e a quantidade de hora � 220. Sal�rio Bruto: (5 * 220) : R$ 1100,00 (-) IR (5%) : R$ 55,00 
		(-) INSS ( 10%) : R$ 110,00 FGTS (11%) : R$ 121,00 Total de descontos : R$ 165,00 Sal�rio L�quido : R$ 935,00*/

		Scanner aux = new Scanner(System.in);
		double salarioBruto, ir, inss, fgts, totalDesc, salarioLiq;  
		
		System.out.println("Sistema de Pagamento de Sal�rio");
		System.out.println("Informe o valor do sal�rio/hora");
		double salarioHora = aux.nextDouble();
		
		System.out.println("Informe a quantidade de hora trabalhada/m�s");
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
		System.out.println("Sal�rio Bruto R$" + salarioBruto);
		System.out.println("IR R$" + ir);
		System.out.println("INSS R$" + inss);
		System.out.println("FGTS R$" + fgts);
		System.out.println("Total dos descontos R$" + totalDesc);
		System.out.println("Sal�rio L�quido R$" + salarioLiq);
		
		
	}

}
