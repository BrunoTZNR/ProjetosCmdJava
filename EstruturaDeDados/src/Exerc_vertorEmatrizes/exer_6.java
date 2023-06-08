package Exerc_vertorEmatrizes;

public class exer_6 {

	public static void main(String[] args) {
		/* Gerar N números inteiros aleatórios de 0 a 1000 e armazene 
		 * num vetor de 10 posições, de forma que seja colocado no vetor, 
		 * apenas aqueles números primos. (preencher todo o vetor) */
		
		int [] primos = new int[10];
		int n = 0, countPrimos = 0;
		
		while (countPrimos < 10) {
			n = (int)Math.round(Math.random() * 1000);
			
			if (n % 2 != 0 && n / n == 1 && n / 1 == n) {
				primos[countPrimos] = n;
				countPrimos++;
			}
		}
		
		System.out.print("Números primos:\n{");
		
		for (n = 0; n < primos.length; n++) {
			if (n == (primos.length - 1)) {
				System.out.print(primos[n] + "}");
			} else {
				System.out.print(primos[n] + ", ");
			}
		}
	}

}
