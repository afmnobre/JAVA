package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Listando diretórios
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for(File folder : folders) {
			System.out.println(folder);
		}
		//Listando arquivos
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for(File file : files) {
			System.out.println(file);
		}
		//Criando Diretório
		boolean success = new File(strPath + "/subdir").mkdir();
		System.out.println("Directory created sucess " + success);
		
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println();
		
		//TRAZENDO INFORMAÇÕES:
		
		String caminhoDoArquivo = "/home/lucas/in.txt";		
		File arquivo = new File(caminhoDoArquivo);
		
		//Nome:
		System.out.println("getName: " + arquivo.getName());
		//Caminho:
		System.out.println("getParent: " + arquivo.getParent());
		//Path:
		System.out.println("getPath: " + arquivo.getPath());
				
		
		sc.close();
	}
}
