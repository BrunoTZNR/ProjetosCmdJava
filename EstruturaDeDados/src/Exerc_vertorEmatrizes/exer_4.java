package Exerc_vertorEmatrizes;

public class exer_4 {

	public static void main(String[] args) {
		/* Criar duas matrizes A e B de números inteiros e duas dimensões com
		 * 5 linhas e 6 colunas. A matriz A deverá ser formada por valores pares, 
		 * enquanto a matriz B deverá ser formada por valores impares. As entradas 
		 * nas matrizes deverão ser validadas pelo programa e não pelo usuário. 
		 * – usar o comando para gerar os números aleatórios. */
		
		int i, j, countPar, countImpar = 0, num = 0;
		int [][] par = new int[5][6];
		int [][] impar = new int[5][6];
		
		for (i = 0; i < par.length; i++) {
			countPar = 0;
			
			while (countPar < 6) {
				num = (int)Math.round(Math.random() * 50);
				
				if (num % 2 == 0) {
					par[i][countPar] = num;
					countPar++;
				}
			}
		}
		
		for (i = 0; i < impar.length; i++) {
			countImpar = 0;
			
			while (countImpar < 6) {
				num = (int)Math.round(Math.random() * 50);
				
				if (num % 2 != 0) {
					impar[i][countImpar] = num;
					countImpar++;
				}
			}
		}
		
		System.out.println("Par \n");
		
		for (i = 0; i < par.length; i++) {
			System.out.print((i + 1) + ": ");
			
			for (j = 0; j < par[i].length; j++) {
				System.out.print(par[i][j] + " ");
			}
			
			System.out.print("\n");
		}
		
		System.out.println("\nImpar \n");
		
		for (i = 0; i < impar.length; i++) {
			System.out.print((i + 1) + ": ");
			
			for (j = 0; j < impar[i].length; j++) {
				System.out.print(impar[i][j] + " ");
			}
			
			System.out.print("\n");
		}
	}

}
