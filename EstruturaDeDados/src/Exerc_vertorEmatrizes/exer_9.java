package Exerc_vertorEmatrizes;

public class exer_9 {

	public static void main(String[] args) {
		/* Faça um programa que calcule a soma dos números de uma matriz 
		 * 3x5 de inteiros. – usar o comando para gerar os números aleatórios. */
		
		int i, j, soma = 0;
		int [][] matriz = new int [3][5];
		
		/* PREENCHE A MATRIZ */
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int)Math.round(Math.random() * 20);
			}
		}
		
		/* SOMA OS INTERIOS DA MATRIZ */
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				soma += matriz[i][j];
			}
		}
		
		/* EXIBE A MATRIZ */
		System.out.print("Matriz:\n");
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.print("\n");
		}
		
		/* EXIBE O RESULTADO DA SOMA DA MATRIZ */
		System.out.println("\nA soma da matriz é = " + soma + ".");
	}

}
