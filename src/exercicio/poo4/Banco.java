package exercicio.poo4;

import java.util.Locale;
import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		Conta conta;

		System.out.print("Entre com o numero da conta: ");
		int numero = leitor.nextInt();
		System.out.println("Entre com o nome do titular: ");
		leitor.nextLine();
		String titular = leitor.nextLine();
		System.out.println("Deseja realizar um depósito inicial [s/n]?");
		char resposta = leitor.next().charAt(0);

		if (resposta == 's') {
			System.out.println("Entre com o valor do depósito: ");
			float depositoInicial = leitor.nextFloat();
			conta = new Conta(numero, titular, depositoInicial);
		} else {
			conta = new Conta(numero, titular);
		}

		System.out.println();
		System.out.println("\nDados da Conta: ");
		System.out.println(conta);

		System.out.println();
		System.out.println("Entre com o valor do depósito: ");
		float depositoValor = leitor.nextFloat();
		conta.deposito(depositoValor);
		System.out.println("\nDados da Conta atualizados:  ");
		System.out.println(conta);

		System.out.println();
		System.out.println("Entre com o valor para saque: ");
		float saqueValor = leitor.nextFloat();
		conta.saque(saqueValor);
		System.out.println("\nDados da Conta atualizados:  ");
		System.out.println(conta);

		leitor.close();

	}

}
