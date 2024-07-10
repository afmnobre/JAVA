package Application;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {

	public static void main(String[] args) {

		
		System.out.println("Criando uma lista(ver codigo)");
		List<String> list = new ArrayList<>();
		List<String> compras = new ArrayList<>();
		
		list.add("Lucas");
		list.add("Adilson");
		list.add("Daniel");
		list.add("Matheus");
		list.add("Marta");

		compras.add("Abacaxi");
		compras.add("Maracuja");
		compras.add("Uva");
		compras.add("Melancia");
		compras.add("Mandioca");
		compras.add("Morango");
		compras.add("Banana");
		compras.add("Maracuja");
		compras.add("Alface");
		compras.add("Batata");
				
		System.out.println("-------------------------------");
		System.out.println("Listando Elementos da Lista");
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------------");
		System.out.println("Adicionando Elementos em uma lista ja criada;");
		list.add(2,"Marcos");
		System.out.println("-------------------------------");
		System.out.println("Exibindo a lista novamente");
		System.out.println("-------------------------------");
		System.out.println("Listando Elementos da Lista");
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------------");
		System.out.println("Removendo Elementos de uma lista");
		list.remove("Lucas");
		System.out.println("-------------------------------");
		System.out.println("Listando Elementos da Lista");
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------------");
		System.out.println("Removendo Elementos de uma lista que começam com a letra M");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("-------------------------------");
		System.out.println("Listando Elementos da Lista");
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------------");
		System.out.println("Listando Endereços dos Elementos da Lista");

		System.out.println("-------------------------------");
		System.out.println("Listando Elementos da Lista");
		System.out.println("Posição de Daniel: " + list.indexOf("Daniel"));
		System.out.println("Posição de Adilson: " + list.indexOf("Adilson"));
		
		System.out.println("-------------------------------");
		System.out.println("Listando uma lista de compras para novos exemplos:");
		for(String y : compras) {
			System.out.println(y);
		 }
		System.out.println("-------------------------------");
		System.out.println("Ficar na lista todos os produtos que começam com a letra M:");
		List<String> result = compras.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for(String y : result) {
			System.out.println(y);
		}
		System.out.println("-------------------------------");
		System.out.println("Encontrar o primeiro elemento que tem a primeira letra com U:");
		String produto = compras.stream().filter(x -> x.charAt(0) == 'U').findFirst().orElse(null);
		System.out.println(produto);
	
		
	}

}
