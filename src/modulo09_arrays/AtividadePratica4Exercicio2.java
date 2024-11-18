package modulo09_arrays;

import java.util.Scanner;

public class AtividadePratica4Exercicio2 {

	public static void main(String[] args) {

		/* Atividade Prática4
		Arrays - Matrizes e Vetores
		Exercício2:
		Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor.
		Em seguida, mostre na tela:
		- Todos os elementos dos índices ímpares do vetor 
		- Todos os elementos do vetor que são números pares
		- A Soma de todos os elementos do vetor
		- A Média de todos os elementos do vetor, armazenada em uma variável do tipo real

		*/
		
		System.out.println("--Programa para Trabalhar Valores em um Vetor--");
		
		Scanner leia = new Scanner(System.in);
		int vetorInteiros[] = new int[10];
		
		System.out.println("Digite 10 números inteiros: \n");
		
		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + "º número: ");
			vetorInteiros[indice] = leia.nextInt();
		}
		
		System.out.println("\nOs números digitados foram: ");
		
		for (int indice = 0; indice < 10; indice++) {
			System.out.println((indice + 1) + "º número: " + vetorInteiros[indice]);
		}
		
		//Elementos nos índices ímpares
		System.out.println("\nElementos nos índices ímpares: ");
		for (int indice = 1; indice < 10; indice += 2) {
			System.out.println("Índice " + indice + ": " + vetorInteiros[indice]);
		}
		
		//Elementos pares
		System.out.println("\nElementos pares: ");
		for (int indice = 0; indice < 10; indice++) {
			if (vetorInteiros[indice] % 2 == 0) {
				System.out.println("Número par: '" + vetorInteiros[indice] + "' está no índice " + indice);
			}
		}
		
		//Soma
		int soma = 0;
		for (int indice = 0; indice < 10; indice ++) {
			soma += vetorInteiros[indice];
		}
		
		//Média
		float media = soma/10f;
		
		System.out.println("\nSoma de todos os elementos: " + soma);
		System.out.printf("\nMédia de todos os elementos: %.2f\n", media);

		
		leia.close();
		
	}

}
