package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.*;

public class Program {

	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		List<People> taxesPayer = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int qtdPayers = sc.nextInt();
		
		for(int i = 1; i <= qtdPayers; i++) {
			System.out.println("Tax payer #" + i + " data:");
			
			System.out.print("Individual or Company (i/c): ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double he = sc.nextDouble();
				
				taxesPayer.add(new Individual(name, anualIncome, he));
			} else {
				System.out.print("Number of employees: ");
				int qtdEmployees = sc.nextInt();
				
				taxesPayer.add(new Company(name, anualIncome, qtdEmployees));
			}
		}
		
		System.out.println("\nTAXES PAID:");
		
		double totalTaxes = 0.0;
		
		for(People p : taxesPayer) {
			System.out.println(p.getName() + ": $ " + String.format("%.2f", p.taxesPaid()).replace(",", "."));
			
			totalTaxes += p.taxesPaid();
		}
		
		System.out.printf("\nTOTAL TAXES: $ %.2f%n", totalTaxes);
	}

}
