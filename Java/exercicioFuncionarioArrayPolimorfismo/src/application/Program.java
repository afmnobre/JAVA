package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();
		
		
		System.out.print("Entre com o número de funcionarios: ");
		int numero = sc.nextInt();
		
		System.out.println();
		for (int i=1; i<=numero;i++ ) {
			System.out.println("Funcionário #" + i + " informações: ");
			System.out.print("Terceirizado (s/n)? ");
			char resposta = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			Double horas = sc.nextDouble();
			System.out.print("Valor por hora: ");
			Integer valorPorHora = sc.nextInt();
			if (resposta == 's') {
				System.out.print("Despesa Adional: ");
				 Double despesaAdicional = sc.nextDouble();
				 Funcionario func = new FuncionarioTerceirizado(nome, valorPorHora, horas, despesaAdicional);
				 lista.add(func);
			} else {
				Funcionario func = new Funcionario(nome, valorPorHora, horas);
				lista.add(func);
				/*
				 PODE SER USADO TBM ASSIM COMO ABAIXO: (Sem instanciar o Funcionario)
				 	lista.add(new Funcionario(nome, valorPorHora, horas));
				*/
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS:");
		for (Funcionario func : lista) {
			System.out.println(func.getNome() + " - $ " + String.format("%.2f", func.pagamento()));
		}

		sc.close();
	}

}
