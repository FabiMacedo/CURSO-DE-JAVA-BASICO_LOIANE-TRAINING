package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		/*15. Fa�a um Programa que pergunte quanto voc� ganha por hora e o
		n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
		sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o
		Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um
		programa que nos d�:
		. sal�rio bruto.
		a. quanto pagou ao INSS.
		b. quanto pagou ao sindicato.
		c. o sal�rio l�quido.
		d. calcule os descontos e o sal�rio l�quido, conforme a tabela
		abaixo:
		+ Sal�rio Bruto : R$ - IR (11%) : R$ - INSS
		(8%) : R$ - Sindicato ( 5%) : R$ = Sal�rio
		Liquido : R$
		Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido.*/
		
		Scanner aux = new Scanner(System.in);
				
		System.out.println("Informe o valor recebido por hora: ");
		double salHora = aux.nextDouble();
		System.out.println("Informe o n�mero de horas trabalhadas no m�s: ");
		double horaTrab = aux.nextDouble();
		
		double salBruto = salHora * horaTrab;
		double ir = salBruto * (0.11);
		double inss = salBruto * (0.08);
		double sindicato = salBruto * (0.05);
		double salLiq = salBruto - ir - inss - sindicato;
		
		System.out.println("Status Salarial");
		System.out.println("Sal�rio bruto: R$" + salBruto);
		System.out.println("Desconto Imposto de Renda: R$" + ir);
		System.out.println("Desconto INSS: R$" + inss);
		System.out.println("Desconto Sindicato: R$" + sindicato);
		System.out.println("Sal�rio l�quido: R$" + salLiq);
		
	}

}
