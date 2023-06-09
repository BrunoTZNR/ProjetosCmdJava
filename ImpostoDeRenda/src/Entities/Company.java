package Entities;

public class Company extends People{
	private int qtdEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int qtdEmployees) {
		super(name, anualIncome);
		this.qtdEmployees = qtdEmployees;
	}

	public int getQtdEmployees() {
		return qtdEmployees;
	}

	public void setQtdEmployees(int qtdEmployees) {
		this.qtdEmployees = qtdEmployees;
	}
	
	@Override
	public Double taxesPaid() {
		if(qtdEmployees > 16)
			return anualIncome * 0.14;
		else
			return anualIncome * 0.16;
	}
}
