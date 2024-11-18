package modulo10_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AtividadePratica5Exercicio1 {

	public static void main(String[] args) {

		/* Atividade Prática5
		Collections
		Exercício1:
		Escreva um programa Java para criar uma Collection ArrayList
		de Objetos da Classe String. O programa deverá solicitar ao usuário,
		que ele digite via teclado 5 cores e deverá adicioná-las individualmente
		no ArrayList. Em seguida, faça o que se pede:
		- Mostre na tela todas as cores que foram adicionadas. 
		- Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.

		*/
		
		System.out.println("--Programa para Inserir e Verificar ArrayList--");

		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		for (int indice = 0; indice < 5; indice++) {
			System.out.println("\nDigite a " + (indice + 1) + "ª cor: ");
			String cor = leia.nextLine();
			cores.add(cor);
		}
		
		System.out.println("\nListar todas as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
				
		System.out.println("\nOrdenar todas as cores:");
		Collections.sort(cores);
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		leia.close();
		
	}

}
