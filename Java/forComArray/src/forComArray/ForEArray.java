package forComArray;

public class ForEArray {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex", "Lucas"};
		
		for(int i=0; i<vect.length; i++) {
			System.out.println("Sem ArrayString: " + vect[i]);
		}
		
		System.out.println("-------------------------------");
		
		for( String obj : vect) {
			System.out.println("Com ArrayString: " + obj);
		}
		
	}

}
