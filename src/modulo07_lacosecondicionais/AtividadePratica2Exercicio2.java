package modulo07_lacosecondicionais;

import java.util.Scanner;

public class AtividadePratica2Exercicio2 {

	public static void main(String[] args) {
		
		//Atividade Prática2
		//Laços e Condicionais
		//Exercício 2
		//Escreva um algoritmo em Java,
		// que leia um número inteiro via teclado
		// e mostre na tela uma mensagem indicando
		// se este número é par ou ímpar e
		// se o número é positivo ou negativo. 
		
		System.out.println("--Programa para verificar número inteiro--");
		
		System.out.println("\n Digite um número inteiro: ");
		Scanner leia = new Scanner(System.in);
		int numero;
		numero = leia.nextInt();
		
		System.out.println("O número digitado foi: " + numero);
		
		if ((numero % 2 == 0) && (numero > 0)) {
			System.out.println("O número " + numero + " é par e positivo!");
		} else if ((numero % 2 == 0) && (numero < 0)) {
			System.out.println("O número " + numero + " é par e negativo!");
		} else if ((numero % 2 != 0) && (numero > 0)) {
			System.out.println("O número " + numero + " é ímpar e positivo!");
		} else if ((numero % 2 != 0) && (numero < 0)) {
			System.out.println("O número " + numero + " é ímpar e negativo!");
		} else {
			System.out.println("O número " + numero + " é par e considerado neutro!");
		}
		
		leia.close();		
		
	}

}
