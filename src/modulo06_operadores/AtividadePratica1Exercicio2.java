package modulo06_operadores;

import java.util.Scanner;

public class AtividadePratica1Exercicio2 {

	public static void main (String[] args) {
		
		//Atividade Prática1
		//Variáveis e Operadores
		//Exercício 2
		//Elabore um algoritmo em Java que leia 4 notas
		// de um participante, em variáveis do tipo float
		// e exiba na tela a média final do participante.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--Programa para cálculo de nota-- \n");
		System.out.println("Digite a 1ª Nota: ");
		
		float nota1 = leia.nextFloat();
					
		System.out.println("Digite a 2ª Nota: ");
		float nota2 = leia.nextFloat();
		
		System.out.println("Digite a 3ª Nota: ");
		float nota3 = leia.nextFloat();
		
		System.out.println("Digite a 4ª Nota: ");
		float nota4 = leia.nextFloat();
		
		System.out.println("A média entre essas quatro notas é: ");
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println(media);
		
		leia.close();

	}
}
