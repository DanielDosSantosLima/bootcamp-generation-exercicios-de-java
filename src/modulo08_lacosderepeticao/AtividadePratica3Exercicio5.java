package modulo08_lacosderepeticao;

import java.util.Scanner;

public class AtividadePratica3Exercicio5 {

	public static void main(String[] args) {
		
		/* Atividade Prática3
		Laços de Repetição
		Exercício5:
		Escreva um algoritmo em Java, que leia números inteiros via teclado,
		até que o número zero seja digitado. Ao final, mostre na tela a soma
		de todos os números digitados, que sejam positivos. 
		*/
		
		System.out.println("--Programa para Verificar Números Inteiros--");
		
		Scanner leia = new Scanner(System.in);
		int numero, soma = 0;

		do {
			System.out.println("Digite um número (ou '0' para encerrar o programa):");
			numero = leia.nextInt();
			
			if (numero > 0) {
				soma += numero;	
			}
			
		} while (numero != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
		
		leia.close();
		
	}

	
}
