package exercicio.poo8;

import java.util.ArrayList;
import java.util.List;

public class ServicoStreaming {
	
	// Atributos 
	private String nome;
	private float valorMensal;
	List<Serie> series = new ArrayList<Serie>();
	
	
	// Construtor padrão
	public ServicoStreaming() {
	}

	// Construtor passando dois argumentos como parâmetro 
	public ServicoStreaming(String nome, float valorMensal) {
		this.nome = nome;
		this.valorMensal = valorMensal;
	}

	// Métodos acessores(get) e modificadores(set)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(float valorMensal) {
		this.valorMensal = valorMensal;
	}
	
	// Adiciona único serviço de streaming
	public void adicionaUnicoServicoStreaming(String nome, float valorMensal) {
		this.nome = nome;
		this.valorMensal = valorMensal;
	}
	// Adiciona série dentro de List<Serie> series
	public void adicionaSerie(Serie serie) {
		series.add(serie); 
	}
	
	// Remove uma série do serviço de streaming pelo nome
	public void removeSerie(String nome) {
		series.removeIf(serie -> nome.equals(serie.getNome()));
	}
	
	// Exibe todas as séries disponíveis no catálogo
	public void exibeSeriesCatalogo() {
		
		System.out.printf("Serviço de Streaming %s", nome);
		System.out.printf("\nSeries: \n");
		
		if(series != null) {
			for(Serie serie : series) {
				serie.exibeDados();
				}
		  }
	
	}
	
	// Exibe os valores dos atributos nome e valorMensal do serviço de streaming adicionado
	public void exibeDados() {
		
		System.out.printf("\nServiço de Streaming: %s \nValor Mensal %.2f\n", nome, valorMensal);
	}
	
}


