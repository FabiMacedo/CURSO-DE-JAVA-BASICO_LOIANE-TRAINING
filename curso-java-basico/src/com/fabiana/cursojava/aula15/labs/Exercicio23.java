package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		/*23.O Hipermercado Tabajara est� com uma promo��o de carnes que � imperd�vel. Confira: 
		             At� 5 Kg           Acima de 5 Kg 
		File Duplo   R$ 4,90 por Kg     R$ 5,80 por Kg 
		Alcatra      R$ 5,90 por Kg     R$ 6,80 por Kg 
		Picanha      R$ 6,90 por Kg     R$ 7,80 por Kg
		Para atender a todos os clientes, cada cliente poder� levar apenas um dos tipos de carne da promo��o, 
		por�m n�o h� limites para a quantidade de carne por cliente. Se compra for feita no cart�o Tabajara 
		o cliente receber� ainda um desconto de 5% sobre o total da compra. 
		Escreva um programa que pe�a o tipo e a quantidade de carne comprada pelo usu�rio e gere um cupom fiscal, 
		contendo as informa��es da compra: tipo e quantidade de carne, pre�o total, tipo de pagamento, valor do desconto e 
		valor a pagar.*/
		
		Scanner aux = new Scanner(System.in);
		double total = 0, desconto = 0;
		
		System.out.println("Escolha um tipo de carne:\nA - Alcatra | F - Fil� Duplo | P - Picanha");
		String tipoCarne = aux.nextLine();
		
		System.out.println("Modo de pagamento: Cart�o Tabajara: (S - Sim | N - N�o)?");
		String pagCard = aux.nextLine();
		
		System.out.println("Quantos quilos deseja comprar?");
		double peso = aux.nextDouble();
				
		if (tipoCarne.equalsIgnoreCase("A")) {
			tipoCarne = "Alcatra";
			if (peso <= 5) {
				total = 5.90 * peso;
			} else {
				total = 6.80 * peso;
			}
			
		} else if (tipoCarne.equalsIgnoreCase("F")) {
			tipoCarne = "Fil� Duplo";
			if (peso <= 5) {
				total = 4.90 * peso;
			} else {
				total = 5.80 * peso;
			}
			
		} else if (tipoCarne.equalsIgnoreCase("P")) {
			tipoCarne = "Picanha";
			if (peso <= 5) {
				total = 6.90 * peso;
			} else {
				total = 7.80 * peso;
			}
			
		} else {
			System.out.println("Tipo Inv�lido!");
		}

		
		if (pagCard.equalsIgnoreCase("S")) {
			desconto = total * 0.05;
			total = total - desconto;
			
		} else if (pagCard.equalsIgnoreCase("N")) {
			total = total - desconto;
			
		} else {
			System.out.println("Op��o Inv�lida");
		}
		
		System.out.println("Status");
		System.out.println("Tipo de carne: "+ tipoCarne);
		System.out.println("Peso Kg: " + peso);
		System.out.println("Desconto Cart�o Tabajara R$" + desconto);
		System.out.println("Total a pagar R$" + total);
		
	}
	
}
