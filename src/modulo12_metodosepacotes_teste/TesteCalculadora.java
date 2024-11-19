package modulo12_metodosepacotes_teste;

import java.util.Scanner;

import modulo12_metodosepacotes_calculo.Calculadora;

public class TesteCalculadora {

		public static void main(String[] args) {

			Scanner leia = new Scanner(System.in);

			float numero1 = 0, numero2 = 0;

			System.out.println("--Calculadora--");
			System.out.println("Digite o primeiro número: ");
			numero1 = leia.nextFloat();

			System.out.println("Digite o segundo número: ");
			numero2 = leia.nextFloat();

			// Exibe o Resultado de cada Operação Matemática:
			System.out.println("\nSoma = " + Calculadora.soma(numero1, numero2));
			System.out.println("Subtração = " + Calculadora.subtracao(numero1, numero2));
			System.out.println("Multiplicação = " + Calculadora.multiplicacao(numero1, numero2));
			System.out.println("Divisão = " + Calculadora.divisao(numero1, numero2));

			// finaliza o Objeto leia
			leia.close();

		}

}
