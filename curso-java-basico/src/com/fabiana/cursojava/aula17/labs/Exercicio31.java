package com.fabiana.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		/*31. Um funcionário de uma empresa recebe aumento salarial anualmente: Sabe-se que:
		Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
		a. Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
		b. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior. 
		Faça um programa que determine o salário atual desse funcionário. Após concluir isto, altere o programa permitindo 
		que o usuário digite o salário inicial do funcionário.*/
		
		Scanner aux = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		double salario = 1000; //1995
		double percentAumento = 0.015; //1996
		
		salario += (salario * percentAumento); //1996
		
		System.out.println("Em 1996 o salário sofreu um aumento de "+percentAumento+"% e passou a ser de R$"+format.format(salario));
		
		for (int i=1997; i<=2015; i++ ) {
			percentAumento *= 2;
			salario += (salario * percentAumento);
			System.out.println("A partir de "+i+" o salário sofreu um aumento de "+percentAumento+"% e passou a ser de R$"+format.format(salario));
		} 

	}

}
