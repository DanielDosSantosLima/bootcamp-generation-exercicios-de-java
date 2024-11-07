package modulo06_operadores;

import java.util.Scanner;

public class AtividadePratica1Exercicio3 {

	public static void main(String[] args) {
		
		//Atividade Prática1
		//Variáveis e Operadores
		//Exercício 3
		//Elabore um algoritmo em Java, que leia o Salário Bruto,
		// o Adicional Noturno, as Horas Extras e os Descontos
		// de um Colaborador, em variáveis do tipo float e
		// exiba na tela o Salário Líquido.
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--Programa para cálculo de Salário Líquido--");
		
		System.out.println("Digite o Salário Bruto: ");
		float salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o Adicional Noturno: ");
		float adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite as Horas Extras: ");
		float horasExtras = leia.nextFloat();
		
		System.out.println("Digite os Descontos: ");
		float descontos = leia.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		System.out.println("Salário Líquido = " + salarioLiquido);
		
		leia.close();
	}

}
