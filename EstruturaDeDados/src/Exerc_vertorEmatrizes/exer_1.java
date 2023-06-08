package Exerc_vertorEmatrizes;

public class exer_1 {

	public static void main(String[] args) {
		/* Criar uma matriz de 5x5 e ao final exibir a matriz e o somatório 
		 * dos elementos situados acima da diagonal principal, usar o comando 
		 * para gerar os números aleatórios. */
		
		int i, j;
		int [][] x = new int [5][5];
		
		for (i = 0; i < x.length; i++) {
			for (j = 0; j < x[i].length; j++) {
				x[i][j] = (int)Math.round(Math.random() * 100);
			}
		}
		
		for (i = 0; i < x.length; i++) {
			System.out.print(i + ": ");
			
			for (j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
			
			System.out.println("\n");
		}
	}

}
