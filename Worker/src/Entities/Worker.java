package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import Entities.enums.WorkerLevel;

public class Worker {
	private static DateTimeFormatter dtf02 = DateTimeFormatter.ofPattern("MM/yyyy");
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private List<HourContract> contracts = new ArrayList<HourContract>();
	private Department department;
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	
	public Double income(LocalDate date) {
		double sum = baseSalary;
		
		for(HourContract hc : contracts) {
			if(hc.getDate().format(dtf02).equals(date.format(dtf02))) {
				sum += hc.totalValue();
			}
		}
		
		return sum;
	}
}
