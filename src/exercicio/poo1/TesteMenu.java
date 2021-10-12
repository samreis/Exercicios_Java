package exercicio.poo1;

import java.util.Locale;
import java.util.Scanner;

public class TesteMenu {

	public static void main(String[] args) {

		// Criação do novo objeto Locale
		Locale.setDefault(Locale.US);

		// Instanciando novo objeto Scanner para entrada de dados;
		Scanner leitor = new Scanner(System.in);

		// Declarando e inciando variável para receber opções do Menu;
		int numOpcao = 0;

		// Instanciando novo empregado da Classe empregado
		Empregado empregado = new Empregado();

		// Estrutura de repetição while (enquanto)
		while (numOpcao != 5) {

			System.out.println("Selecione a opção desejada: \n\n1. Criar empregado \n2. Calcular salário do mensal\n3. "
					+ "Alterar horas trabalhadas no mês \n4. Alterar salário do empregado \n5. Sair.");

			numOpcao = leitor.nextInt();
			String opcao;

			// Estrutura de decisão condicional:
			// O condicional switch testa o valor contido em uma variável e o compara com os
			// valores fornecidos em cada caso,
			switch (numOpcao) {

			case 1:
			    opcao = "Você escolheu a opção: Criar empregado";

				System.out.println(opcao);

				System.out.println("\nDigite seu nome: ");
				String nome = leitor.next();

				System.out.println("\nDigite as horas trabalhadas: ");
				int horasTrabalhadasNoMes = leitor.nextInt();

				System.out.println("\nDigite seu salario por hora: ");
				float salarioPorHora = leitor.nextFloat();

				empregado.setNome(nome);
				empregado.setHorasTrabalhadasNoMes(horasTrabalhadasNoMes);
				empregado.setSalarioPorHora(salarioPorHora);
				System.out.println(empregado.toString());

				break;
				
				// O comando "break", quando executado, encerra a execução da estrutura onde ele se encontra.

			case 2:
				opcao = "Você escolheu a opção: Calcular salario mensal";

				System.out.println(opcao);
				System.out.printf("Seu salário é: R$ %.2f%n", empregado.calculaSalarioMensal());

				break;

			case 3:
				opcao = "Alterar horas trabalhadas no mês";
				System.out.println("\nVocê escolheu: Alterar as horas trabalhadas no mês \n\nAltere: ");
				horasTrabalhadasNoMes = leitor.nextInt();
				empregado.setHorasTrabalhadasNoMes(horasTrabalhadasNoMes);
				System.out
						.println("Horas trabalhadas alteradas para " + empregado.getHorasTrabalhadasNoMes() + " horas");
				System.out.printf("Seu novo salário é: R$ %.2f%n", empregado.calculaSalarioMensal());

				break;

			case 4:
				opcao = "Alterar salario do empregado";
				System.out.println("\nVocê escolheu: Alterar salario do empregado \n\nAltere: ");
				salarioPorHora = leitor.nextFloat();
				empregado.setSalarioPorHora(salarioPorHora);
				System.out.println(
						"Valor recebido por hora alterado para R$ " + empregado.getSalarioPorHora() + " reais");
				System.out.printf("Seu novo salário é: R$ %.2f%n", empregado.calculaSalarioMensal());

				break;
				
			case 5:
				opcao = "Sair";
				System.out.println("Obrigado por utilizar o sistema!");

				break;

			default:
				opcao = "Opção inválida";
				break;

			/*
			 *  Obs: Caso todos os casos sejam testados e nenhum deles corresponda ao valor
			 * da variável de teste,será executado o bloco de código associado à seção
			 * default (“padrão”) do condicional.
			 */

			}

		} // Fecha o loop;

		leitor.close();
	}

}
