package exercicio.poo12;

public class Combustivel {

    private Tipo tipo;
    private PrecoLitro preco;
    private Float litros;

    public Combustivel() {
    }

    public Combustivel(Tipo tipo, PrecoLitro preco, Float litros) {
        this.tipo = tipo;
        this.preco = preco;
        this.litros = litros;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setPreco(PrecoLitro preco) {
        this.preco = preco;
    }

    public PrecoLitro getPreco() {
        return preco;
    }

    public void setLitros(Float litros) {
        this.litros = litros;
    }

    public Float getLitros() {
        return litros;
    }
}
