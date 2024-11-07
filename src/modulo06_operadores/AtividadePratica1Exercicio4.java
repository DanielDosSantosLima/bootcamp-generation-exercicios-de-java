package modulo06_operadores;

import java.util.Scanner;

public class AtividadePratica1Exercicio4 {

	public static void main(String[] args) {
		
		//Atividade Prática1
		//Variáveis e Operadores
		//Exercício 4
		//Leia quatro valores float (n1, n2, n3, n4).
		// A seguir, calcule e mostre a diferença do
		// produto entre o n1 e n2 pelo produto entre o n3 e o n4.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--Programa para cálculo entre notas--");
		
		System.out.println("Digite a 1ª Nota: ");
		float nota1 = leia.nextFloat();
		
		System.out.println("Digite a 2ª Nota: ");
		float nota2 = leia.nextFloat();
		
		System.out.println("Digite a 3ª Nota: ");
		float nota3 = leia.nextFloat();
		
		System.out.println("Digite a 4ª Nota: ");
		float nota4 = leia.nextFloat();
		
		float calculo = (nota1 * nota2) - (nota3 * nota4);
		System.out.println("Resultado: " + calculo);
		
		leia.close();
	}
}
