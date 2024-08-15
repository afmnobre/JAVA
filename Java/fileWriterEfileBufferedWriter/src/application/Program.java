package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
	
		String[] lines = new String[] {"Good Morning","Good Afternoon","Good Night"};
		
		String path = "//home//lucas//out.txt";
		//try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { // CRIA NOVO ARQUIVO
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { //ACRESCENTA NO ARQUIVO JA CRIADO
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
