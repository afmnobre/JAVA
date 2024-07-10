package application;

public class objetoVariavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x =  20;
		Object obj = x;
		
		System.out.println(obj);
		
		int y = (int) obj;
		System.out.println(y);
		
		System.out.printf("%nWRAPER CLASS%n----------------%n");
		System.out.println("Interger - em vez de int");
		System.out.println("Double - em vez de double");
		System.out.println("*Essas instancias podem ter o valor NULO*");
		System.out.printf("%nEXEMPLO:%n----------------%n");
		System.out.println("public String name;");
		System.out.println("public Double price;");
		System.out.println("public Integer quantity;");
		
		
	}

}
