package com.fabiana.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner aux = new Scanner(System.in);
		
		/*System.out.println("Digite sua idade");
		int idade = aux.nextInt();
		
		if (idade >= 18) {
			System.out.println("� maior de idade.");
		} else {
			System.out.println("N�o � maior de idade.");
		}*/
		
		
		System.out.println("Entre com o pre�o do item");
		double valor = aux.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Est� barato, pode comprar");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Voc� pode pedir desconto!");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais");
		} else {
			System.out.println("Muito caro");
		}

	}

}
