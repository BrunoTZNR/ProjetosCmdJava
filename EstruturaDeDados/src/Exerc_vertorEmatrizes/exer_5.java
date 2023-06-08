package Exerc_vertorEmatrizes;

public class exer_5 {

	public static void main(String[] args) {
		/* Preencher uma matriz NOTA de 4 colunas e 10 linhas com as notas de 
		 * cada bimestre do aluno. Calcule e média aritmética de cada linha e 
		 * armazene em um vetor de tamanho 10. – usar o comando para gerar os 
		 * números aleatórios entre 0 e 10. */
		
		int i, j;
		int [][] nota = new int[10][4];
		Float [] media = new Float[10];
		Float sum = (float) 0;
			
		/* ADICIONA AS NOTAS */
		for (i = 0; i < nota.length; i++) {
			for (j = 0; j < nota[i].length; j++) {
				nota[i][j] = (int)Math.round(Math.random() * 10);
			}
		}
		
		/* CALCULA A MÉDIA ARITIMÉTICA */
		for (i = 0; i < nota.length; i++) {
			for (j = 0; j < nota[i].length; j++) {
				sum += nota[i][j];
			}
			
			media[i] = (float) (sum / nota[i].length);
		}
		
		/* MOSTRA AS NOTAS */
		System.out.println("Notas \n");
		
		for (i = 0; i < nota.length; i++) {
			System.out.print((i + 1) + ": ");
			
			for (j = 0; j < nota[i].length; j++) {
				System.out.print(nota[i][j] + " ");
			}
			
			System.out.print("\n");
		}
		
		/* MOSTRA AS MÉDIAS */
		System.out.println("\nMédias \n");
		
		for (i = 0; i < media.length; i++) {
			System.out.println((i + 1) + ": " + media[i]);
		}
	}

}
