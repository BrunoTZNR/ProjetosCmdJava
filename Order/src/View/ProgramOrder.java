package View;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import Entities.enums.OrderStatus;

public class ProgramOrder {
	
	static final DateTimeFormatter dtf01 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	static final DateTimeFormatter dtf02 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter client data:");
		
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		
		System.out.print("Email: ");
		String clientEmail = sc.next();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate clientBirthDate = LocalDate.parse(sc.next(), dtf02);
		
		Client client = new Client(clientName, clientEmail, clientBirthDate);
		
		System.out.println("Enter order data:");
		
		System.out.print("Status: ");
		String status = sc.next();
		
		Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);
		
		System.out.print("How many items to this order? ");
		int qtdItems = sc.nextInt();
		
		for(int i = 1; i <= qtdItems; i++) {
			System.out.println("Enter #" + i + " item data:");
			
			sc.nextLine();
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem item = new OrderItem(quantity, price, new Product(productName, price));
			
			order.addItem(item);
		}
		
		System.out.println("\nORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();
	}

}
