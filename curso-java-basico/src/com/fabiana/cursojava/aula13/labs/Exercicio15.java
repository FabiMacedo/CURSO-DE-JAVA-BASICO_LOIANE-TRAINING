package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		/*15. Faça um Programa que pergunte quanto você ganha por hora e o
		número de horas trabalhadas no mês. Calcule e mostre o total do seu
		salário no referido mês, sabendo-se que são descontados 11% para o
		Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
		programa que nos dê:
		. salário bruto.
		a. quanto pagou ao INSS.
		b. quanto pagou ao sindicato.
		c. o salário líquido.
		d. calcule os descontos e o salário líquido, conforme a tabela
		abaixo:
		+ Salário Bruto : R$ - IR (11%) : R$ - INSS
		(8%) : R$ - Sindicato ( 5%) : R$ = Salário
		Liquido : R$
		Obs.: Salário Bruto - Descontos = Salário Líquido.*/
		
		Scanner aux = new Scanner(System.in);
				
		System.out.println("Informe o valor recebido por hora: ");
		double salHora = aux.nextDouble();
		System.out.println("Informe o número de horas trabalhadas no mês: ");
		double horaTrab = aux.nextDouble();
		
		double salBruto = salHora * horaTrab;
		double ir = salBruto * (0.11);
		double inss = salBruto * (0.08);
		double sindicato = salBruto * (0.05);
		double salLiq = salBruto - ir - inss - sindicato;
		
		System.out.println("Status Salarial");
		System.out.println("Salário bruto: R$" + salBruto);
		System.out.println("Desconto Imposto de Renda: R$" + ir);
		System.out.println("Desconto INSS: R$" + inss);
		System.out.println("Desconto Sindicato: R$" + sindicato);
		System.out.println("Salário líquido: R$" + salLiq);
		
	}

}
