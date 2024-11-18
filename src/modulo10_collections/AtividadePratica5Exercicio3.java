package modulo10_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AtividadePratica5Exercicio3 {

	public static void main(String[] args) {
		
		/* Atividade Prática5
		Collections
		Exercício3:
		Escreva um programa Java para criar uma Collection Set
		de Objetos da Classe Wrapper Integer. O programa deverá
		solicitar ao usuário, que ele digite via teclado 10 valores
		inteiros não repetidos e adicione-os individualmente na Collection
		Set. Em seguida, faça o que se pede:
		- Mostre na tela todos os elementos da Collection Set,
		utilizando a Classe Iterator. 
		*/
		
		System.out.println("--Programa para Inserir Valores na Collection Set--");

		Scanner leia = new Scanner(System.in);
		Set<Integer> valores = new HashSet<Integer>();
		
		System.out.println("Digite 10 valores inteiros não repetidos.");
		
		for (int indice = 0; indice < 10; indice++) {
			System.out.println("\nDigite o " + (indice + 1) + "º número: ");
			Integer valor = leia.nextInt();
			valores.add(valor);
		}
		
		System.out.println("\nListar dados do Set: ");
		Iterator<Integer> ivalores = valores.iterator();
		
		while (ivalores.hasNext()) {
			System.out.println(ivalores.next());
		}
		
		leia.close();
		
	}

}
