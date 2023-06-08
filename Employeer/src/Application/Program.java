package Application;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import Entities.*;

public class Program {

	static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employyes: ");
		int qtdEmployees = sc.nextInt();
		
		for(int i = 1; i <= qtdEmployees; i++) {
			System.out.println("Employee #" + i + " data:");
			
			System.out.print("Outsource (y/n)? ");
			char typeEmployee = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(typeEmployee == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				employees.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				employees.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.print("\nPAYMENTS:\n");
		
		for(Employee e : employees) {
			System.out.println(e);
		}
		
		sc.close();
	}

}
