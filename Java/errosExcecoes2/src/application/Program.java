package application;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		
		Scanner sc  = new Scanner(System.in);
		Scanner sc2 = null; //SCANNER PARA LER O ARQUIVO TXT

		//Verificando a existencia do arquivo TXT
		File caminhoArquivo = new File("/home/lucas/texto.txt");
		if(caminhoArquivo.exists()) {
			System.out.println("O arquivo ja existe.");
		}else {
			System.out.print("Criar arquivo? (s/n) ");
			char resposta = sc.next().charAt(0);
					
			if (resposta == 's') {
		
				FileWriter arquivo = new FileWriter("/home/lucas/texto.txt");
				PrintWriter gravarArquivo = new PrintWriter(arquivo);
				
				gravarArquivo.printf("+ LINHA 1 \n");
				gravarArquivo.printf("+ LINHA 2");
				
				arquivo.close();
				
				System.out.println("O arquivo foi criado com sucesso!");
			}
		}
				
		try {
			//Instancia o Arquivo TXT no SCANNER e imprime na tela com o WHILE.
			sc2 = new Scanner(caminhoArquivo);
			while (sc2.hasNextLine()){
				System.out.println(sc2.nextLine());
			}
		
			System.out.print("Deletar o arquivo? (s/n) ");
			char resposta2 = sc.next().charAt(0);
					
			if (resposta2 == 's') {
					if(caminhoArquivo.delete()) {
					System.out.println("O arquivo foi deletado com sucesso!");
				}
			} else {
				System.out.println("É bom deletar o arquivo.");
			}	
		
		}
		catch (FileNotFoundException e) {
			System.out.println("Error Opening file: " + e.getMessage());
		}
		finally {
			if (sc2 != null) {
				sc2.close();
			}
		}
				
		sc.close();
	}

}
