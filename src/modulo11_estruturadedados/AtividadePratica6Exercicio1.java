package modulo11_estruturadedados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadePratica6Exercicio1 {

	public static void main(String[] args) {

		/* Atividade Prática6
		Fila
		Exercício1:
		Escreva um programa contendo uma Collection Queue (Fila)
		de Objetos do tipo string, para organizar uma fila por
		ordem de chegada dos Clientes de um Banco. O programa deverá
		ter um Menu que aceitará as opções 0, 1, 2 e 3:
		1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
		2: Listar todos os Clientes na fila
		3: Chamar (retirar) uma pessoa da fila 
		0: O programa deve ser finalizado. 
		Caso a fila esteja vazia, o programa deverá informar que a
		fila está vazia ao tentar retirar (chamar) um cliente da fila.
		*/
		
		System.out.println("-- Programa para Controle de Fila de Banco--");
		Scanner leia = new Scanner(System.in);
		int opcao = 0;
		Queue<String> fila = new LinkedList<String>();
		
		while (true) {
			System.out.println("*******************************************");
			System.out.println("           Digite uma opção                ");
			System.out.println("                                           ");
			System.out.println("      1 - Adicionar Cliente na Fila        ");
			System.out.println("      2 - Listar Todos os Clientes         ");
			System.out.println("  3 - Retirar Cliente (Chamar o próximo)   ");
			System.out.println("                0 - Sair                   ");
			System.out.println("                                           ");
			System.out.println("*******************************************");

			System.out.println("\nDigite a opção desejada:");
			opcao = leia.nextInt();
            leia.nextLine();

            if (opcao < 0 || opcao > 3) {
                System.out.println("Opção inválida! Digite um número entre 0 e 3.\n");
                continue;
            }
					
			switch (opcao) {
				case 1:
					System.out.println("Digite o nome: ");
					String nomeCliente = leia.nextLine();
					fila.add(nomeCliente);	
					System.out.println("Cliente '" + nomeCliente + "' adicionado(a/e) à fila!\n");
				break;
				
				case 2:
					if (fila.isEmpty()) {
						System.out.println("A fila está vazia!");
					} else {
						System.out.println("Lista de Clientes na Fila: ");
						for(String cliente :  fila) {
							System.out.println(cliente);
						}
					System.out.println("\n");

					}
				break;
								
				case 3:
					if (fila.isEmpty()) {
						System.out.println("A fila está vazia!");
					} else {
						String clienteChamado =	fila.poll();
						System.out.println("O cliente " + clienteChamado + " foi chamado(a/e)!\n");	
					}
				break;
				
				case 0:
					System.out.println("Programa finalizado!");
					leia.close();	
					System.exit(0);
				break;
			}

		}

	}

}
