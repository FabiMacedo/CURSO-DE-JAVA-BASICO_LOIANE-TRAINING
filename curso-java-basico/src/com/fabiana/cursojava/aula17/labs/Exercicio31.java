package com.fabiana.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		/*31. Um funcion�rio de uma empresa recebe aumento salarial anualmente: Sabe-se que:
		Esse funcion�rio foi contratado em 1995, com sal�rio inicial de R$ 1.000,00;
		a. Em 1996 recebeu aumento de 1,5% sobre seu sal�rio inicial;
		b. A partir de 1997 (inclusive), os aumentos salariais sempre correspondem ao dobro do percentual do ano anterior. 
		Fa�a um programa que determine o sal�rio atual desse funcion�rio. Ap�s concluir isto, altere o programa permitindo 
		que o usu�rio digite o sal�rio inicial do funcion�rio.*/
		
		Scanner aux = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		double salario = 1000; //1995
		double percentAumento = 0.015; //1996
		
		salario += (salario * percentAumento); //1996
		
		System.out.println("Em 1996 o sal�rio sofreu um aumento de "+percentAumento+"% e passou a ser de R$"+format.format(salario));
		
		for (int i=1997; i<=2015; i++ ) {
			percentAumento *= 2;
			salario += (salario * percentAumento);
			System.out.println("A partir de "+i+" o sal�rio sofreu um aumento de "+percentAumento+"% e passou a ser de R$"+format.format(salario));
		} 

	}

}
