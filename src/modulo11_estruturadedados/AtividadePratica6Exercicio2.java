package modulo11_estruturadedados;

import java.util.Scanner;
import java.util.Stack;

public class AtividadePratica6Exercicio2 {

	public static void main(String[] args) {

		/* Atividade Prática6
		Pilha
		Exercício2:
		Escreva um programa contendo uma Collection Stack (Pilha)
		de Objetos string, para organizar a retirada de livros de
		uma pilha. O programa deverá ter um Menu que aceitará as
		opções 0, 1, 2 e 3:
		1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
		2: Listar todos os livros da Pilha
		3: Retirar um livro da pilha 
		0: O programa deve ser finalizado. 
		Caso a pilha esteja vazia, ao tentar retirar um livro da pilha,
		o programa deverá informar que a pilha está vazia.
		*/
		
		System.out.println("-- Programa para Retirada de Livros da Pilha--");
		Scanner leia = new Scanner(System.in);
		int opcao = 0;
		Stack<String> pilha = new Stack<String>();
		
		while (true) {
			System.out.println("*******************************************");
			System.out.println("           Digite uma opção                ");
			System.out.println("                                           ");
			System.out.println("      1 - Adicionar Livro na Pilha         ");
			System.out.println("      2 - Listar Todos os Livros           ");
			System.out.println("      3 - Retirar Livro da Pilha           ");
			System.out.println("                0 - Sair                   ");
			System.out.println("                                           ");
			System.out.println("*******************************************");

			System.out.println("\nDigite a opção desejada:");
			opcao = leia.nextInt();
            leia.nextLine();
            
            switch (opcao) {
            	case 1:
            		System.out.println("Digite o nome: ");
					String nomeLivro = leia.nextLine();
					pilha.add(nomeLivro);	
					System.out.println("Livro '" + nomeLivro + "' adicionado à pilha!\n");
				break;
            	
            	case 2:
            		if (pilha.isEmpty()) {
						System.out.println("A pilha está vazia!");
					} else {
						System.out.println("Lista de Livros na Pilha: ");
						for(String livro :  pilha) {
							System.out.println(livro);
						}
					System.out.println("\n");

					}
				break;
            	            	
            	case 3:
            		if (pilha.isEmpty()) {
						System.out.println("A pilha está vazia!");
					} else {
						String livroRetirado =	pilha.pop();
						System.out.println("O livro " + livroRetirado + " foi retirado da pilha!\n");	
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
