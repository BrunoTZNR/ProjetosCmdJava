package Exerc_vertorEmatrizes;

import java.util.Scanner;

public class exer_12 {

	public static void main(String[] args) {
		/* Crie um programa que declare uma matriz de 5x5 – usar o comando para gerar 
		 * os números aleatórios no intervalo de 0 a 100. E depois ler um numero e 
		 * procurar o número na matriz e ao encontrar o numero informe a posição 
		 * (qual a linha e qual a coluna o numero foi encontrado), caso o numero não 
		 * exista na matriz exiba uma mensagem, informando que o numero não existe na 
		 * matriz. Se o numero for encontrado em mais de uma posição deverá mostrar 
		 * também a posição linha e coluna que o número foi encontrado.  */
		
		int i, j, num, achados = 0;
		int [][] matriz = new int[5][5];
		int [][] posicoes = new int[25][2];
		
		Scanner input = new Scanner(System.in);
		
		/* PREENCHE A MATRIZGERADA */
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int)Math.round(Math.random() * 100);
			}
		}
		
		try {
			System.out.print("Digite um número inteiro: ");
			num = input.nextInt();
		} finally {
			input.close();
		}
		
		/* SEARCH NUMBER IN MATRIZ */
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				if (num == matriz[i][j]) {
					posicoes[achados + 1][0] = i; //LINHA
					posicoes[achados + 1][1] = j; //COLUNA
					achados++;
				}
			}
		}
		
		if (achados == 0) {
			System.out.println("O número não exite na matriz!");
		} else {
			if (achados == 1) {
				System.out.println("O número foi achado na seguinte posição: Linha -> " + (posicoes[1][0] + 1) + 
						" / Coluna -> " + (posicoes[1][1] + 1));
			} else {
				System.out.print("O número foi achado " + achados + " vezes nas seguintes posições: \n");
				
				for (i = 1; i < (achados + 1); i++) {
					if (i == (achados)) {
						System.out.print("Linha -> " + (posicoes[i][0] + 1) + " / Coluna -> " + 
								(posicoes[i][1] + 1) + ".");
					} else {
						System.out.print("Linha -> " + (posicoes[i][0] + 1) + " / Coluna -> " + 
								(posicoes[i][1] + 1) + ", \n");
					}
				}
			}
		}
		
		/* EXIBE A MATRIZ */
		System.out.print("\nMatriz:\n");
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.print("\n");
		}
	}
}
