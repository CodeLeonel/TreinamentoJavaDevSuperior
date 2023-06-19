package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

public static void main(String[] args) {
		
     	String path = "src/spreadsheet.csv";
		
     	List<Product> list = new ArrayList<Product>(); 
     	
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				
				String[] vect = line.split(",");
				
				String name = vect[0];
				
				Double price = Double.parseDouble(vect[1]);
				
				Integer quantity = Integer.parseInt(vect[2]);
				
				list.add(new Product(name, price, quantity));
				
				line = br.readLine();
			}
			
			System.out.println("PRODUCTS:");
			for(Product p: list) {
				System.out.println(p);
			}
			
		} catch(IOException e) {
			
			System.out.println("Error: " + e.getMessage());
			
		}
		
	}
	
}
