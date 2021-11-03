package exercicio.poo08;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

		ServicoStreaming servicoStreaming = new ServicoStreaming();

		String menu = "1. Adicionar único serviço de streaming\n" 
		               + "2. Adicionar série\n"
				       + "3. Remover série pelo nome\n" 
		               + "4. Exibir séries do catálogo\n"
				       + "5. Exibir dados do serviço de streaming\n" 
		               + "6. Encerrar aplicação";

		System.out.println(menu);
		int opcao = leitor.nextInt();

		while (opcao != 6) {
			switch (opcao) {
			case 1: {
				Scanner lerDados = new Scanner(System.in).useLocale(Locale.US);

				System.out.println("Digite o nome do serviço de streaming");
				String nome = lerDados.nextLine();

				System.out.println("Digite o valor mensal do serviço de streaming");
				float valorMensal = lerDados.nextFloat();

				servicoStreaming.adicionaUnicoServicoStreaming(nome, valorMensal);

				System.out.println("Serviço de streaming adicionado");
				break;
			}
			case 2: {
				Scanner lerDados = new Scanner(System.in).useLocale(Locale.US);

				System.out.println("Digite o nome da série");
				String nome = lerDados.nextLine();

				System.out.println("Digite descrição da série");
				String descricao = lerDados.nextLine();

				System.out.println("Digite a quantidade de temporadas da série");
				int qtdTemporada = lerDados.nextInt();

				System.out.println("Digite a quantidade de episódios que tem em cada temporada");
				int qtdEpisodiosTemporada = lerDados.nextInt();

				Serie serie = new Serie(nome, descricao, qtdTemporada, qtdEpisodiosTemporada);

				servicoStreaming.adicionaSerie(serie);

				System.out.println("Série adicionada");
				break;
			}
			case 3: {
				Scanner lerDados = new Scanner(System.in).useLocale(Locale.US);

				System.out.println("Digite o nome da série");
				String nome = lerDados.nextLine();

				servicoStreaming.removeSerie(nome);

				System.out.println("Série removida");
				break;
			}
			case 4: {
				servicoStreaming.exibeSeriesCatalogo();
				break;
			}
			case 5: {
				servicoStreaming.exibeDados();
				break;
			}
			default: {
				System.out.println("Opção inválida!");
				break;
			}

			}
			System.out.println("\n" + menu);
			opcao = leitor.nextInt();
		}
	}
}