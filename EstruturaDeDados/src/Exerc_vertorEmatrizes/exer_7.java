package Exerc_vertorEmatrizes;

public class exer_7 {

	public static void main(String[] args) {
		/* Gerar N números inteiros aleatórios no intervalo de 0 a 1000
		 * e preencha um vetor de 100 elementos, ao final que exiba o 
		 * maior e o menor inteiro em um vetor */
		
		int i, maior = 0, menor = 1000;
		int [] n = new int [100];
		
		/* PREENCHER O ARRAY */
		for (i = 0; i < n.length; i++) {
			n[i] = (int)Math.round(Math.random() * 1000);
		}
		
		/* ACHAR O MAIOR E MENOR */
		for (i = 0; i < n.length; i++) {
			if (maior < n[i]) {
				maior = n[i];
			}
			
			if (menor > n[i]) {
				menor = n[i];
			}
		}
		
		System.out.println("Maior número: " + maior + 
			 	           "\nMenor número: " + menor);
	}

}
