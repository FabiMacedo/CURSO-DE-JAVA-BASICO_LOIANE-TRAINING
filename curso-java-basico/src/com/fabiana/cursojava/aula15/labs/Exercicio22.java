 package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		/*22.Uma fruteira está vendendo frutas com a seguinte tabela de preços: 
		            Até 5 Kg       Acima de 5 Kg 
		Morango   R$ 2,50 por Kg   R$ 2,20 por Kg 
		Maçã      R$ 1,80 por Kg   R$ 1,50 por Kg
		Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
		receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos 
		e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.*/
		
		Scanner aux = new Scanner(System.in);
		double total = 0, desconto = 0;
		int pesoFruta = 0;
		
		System.out.println("Informe o peso do Morango em Kg que deseja comprar:");
		int pesoMorango = aux.nextInt();
		
		System.out.println("Informe o peso de Maças em Kg que deseja comprar:");
		int pesoMaca = aux.nextInt();
		
		if (pesoMorango <= 5) {
			total = pesoMorango * 2.5;
		} else {
			total = pesoMorango * 2.2;
		}
		
		if (pesoMaca <= 5) {
			total = pesoMaca * 1.8;
		} else {
			total = pesoMaca * 1.5;
		}
			
		pesoFruta = pesoMaca + pesoMorango;
		
		if (pesoFruta >= 8 || total >= 25) {
			desconto = total * 0.1;
			total = total - desconto;
		}
		
		System.out.println("-------------------");
		System.out.println("       Status      ");
		System.out.println("Peso Kg: "+ pesoFruta);
		System.out.println("Desconto R$" + desconto);
		System.out.println("Total a pagar R$"+ total);
		
	}

}
