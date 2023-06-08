package Exerc_vertorEmatrizes;

import java.util.Scanner;

public class exer_11 {

	public static void main(String[] args) {
		/* Faça um programa que multiplique todos os elementos de uma matriz 
		 * de inteiros 9x9 pelo valor de A que foi lido pelo teclado. Ao final 
		 * imprimir a matriz resultante. – usar o comando para gerar os números 
		 * aleatórios entre 0 e 100. */
		
		int i, j, A = 0;
		int [][] matrizGerada = new int[9][9], matrizMultiplicada = new int[9][9];
		
		Scanner input = new Scanner(System.in);
		
		/* PREENCHE A MATRIZGERADA */
		for (i = 0; i < matrizGerada.length; i++) {
			for (j = 0; j < matrizGerada[i].length; j++) {
				matrizGerada[i][j] = (int)Math.round(Math.random() * 100);
			}
		}
		
		try {
			System.out.print("Digite um número inteiro: ");
			A = input.nextInt();
		} finally {
			input.close();
		}
		
		/* PREENCHE A MATRIZMULTIPLICADA */
		for (i = 0; i < matrizGerada.length; i++) {
			for (j = 0; j < matrizGerada[i].length; j++) {
				matrizMultiplicada[i][j] = matrizGerada[i][j] * A;
			}
		}
		
		/* EXIBE A MATRIZGERADA */
		System.out.print("Matriz Gerada:\n");
		for (i = 0; i < matrizGerada.length; i++) {
			for (j = 0; j < matrizGerada[i].length; j++) {
				System.out.print(matrizGerada[i][j] + " ");
			}
			
			System.out.print("\n");
		}
		
		/* EXIBE A MATRIZMULTIPLICADA */
		System.out.print("\nMatriz Multiplicada:\n");
		for (i = 0; i < matrizMultiplicada.length; i++) {
			for (j = 0; j < matrizMultiplicada[i].length; j++) {
				System.out.print(matrizMultiplicada[i][j] + " ");
			}
			
			System.out.print("\n");
		}
	}

}
