package modulo06_operadores;

import java.util.Scanner;

public class AtividadePratica1Exercicio1 {

	public static void main (String[] args) {
		
		//Atividade Prática1
		//Variáveis e Operadores
		//Exercício 1
		//Dado o Fluxograma abaixo,
		// desenvolva o algoritmo abaixo na Linguagem Java: 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--Programa para cálculo do novo salário--");
		
		System.out.println("Digite o salário: ");
		float salario = leia.nextFloat();
				
		System.out.println("Digite o abono: ");
		float abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		System.out.println("Novo salário: " + novoSalario);
		
		leia.close();
		
	}
}
