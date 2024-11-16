package modulo08_lacosderepeticao;

import java.util.Scanner;

public class AtividadePratica3Exercicio1 {

	public static void main(String[] args) {
		
		/* Atividade Prática3
		Laços de Repetição
		Exercício1:
		Escreva um algoritmo em Java, que leia 2 números inteiros via teclado,
		onde o primeiro número deve ser menor do que o segundo número.
		Caso contrário, deve ser exibida uma mensagem na tela informando que
		o intervalo é inválido e sair do programa. No intervalo informado,
		mostre na tela todes os números que são múltiplos de 3 e 5. 
		*/
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--Programa para Calcular múltiplos de 3 e 5 dentro de um intervalo");
		
		int numero1, numero2;
		
		System.out.println("\nDigite o 1º número: ");
		numero1 = leia.nextInt();
		
		System.out.println("\nDigite o 2º número: ");
		numero2 = leia.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("Intervalo Inválido! \nO 1º número deve ser menor que o 2º!");
		} else {
			System.out.println("Os múltiplos de 3 e 5 dentro desse intervalo são: \n");
		}
				
		for (int i = numero1 + 1; i < numero2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " é múltiplo de 3 e de 5");
			}
		}
		
		leia.close();

	}

	
}
