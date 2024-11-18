package modulo09_arrays;

import java.util.Scanner;

public class AtividadePratica4Exercicio1 {

	public static void main(String[] args) {
		
		/* Atividade Prática4
		Arrays - Matrizes e Vetores
		Exercício1:
		Dado um vetor contendo 10 números inteiros não ordenados
		e não repetidos, construa um algoritmo que consiga pesquisar
		dados no vetor, onde o usuário irá digitar um número e o
		programa deve exibir na tela a posição deste número no vetor.
		Caso o número não seja encontrado, a mensagem: “Não foi encontrado!”
		deve ser exibida na tela.
		*/

		System.out.println("--Programa para Buscar em um Vetor--");
		
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero;
		boolean encontrar = false;
		
		System.out.println("Digite o número que você deseja encontrar");
		numero = leia.nextInt();
		
		for (int indice = 0; indice < vetorInteiros.length; indice++) {
			if (vetorInteiros[indice] == numero) {
				System.out.println("O número " + numero + " foi encontrado na posição: " + indice);
				encontrar = true;
				break;
			} 
		}
		
		if (!encontrar) {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		
		leia.close();
				
	}

}
