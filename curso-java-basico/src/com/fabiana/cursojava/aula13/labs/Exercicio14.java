package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/*14. João Papo-de-Pescador, homem de bem, comprou um
		microcomputador para controlar o rendimento diário de seu trabalho.
		Toda vez que ele traz um peso de peixes maior que o estabelecido
		pelo regulamento de pesca do estado de São Paulo (50 quilos) deve
		pagar uma multa de R$ 4,00 por quilo excedente. João precisa que
		você faça um programa que leia a variável peso (peso de peixes) e
		verifique se há excesso. Se houver, gravar na variável excesso e na
		variável multa o valor da multa que João deverá pagar. Caso contrário
		mostrar tais variáveis com o conteúdo ZERO.*/ 
		
		Scanner aux = new Scanner(System.in);
		
		double excesso, multa; 
		
		System.out.println("Calculador de pescado");
		System.out.println("Informe o peso total de peixes pescados");
		double peso = aux.nextDouble();
		
		if (peso > 50) {
			excesso = peso - 50;
			multa =  excesso * 4;	
		}
		else {
			excesso = 0;
			multa = 0;
		}
		
		System.out.println("O peso de peixes pescados é " + peso + "Kg\nPassou do limite de peso em " + excesso + "Kg\nVocê terá que pagar uma multa de R$" + multa);

	}

}
