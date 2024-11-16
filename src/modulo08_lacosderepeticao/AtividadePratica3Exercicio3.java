package modulo08_lacosderepeticao;

import java.util.Scanner;

public class AtividadePratica3Exercicio3 {

	public static void main(String[] args) {
		
		/* Atividade Prática3
		Laços de Repetição
		Exercício3:
		
		Escreva um algoritmo em Java, que leia a idade de várias pessoas
		(números inteiros), via teclado e mostre na tela o total de pessoas
		cuja idade seja menor que 21 anos e o total de pessoas cuja idade
		seja maior que 50 anos. A leitura dos dados deve ser finalizada
		ao digitar uma idade negativa. 
		
		*/
		
		System.out.println("--Programa para Verificação de Idade--");

		Scanner leia = new Scanner(System.in);
		
		int idade, idademenordoque21 = 0, idademaiordoque50 = 0;
		
		while (true) {
			System.out.println("Digite a idade da pessoa: ");
			idade = leia.nextInt();
			
			if (idade < 0) {
				break;
			}
			
			if (idade < 21) {
				idademenordoque21++;
			} else if (idade > 50) {
				idademaiordoque50++;
			}
		}
				
		leia.close();
		
		System.out.println("Total de pessoas menores do que 21 anos: " + idademenordoque21);
		System.out.println("Total de pessoas maiores do que 50 anos: " + idademaiordoque50);

	}
	
}
