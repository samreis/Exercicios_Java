package exercicio.poo8;

public class Serie {

	private String nome;
	private String sinopse;
	private int quantidadeTemporada;
	private int quantidadeEpisodiosTemporada;

	// construtor vazio
	public Serie() {

	}

	public Serie(String nome, String sinopse, int quantidadeTemporada, int quantidadeEpisodiosTemporada) {
		this.nome = nome;
		this.sinopse = sinopse;
		this.quantidadeTemporada = quantidadeTemporada;
		this.quantidadeEpisodiosTemporada = quantidadeEpisodiosTemporada;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return sinopse;
	}

	public int getQuantidadeTemporada() {
		return quantidadeTemporada;
	}

	public int getQuantidadeEpsodiosTemporada() {
		return quantidadeEpisodiosTemporada;
	}

	public void exibeDados() {
		System.out.printf("Serie: %s\nSinopse: %s\nTemporadas: %d\nNumero de Episódios: %d\n", 
				nome, sinopse,quantidadeTemporada, quantidadeEpisodiosTemporada);

	}

}