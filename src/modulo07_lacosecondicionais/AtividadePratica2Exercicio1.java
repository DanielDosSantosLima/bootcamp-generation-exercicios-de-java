package modulo07_lacosecondicionais;

import java.util.Scanner;

public class AtividadePratica2Exercicio1 {

	public static void main(String[] args) {
		
		//Atividade Prática2
		//Laços e Condicionais
		//Exercício 1
		//Faça um algoritmo em Java que leia
		// 3 valores inteiros A, B e C e
		// imprima na tela se a soma de A + B é maior,
		// menor ou igual a C.
		
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--Programa para comparação entre valores--");
		System.out.println("\n Digite o 1º Número (A): ");
		a = leia.nextInt();
								
		System.out.println("\n Digite o 2º Número (B): ");
		b = leia.nextInt();
		
		System.out.println("\n Digite o 3º Número (C): ");
		c = leia.nextInt();
		
		if((a + b) > c) { 
			System.out.println("A soma de A + B é maior do que C");
		} else if ((a + b) < c){
			System.out.println("A soma de A + B é menor do que C");			
		} else {
			System.out.println("A soma de A + B é igual a C");
		}
		
		leia.close();
	}

}
