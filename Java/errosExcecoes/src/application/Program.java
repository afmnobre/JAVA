package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Method1();
	
	
		sc.close();
	}
	public static void Method1 (){
		System.out.println("**METHOD1 START**");
		Method2();
		System.out.println("**METHOD1 END**");
	}
	public static void Method2 (){
		System.out.println("**METHOD2 START**");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Error");
		}

		sc.close();
		System.out.println("**METHOD2 END**");
	}
}
