package com.fabiana.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*5. Fa�a um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
		� A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
		� A mensagem "Reprovado", se a m�dia for menor do que sete;
		� A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.*/ 
		
		Scanner aux = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota1 = aux.nextDouble();
		System.out.println("Digite a segunda nota");
		double nota2 = aux.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if (media < 7) {
			System.out.println("Sua m�dia � "+media+", voc� foi REPROVADO.");
		} else if (media >=7 && media < 10 ) {
			System.out.println("Sua m�dia � "+media+", voc� foi APROVADO.");
		} else if (media == 10) {
			System.out.println("Sua m�dia � "+media+", voc� foi APROVADO COM DISTIN��O.");
		}
	}

}
