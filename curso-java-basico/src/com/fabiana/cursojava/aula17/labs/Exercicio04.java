package com.fabiana.cursojava.aula17.labs;

public class Exercicio04 {

	public static void main(String[] args) {
		/*4. Supondo que a popula��o de um pa�s 'A' seja da ordem de 80.000 habitantes com uma taxa anual de 
		 crescimento de 3% e que a popula��o de 'B' seja 200.000 habitantes com uma taxa de crescimento de 1.5%. 
		 Fa�a um programa que calcule e escreva o n�mero de anos necess�rios para que a popula��o do pa�s A ultrapasse 
		 ou iguale a popula��o do pa�s B, mantidas as taxas de crescimento.*/
		
		int popA = 80000; 
		int popB = 200000;
		int cont = 0;
		
		while (popA <= popB) {
			popA += popA * 0.03;
			popB += popB * 0.015;
			cont++;
		}
		
		System.out.println("Popula��o A "+popA);
		System.out.println("Popula��o B "+popB);
		System.out.println("Em quantos anos a popula��o A ser� igual a popula��o B? "+cont);
	}

}
