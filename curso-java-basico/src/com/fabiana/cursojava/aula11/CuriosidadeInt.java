package com.fabiana.cursojava.aula11;

public class CuriosidadeInt {

	public static void main(String[] args) {
		
		int var1 = 2147483647;
		int var2 = 1;
		
		System.out.println(var1 + var2);
		/*
		 Sa�da = -2147483648
		 No Java � como uma roleta. Quando excede o 
		 tamanho suportado e � somado algum n�mero 
		 ele vai para o menor n�mero.  
		*/ 
	}

}
