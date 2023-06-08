package Extends;

public class Test {

	public static void main(String[] args) {
		/*Brasileiro brasileiro = new Brasileiro();
		
		brasileiro.setNome("Bruno");
		brasileiro.setIdade(20);
		brasileiro.setRegiao("Centro-Oeste");
		
		System.out.println("Nome: " + brasileiro.getNome() +
				"\nIdade: " + brasileiro.getIdade() + " anos" +
				"\nRegião: " + brasileiro.getRegiao());*/
		
		Brasileiro [] brasileiro = new Brasileiro[5];
		
		brasileiro[0] = new Brasileiro();

		brasileiro[0].setNome("Bruno");
		brasileiro[0].setIdade(20);
		brasileiro[0].setRegiao("Centro-Oeste");
		
		System.out.println("Nome: " + brasileiro[0].getNome() +
				"\nIdade: " + brasileiro[0].getIdade() + " anos" +
				"\nRegião: " + brasileiro[0].getRegiao());
	}

}
