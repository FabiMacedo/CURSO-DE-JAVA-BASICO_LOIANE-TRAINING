package com.fabiana.cursojava.aula17.labs;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		/*21. Fa�a um programa que calcule o n�mero m�dio de alunos por turma. Para isto, pe�a a quantidade de turmas e a 
		quantidade de alunos para cada turma. As turmas n�o podem ter mais de 40 alunos.*/
		
		Scanner aux = new Scanner(System.in);
		
		int  qtdTurma, qtdAlunos;
		double media, soma = 0;
		boolean invalido = true;
				
		System.out.println("Informe a quantidade de turmas");
		qtdTurma = aux.nextInt();
		
		for (int i=1; i<=qtdTurma; i++) {
			invalido = true;
			do {
				System.out.println("Informe a quantidade de alunos da "+i+"� turma");
				qtdAlunos = aux.nextInt();
				
				if (qtdAlunos <= 40) {
					invalido = false;
				} else {
					System.out.println("A quantidade de alunos n�o pode ultrapassar a 40.\nDigite novamente!");
				}
			} while (invalido);
			
			soma += qtdAlunos;
				
		}
		
		media = soma/qtdTurma;
		
		System.out.println("A quantidade media de alunos por turma � "+media);
		
	}

}
