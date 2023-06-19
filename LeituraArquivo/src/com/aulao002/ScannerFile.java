package com.aulao002;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// Eclipse = Ctrl + Shift + O = Adicionar dependência

public class ScannerFile {

	public static void main(String[] args) {
		
		/* Instrução padrão para Input de dados pelo teclado
		 * Scanner sc = new Scanner(System.in); */
		
		// Maneria de usar Scanner em um arquivo dentro do Eclipse
		File file = new File("src/planilha.csv");
		Scanner sc = null;
		
		try {
		
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				
				String line = sc.nextLine();
				System.out.println(line);
			
			}
			
		} catch (IOException e) {
			
			System.out.println(e);
			
		} finally {

			if(sc != null) {
				sc.close();
			}
		
		}
	}
	
}
