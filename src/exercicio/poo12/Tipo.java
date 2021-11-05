package exercicio.poo12;

public enum Tipo {

    GASOLINA_COMUM("Gasolina comum"),
    GASOLINA_ADITIVADA("Gasolina aditivada"),
    ETANOL("Etanol"),
    ETANOL_ADITIVADO("Etanol aditivado"),
    DIESEL_COMUM("Diesel comum"),
    DIESEL_ADITIVADO("Diesel aditivado");

    private final String descricao;

    Tipo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
