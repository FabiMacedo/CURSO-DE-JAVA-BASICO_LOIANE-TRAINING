package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		/*23.O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira: 
		             Até 5 Kg           Acima de 5 Kg 
		File Duplo   R$ 4,90 por Kg     R$ 5,80 por Kg 
		Alcatra      R$ 5,90 por Kg     R$ 6,80 por Kg 
		Picanha      R$ 6,90 por Kg     R$ 7,80 por Kg
		Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, 
		porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara 
		o cliente receberá ainda um desconto de 5% sobre o total da compra. 
		Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, 
		contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e 
		valor a pagar.*/
		
		Scanner aux = new Scanner(System.in);
		double total = 0, desconto = 0;
		
		System.out.println("Escolha um tipo de carne:\nA - Alcatra | F - Filé Duplo | P - Picanha");
		String tipoCarne = aux.nextLine();
		
		System.out.println("Modo de pagamento: Cartão Tabajara: (S - Sim | N - Não)?");
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
			tipoCarne = "Filé Duplo";
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
			System.out.println("Tipo Inválido!");
		}

		
		if (pagCard.equalsIgnoreCase("S")) {
			desconto = total * 0.05;
			total = total - desconto;
			
		} else if (pagCard.equalsIgnoreCase("N")) {
			total = total - desconto;
			
		} else {
			System.out.println("Opção Inválida");
		}
		
		System.out.println("Status");
		System.out.println("Tipo de carne: "+ tipoCarne);
		System.out.println("Peso Kg: " + peso);
		System.out.println("Desconto Cartão Tabajara R$" + desconto);
		System.out.println("Total a pagar R$" + total);
		
	}
	
}
