package exercicio.poo7;

public class Cerveja {

    private String nome;
    private Tipo tipo;
    private Float preco;

    public Cerveja() {
    }

    public Cerveja(String nome, Tipo tipo, Float preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Float getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Cerveja{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", preco=" + preco +
                '}';
    }
}
