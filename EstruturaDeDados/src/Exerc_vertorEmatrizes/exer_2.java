package Exerc_vertorEmatrizes;

public class exer_2 {

	public static void main(String[] args) {
		/* Criar uma matriz A de 5x5 com números inteiros aleatórios 
		 * de 0 a 100 e criar uma matriz T (transposta) de 5x5; 
		 * Ao final imprimir as duas matrizes */
		
		int i, j;
		int [][] A = new int [5][5];
		
		for (i = 0; i < A.length; i++) {
			for (j = 0; j < A[i].length; j++) {
				A[i][j] = (int)Math.round(Math.random() * 100);
			}
		}
		
		int [][] T = new int [5][5];
		
		for (i = 0; i < T.length; i++) {
			for (j = 0; j < T.length; j++) {
				T[i][j] = A[j][i];
			}
		}
		
		/* MATRIZ ALEATORIA 5X5 */
		System.out.println("MATRIZ ALEATORIA 5X5 \n");
		
		for (i = 0; i < A.length; i++) {
			System.out.print(i + ": ");
			
			for (j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			
			System.out.print("\n");
		}
		
		/* MATRIZ TRASNPORTADA 5X5 */
		System.out.println("\nMATRIZ TRASNPORTADA 5X5\n");
		
		for (i = 0; i < T.length; i++) {
			System.out.print(i + ": ");
			
			for (j = 0; j < T[i].length; j++) {
				System.out.print(T[i][j] + " ");
			}
			
			System.out.print("\n");
		}
	}

}
