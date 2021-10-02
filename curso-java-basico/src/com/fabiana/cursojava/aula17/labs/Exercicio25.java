package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		/*25. O Sr. Manoel Joaquim expandiu seus neg�cios para al�m dos neg�cios de 1,99 e agora possui uma loja de 
		conveni�ncias. Fa�a um programa que implemente uma caixa registradora rudimentar. O programa dever� receber um n�mero
        desconhecido de valores referentes aos pre�os das mercadorias. Um valor zero deve ser informado pelo operador para 
        indicar o final da compra. O programa deve ent�o mostrar o total da compra e perguntar o valor em dinheiro que o 
        cliente forneceu, para ent�o calcular e mostrar o valor do troco. Ap�s esta opera��o, o programa dever� voltar ao ponto
        inicial, para registrar a pr�xima compra. A sa�da deve ser conforme o exemplo abaixo:
        Lojas Tabajara 
        Produto 1: R$ 2.20 
        Produto 2: R$ 5.80 
        Produto 3: R$ 0 
        Total: R$ 9.00 
        Dinheiro: R$ 20.00 
        Troco: R$ 11.00 ...*/
		
		Scanner aux = new Scanner(System.in);
		
		int qtdProduto;
		double preco, pagamento, troco, total = 0;
		boolean sair = false;
		String continuarCompra;
		String output;
		
				
		do {
			System.out.println("Deseja realizar uma nova compra? S/N");
			continuarCompra = aux.next();
			
			if (continuarCompra.equalsIgnoreCase("s")) {
				output = "Lojas Tabajara\n";
				
				System.out.println("Digite a quantidade de produtos da compra:");
				qtdProduto = aux.nextInt();
				
				for (int i=1; i<=qtdProduto; i++) {
					System.out.println("Informe o pre�o do "+i+"� produto R$");
					preco = aux.nextDouble();
					output += "Produto "+i+": R$"+preco+"\n";
					total += preco; 
				}
				
				output +="Total: R$"+total+"\n";
				System.out.println("Total R$"+total);
				
				System.out.println("Informe o valor do pagamento em dinheiro R$");
				pagamento = aux.nextDouble();
				
				output +="Dinheiro: R$"+pagamento+"\n";
				troco = pagamento - total;
				output +="Troco: R$"+troco;
				
				System.out.println(output);
				
			} else {
				sair = true;
				System.out.println("Obrigada!");
			}
						
		} while (!sair);

	}

}
