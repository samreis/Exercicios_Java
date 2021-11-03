package exercicio.poo09;

public class Cerveja {

    private String marca;
    private float preco;
    private Tipo tipo;

    public Cerveja() {
    }

    public Cerveja(String marca, float preco, Tipo tipo) {
        this.marca = marca;
        this.preco = preco;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public float getPreco() {
        return preco;
    }

    public Tipo getTipo() {
        return tipo;
    }
}
