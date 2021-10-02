package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		/*32. O cardápio de uma lanchonete é o seguinte: 
		Especificação    Código  Preço 
		Cachorro-Quente  100     R$ 1,20 
		Bauru Simples    101     R$ 1,30 
		Bauru com ovo    102     R$ 1,50 
		Hambúrguer       103     R$ 1,20 
		Cheeseburguer    104     R$ 1,30 
		Refrigerante     105     R$ 1,00
		Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e mostre o valor a ser pago 
		por item (preço * quantidade) e o total geral do pedido. Considere que o cliente deve informar quando o pedido deve 
		ser encerrado.*/
		
		Scanner aux = new Scanner(System.in);
		
		int codItem;
		int quantidade;
		double total = 0;
		double preco;
		boolean sair = false;
		String output = "";
		
		System.out.println(""
				+ "Cardápio \r\n"
				+ "Especificação    Código  Preço \r\n"
				+ "Cachorro-Quente  100     R$ 1,20 \r\n"
				+ "Bauru Simples    101     R$ 1,30 \r\n"
				+ "Bauru com ovo    102     R$ 1,50 \r\n"
				+ "Hambúrguer       103     R$ 1,20 \r\n"
				+ "Cheeseburguer    104     R$ 1,30 \r\n"
				+ "Refrigerante     105     R$ 1,00");
		
		
		do {
			System.out.println("Digite o código do item e a quantidade ou Digite 00 para sair");
			codItem = aux.nextInt();
			quantidade = aux.nextInt();
			
			if (codItem == 0 && quantidade == 0) {
				sair = true;
				System.out.println("Obrigado!");
				output += "Total a pagar R$"+total;
				
			} else {
				switch (codItem) {
				case 100:
					preco = 1.20;
					total += preco * quantidade;
					output += "Cachorro-Quente - R$"+preco+"\nQuantidade: "+quantidade+"\nTotal R$"+total+"\n";
					break;
				case 101:
					preco = 1.30;
					total += preco * quantidade;
					output += "Bauru Simples - R$"+preco+"\nQuantidade: "+quantidade+"\nTotal R$"+total+"\n";
					break;
				case 102:
					preco = 1.50;
					total += preco * quantidade;
					output += "Bauru com ovo - R$"+preco+"\nQuantidade: "+quantidade+"\nTotal R$"+total+"\n";
					break;
				case 103:
					preco = 1.20;
					total += preco * quantidade;
					output += "Hambúrguer - R$"+preco+"\nQuantidade: "+quantidade+"\nTotal R$"+total+"\n";
					break;
				case 104:
					preco = 1.30;
					total += preco * quantidade;
					output += "Cheeseburguer - R$"+preco+"\nQuantidade: "+quantidade+"\nTotal R$"+total+"\n";
					break;
				case 105:
					preco = 1.00;
					total += preco * quantidade;
					output += "Refrigerante - R$"+preco+"\nQuantidade: "+quantidade+"\nTotal R$"+total+"\n";
					break;
				default:
					System.out.println("Código inválido");
				}
				
			}
			
		} while (!sair);
		
		System.out.println(output);
		
	}

}
