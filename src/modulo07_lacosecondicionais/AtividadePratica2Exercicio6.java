package modulo07_lacosecondicionais;

import java.util.Scanner;

public class AtividadePratica2Exercicio6 {

	public static void main(String[] args) {
		
		/* Com base na tabela abaixo, escreva um algoritmo
		 * em Java que leia o Nome do Colaborador (String),
		 * o Código do Cargo do Colaborador(número inteiro
		 * de 1 a 6) e o Salário (número float). A seguir,
		 * mostre na tela o Nome do Colaborador, o Cargo e
		 * o novo Salário reajustado.
		 */
		
		System.out.println("--Programa para Cálculo de Reajuste Salarial--");
		Scanner leia = new Scanner(System.in);
		
		String nome = " ";
		int codigo = 0;
		float salario;
		String cargo = " ";
		
		System.out.println("\n Digite os dados do colaborador(a/e): ");
		
		System.out.println("\n Digite o nome completo: ");
		nome = leia.nextLine();
		System.out.println("\n Digite o código do cargo: ");
		codigo = leia.nextInt();
		System.out.println("\n Digite o salário: ");
		salario = leia.nextFloat();
		
		switch (codigo) {
			case 1:
				cargo = "Gerente";
				salario = salario + (0.10f * salario);
				break;
				
			case 2:
				cargo = "Vendedor";
				salario = salario + (0.07f * salario);
				break;
				
			case 3:
				cargo = "Supervisor";
				salario = salario + (0.09f * salario);
				break;
				
			case 4:
				cargo = "Motorista";
				salario = salario + (0.06f * salario);
				break;
				
			case 5:
				cargo = "Estoquista";
				salario = salario + (0.05f * salario);
				break;
				
			case 6:
				cargo = "Técnico(a) de TI";
				salario = salario + (0.08f * salario);
				break;
				
			default:
				System.out.println("Opção inválida!");
		}
		
		System.out.println("\nNome do colaborador(a/e): " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário com reajuste: R$" + salario);
		
		leia.close();
		
	}

}
