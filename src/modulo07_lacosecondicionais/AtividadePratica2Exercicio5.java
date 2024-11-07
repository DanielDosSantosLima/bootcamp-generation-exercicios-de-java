package modulo07_lacosecondicionais;

import java.util.Scanner;

public class AtividadePratica2Exercicio5 {

	public static void main(String[] args) {
		
		/* Atividade Prática2
		   Laços e Condicionais
		   Exercício 5
		Com base na tabela abaixo,
		escreva um algoritmo em Java
		que leia o código de um item
		(número inteiro de 1 a 6) e a
		quantidade comprada deste item
		(número inteiro). A seguir,
		mostre na tela o valor total da
		conta e o nome do produto que
		foi comprado. */
		
		System.out.println("--Programa para Preços de Lanchonete--");
		
		System.out.println("\n--------------CARDÁPIO--------------");
		System.out.println("Código 1 - Cachorro Quente - R$10,00");
		System.out.println("Código 2 -     X-Salada    - R$15,00");
		System.out.println("Código 3 -     X-Bacon     - R$18,00");
		System.out.println("Código 4 -     Bauru       - R$12,00");
		System.out.println("Código 5 -  Refrigerante   -  R$8,00");
		System.out.println("Código 6 - Suco de Laranja - R$13,00");
		
		System.out.println("\n Escolha um item do cardápio:");
		int codigo;
		int preco = 0;
		String produto = " ";
		int quantidade;
		
		Scanner leia = new Scanner(System.in);
		codigo = leia.nextInt();
		
		System.out.println("\n Agora escolha a quantidade desejada:");
		quantidade = leia.nextInt();
				
		switch (codigo) {
		
			case 1:
				produto = "Cachorro Quente";
				preco = 10;
				break;
			
			case 2:
				produto = "X-Salada";
				preco = 15;
				break;
				
			case 3:
				produto = "X-Bacon";
				preco = 18;
				break;
				
			case 4:
				produto = "Bauru";
				preco = 12;
				break;
				
			case 5:
				produto = "Refrigerante";
				preco = 8;
				break;
				
			case 6:
				produto = "Suco de Laranja";
				preco = 13;
				break;
				
			default:
				System.out.println("Opção inválida!");
		}	
		

		
		System.out.println("Você escolheu o produto '" + produto + "' na quantidade '" + quantidade + "'.");
		
		double total = preco * quantidade;
		System.out.println("O valor total do seu pedido será: R$" + total +".");
			
		
		leia.close();
	}
}
