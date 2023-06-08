package Exerc_vertorEmatrizes;

public class exer_8 {

	public static void main(String[] args) {
		/* Faça um programa que calcule o determinante de uma matriz 3X3
		 *  de números inteiros. – usar o comando para gerar os números aleatórios. 
		 *  Ao final exibir a matriz e o determinante. */
		
		int i, j;
		int [][] matriz = new int [3][3];
		
		/* PREENCHE A MATRIZGERADA */
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int)Math.round(Math.random() * 10);
			}
		}
		
		/* EQUAÇÃO DO DETERMINANTE */
		int det = ((matriz[0][0] * matriz[1][1] * matriz[2][2]) + (matriz[0][1] * matriz[1][2] * matriz[2][0]) + (matriz[0][2] * matriz[1][0] * matriz[2][1])) 
					- ((matriz[2][0] * matriz[1][1] * matriz[0][2]) + (matriz[2][1] * matriz[1][2] * matriz[0][0]) + (matriz[2][2] * matriz[1][0] * matriz[0][1]));
		
		System.out.println(det);
	}

}
