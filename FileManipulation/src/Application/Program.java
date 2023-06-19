package Application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entities.Product;

public class Program {

	public static void main(String[] args) {
		File path = new File("C:\\Users\\bruno\\OneDrive\\Documentos\\ECLIPSE\\FileManipulation\\src\\stock.csv");
		
		List<Product> stock = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				
				String[] x = line.split(",");
				
				stock.add(new Product(x[0], Double.parseDouble(x[1]), Integer.parseInt(x[2])));
				
				line = br.readLine();
			}
			
			String pathOut = path.getParent() + "\\out";
			
			boolean success = new File(pathOut).mkdir();
			
			if(success) {
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut + "\\summary.csv"))) {
					for(Product p : stock) {
						bw.write(p.getName() + "," + p.totalPrice());
						bw.newLine();
					}
				} catch (IOException e) {
					System.out.println("Error : " + e.getMessage());
				}
			} else {
				throw new IOException("subdomain not created");
			}
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
			System.out.println("\nPRODUCTS: ");
			
			for(Product p : stock) {
				System.out.println(p);
			}
		}
	}

}
