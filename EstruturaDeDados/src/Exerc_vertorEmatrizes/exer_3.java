package Exerc_vertorEmatrizes;

public class exer_3 {

	public static void main(String[] args) {
		/* Criar uma matriz de 3 dimensões, sendo 5 linhas, 3 colunas
		 * e 2 dimensões. Atribuir números inteiros, gerados aleatoriamente 
		 * pra matriz e ao final imprimir a matriz. */
		
		int i, j, k;
		int [][][] matriz = new int [5][3][2];
		
		for (k = 0; k < 2; k++) {
			/* dimensões */
			for (i = 0; i < 5; i++) {
				/* linhas */
				for (j = 0; j < 3; j++) {
					/* colunas */
					matriz[i][j][k] = (int)Math.round(Math.random() * 100);
				}
			}
		}
		
		for (k = 0; k < 2; k++) {
			/* dimensões */
			System.out.println("---" + (k + 1) + "ª Dimensão" + "---");
			
			for (i = 0; i < 5; i++) {
				/* linhas */
				System.out.print(i + ": ");
				
				for (j = 0; j < 3; j++) {
					/* colunas */
					System.out.print(matriz[i][j][k] + " ");
				}
				
				System.out.print("\n");
			}
			
			System.out.print("\n");
		}
	}

}
