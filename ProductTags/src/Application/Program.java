package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.*;

public class Program {

	static final Scanner sc = new Scanner(System.in);
	static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int qtdProducts = sc.nextInt();
		
		for(int i = 1; i <= qtdProducts; i++) {
			System.out.println("Product #" + i + " data:");
			
			System.out.print("Common, user or imported (c/u/i): ");
			char typeProduct = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.next();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			switch(typeProduct) {
				case 'i':
					System.out.print("Customs fee: ");
					double customsFee = sc.nextDouble();
					
					products.add(new ImportedProduct(name, price, customsFee));
				break;
				case 'u':
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					LocalDate manufactureDate = LocalDate.parse(sc.next(), dtf);
					
					products.add(new UsedProduct(name, price, manufactureDate));
				break;
				default:
					products.add(new Product(name, price));
			}
		}
		
		System.out.print("\nPRICE TAGS:\n");
		
		for(Product p : products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}
