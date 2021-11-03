package exercicio.poo05;

public class Agenda {

	// Crie uma classe Agenda que possa armazenar 10 pessoas
	// e que seja capaz de realizar as seguintes operações:

	private Pessoa[] pessoas = new Pessoa[10]; // vetor
	private int indice = 0;

	public Pessoa[] getPessoas() {
		return pessoas;
	}

	public int getIndice() {
		return indice;
	}
	// armazena pessoa
	void armazenaPessoa(String nome, int idade, float altura) {
		this.pessoas[this.indice++] = new Pessoa(nome, idade, altura);
	}
	// remove pessoa
	void removePessoa(Pessoa[] vetorPessoa, String nome) {
		boolean encontrou = false;
		for (int i = 0; i < vetorPessoa.length; i++) {
			Pessoa p = vetorPessoa[i];
			try {
				if (p.getNome().compareToIgnoreCase(nome) == 0) {
					encontrou = true;
					for (int j = i; j < vetorPessoa.length - 1; j++) {
						vetorPessoa[j] = vetorPessoa[j + 1];
					}
					vetorPessoa[vetorPessoa.length - 1] = null;

					System.out.printf("%s removid@!", nome);
					break;
				}
			} catch (NullPointerException npe) {
			}
		}
	}
	// informa em que posição da agenda está a pessoa
	int buscaPessoa(String nome) {
		for (int i = 0; i < this.pessoas.length; i++) {
			if (this.pessoas[i] != null) {
				String nomePessoa = this.pessoas[i].getNome();
				if (nome.equals(nomePessoa)) {
					System.out.println("\nInforma em que posição da agenda está a pessoa:");
					System.out.println(
							"A pessoa de nome " + this.pessoas[i].getNome() + " está na posição " + i + " da agenda");
					return i;
				}
			}
		}
		System.out.println("A pessoa de nome " + nome + " não existe na agenda");
		return -1;
	}
	// imprime os dados de todas as pessoas da agenda
	void imprimeAgenda() {
		System.out.println("\nDados de todas as pessoas da agenda:");

		for (int i = 0; i < this.pessoas.length; i++) {
			if (this.pessoas[i] != null) {
				System.out.println("Nome: " + this.pessoas[i].getNome() + ", Idade: " + this.pessoas[i].getIdade()
						+ ", Altura: " + this.pessoas[i].getAltura());
			}
		}
	}
	// imprime os dados da pessoa que está na posição "i" da agenda.
	void imprimePessoa(int index) {
		if (this.pessoas[index] != null) {
			System.out.println("\nDados da pessoa que está na posição " + index + " da agenda:");
			System.out.println("Nome: " + this.pessoas[index].getNome() + ", Idade: " + this.pessoas[index].getIdade()
					+ ", Altura: " + this.pessoas[index].getAltura());
		} else {
			System.out.println("\nDados da pessoa que está na posição " + index + " da agenda:");
			System.out.println("Não existe pessoa que está na posição " + index + " da agenda\n");
		}
	}
	public Pessoa leDados() {
		return null;
	}
}


