package com.fabiana.cursojava.aula11;

public class CuriosidadeInt {

	public static void main(String[] args) {
		
		int var1 = 2147483647;
		int var2 = 1;
		
		System.out.println(var1 + var2);
		/*
		 Saída = -2147483648
		 No Java é como uma roleta. Quando excede o 
		 tamanho suportado e é somado algum número 
		 ele vai para o menor número.  
		*/ 
	}

}
