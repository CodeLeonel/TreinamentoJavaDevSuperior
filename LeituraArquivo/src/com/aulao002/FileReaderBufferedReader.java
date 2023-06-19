package com.aulao002;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferedReader {

	public static void main(String[] args) {
		
		String path = "src/planilha.csv";
		
		// FileReader é uma classe padrão para ler Streaming de dados
		FileReader fr = null;
		// BufferedReader gerencia a memória usada para leitura. Leitura mais otimizada e rápida
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch(IOException e) {
			
			System.out.println("Error: " + e.getMessage());
			
		} finally {
			
			try {
				
				if(br != null && fr != null) {
				
					br.close();				
					fr.close();	
				}
				
			} catch(IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	
}
