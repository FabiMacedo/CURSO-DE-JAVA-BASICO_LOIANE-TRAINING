package com.fabiana.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/*14. Jo�o Papo-de-Pescador, homem de bem, comprou um
		microcomputador para controlar o rendimento di�rio de seu trabalho.
		Toda vez que ele traz um peso de peixes maior que o estabelecido
		pelo regulamento de pesca do estado de S�o Paulo (50 quilos) deve
		pagar uma multa de R$ 4,00 por quilo excedente. Jo�o precisa que
		voc� fa�a um programa que leia a vari�vel peso (peso de peixes) e
		verifique se h� excesso. Se houver, gravar na vari�vel excesso e na
		vari�vel multa o valor da multa que Jo�o dever� pagar. Caso contr�rio
		mostrar tais vari�veis com o conte�do ZERO.*/ 
		
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
		
		System.out.println("O peso de peixes pescados � " + peso + "Kg\nPassou do limite de peso em " + excesso + "Kg\nVoc� ter� que pagar uma multa de R$" + multa);

	}

}
