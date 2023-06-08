package Exerc_vertorEmatrizes;

public class exer_10 {

	public static void main(String[] args) {
		/* Faça um programa que calcule a e exiba quantos números 
		 * pares há em uma matriz 3x5 de inteiros. – usar o comando para 
		 * gerar os números aleatórios entre 0 e 1000. */
		
		int i, j, countPar = 0;
		int [][] matriz	= new int [3][5];
		
		/* PREENCHE A MATRIZ */
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int)Math.round(Math.random() * 1000);
			}
		}
		
		/* CONTA A QTD DE PARES NA MATRIZ */
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] % 2 == 0) {
					countPar++;
				}
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
		
		System.out.print("\nA matriz acima apresenta " + countPar + " números pares.");
	}

}
