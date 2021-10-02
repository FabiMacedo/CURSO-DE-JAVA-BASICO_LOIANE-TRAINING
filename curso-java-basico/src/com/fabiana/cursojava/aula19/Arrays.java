package com.fabiana.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double [] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("o valor da temperatura do dia 1 � "+temperaturas[0]);
		
		System.out.println("O tamanho do array: "+temperaturas.length);
		
		System.out.println("O valores do array: ");
		
		//vers�o padr�o do for para arrays
		/*for (int i=0; i<temperaturas.length; i++) {
			System.out.println("o valor da temperatura do "+(i+1)+"� dia � "+temperaturas[i]);
		}
		*/
		
		//for melhorado itera��o de arrays
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
		
	}

}
