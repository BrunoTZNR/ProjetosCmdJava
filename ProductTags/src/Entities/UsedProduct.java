package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate manufectureDate;

	public UsedProduct(String name, Double price, LocalDate manufectureDate) {
		super(name, price);
		this.manufectureDate = manufectureDate;
	}

	public LocalDate getManufectureDate() {
		return manufectureDate;
	}

	public void setManufectureDate(LocalDate manufectureDate) {
		this.manufectureDate = manufectureDate;
	}

	public static DateTimeFormatter getDtf() {
		return dtf;
	}
	
	@Override
	public String priceTag() {
		return name + " (used) $ " + String.format("%.2f", price).replace(",", ".") +
				" (Manufacture date: " + manufectureDate.format(dtf) + ")";
	}
}
