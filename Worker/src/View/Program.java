package View;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Entities.Department;
import Entities.HourContract;
import Entities.Worker;
import Entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf02 = DateTimeFormatter.ofPattern("MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		
		System.out.println("Enter worker data:");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Level: ");
		String level = sc.next();
		
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
		
		System.out.print("How many contracts to this worker? ");
		int qtdContracts = sc.nextInt();
		
		for(int i = 1; i <= qtdContracts; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			LocalDate date = LocalDate.parse(sc.next(), dtf01);
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			
			HourContract hc = new HourContract(date, valuePerHour, hours);
			
			worker.addContract(hc);
		}
		
		System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
		LocalDate date = LocalDate.parse("01/" + sc.next(), dtf01);
		
		System.out.print("Name: " + worker.getName() +
				"\nDepartment: " + worker.getDepartment().getName() +
				"\nIncome for " + date.format(dtf02) + ": " + 
				String.format("%.2f", worker.income(date)));
		
		sc.close();
	}

}
