package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		/*21.Um posto está vendendo combustíveis com a seguinte tabela de descontos:
		Álcool:
		a. até 20 litros, desconto de 3% por litro
		b. acima de 20 litros, desconto de 5% por litro
		Gasolina:
		c. até 20 litros, desconto de 4% por litro
		d. acima de 20 litros, desconto de 6% por litro 
		Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível 
		(codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente 
		sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.*/
		
		Scanner aux = new Scanner(System.in);
		
		double total = 0, desconto = 0, preco = 0;
		double alcool = 1.9, gasolina = 2.5;
		
		System.out.println("Sistema de abastecimento");
		System.out.println("Informe o combustível desejado: Álcool - A | Gasolina - G");
		String combustivel = aux.nextLine();
		
		System.out.println("Informe a quantidade de litros");
		double qdeLitro = aux.nextDouble();
		
		if (combustivel.equalsIgnoreCase("a")) {
			combustivel = "Álcool";
			if (qdeLitro <= 20) {
				preco = alcool * qdeLitro;
				desconto = preco * 0.03;
				total = preco - desconto;
				
			} else {
				preco = alcool * qdeLitro;
				desconto = preco * 0.05;
				total = preco - desconto;
			}
			
		} else if (combustivel.equalsIgnoreCase("g")) {
			combustivel = "Gasolina";
			if (qdeLitro <= 20) {
				preco = gasolina * qdeLitro;
				desconto = preco * 0.04;
				total = preco - desconto;
				
			} else {
				preco = gasolina * qdeLitro;
				desconto = preco * 0.06;
				total = preco - desconto;
			}
			
		} else {
			System.out.println("Opção inválida!");
		}
		
		System.out.println("Status");
		System.out.println("Tipo de combustível: "+ combustivel);
		System.out.println("Preço original R$"+ preco);
		System.out.println("Quantidade de litros: "+ qdeLitro);
		System.out.println("Desconto R$"+ desconto);
		System.out.println("Total a pagar R$"+ total);

	}

}
