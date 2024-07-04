package application;
import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class RaioCirculo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Calculator calc = new Calculator(); // INSTANCIANDO
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		//double c = calc.circumference(radius); //INSTANCIANDO
		//double v = calc.volume(radius); //INSTANCIANDO
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
				
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Value: %.2f%n", v);
		//System.out.printf("PI value: %.2f%n", calc.PI ); //INSTANCIANDO
		System.out.printf("PI value: %.2f%n", Calculator.PI );
		
		sc.close();
	}
	



}
