package program;

import java.util.Scanner;

public class MatrizExercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Criação de MATRIZ");
		System.out.println("---------------------------------");
		
		System.out.print("Quantidade de Linhas: ");
		int L = sc.nextInt();
		System.out.print("Quantidade de Colunas: ");
		int C = sc.nextInt();
		
		//CRIAÇÃO DE MATRIZ
		int [][] Matriz = new int[L][C]; 
		
		System.out.println("---------------------------------");
		
		for(int i=0; i<L; i++) {
			for(int j=0; j<C; j++) {
				Matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("---------------------------------");
		
		for(int i=0; i<L; i++) {
			for(int j=0; j<C; j++) {
				System.out.print("| " + Matriz[i][j]);
			}
			System.out.println(" |");
		}
		System.out.println("---------------------------------");
		System.out.print("Digite o numero para pesquisar na MATRIZ: ");
		int procNum = sc.nextInt();

		for(int i=0; i<L; i++) {
			for(int j=0; j<C; j++) {
				if(Matriz[i][j] == procNum) {
					System.out.println("Position: " + i + ", " +j);
					if(j > 0) {
						System.out.println("Left: " + Matriz[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Up: " + Matriz[i-1][j]);
					}
					if(j < Matriz[i].length-1) {
						System.out.println("Right: " + Matriz[i][j+1]);
					}
					if(i < Matriz.length-1) {
						System.out.println("Down: " + Matriz[i+1][j]);
					}
				}
			}
		}
		
		
	}

}
