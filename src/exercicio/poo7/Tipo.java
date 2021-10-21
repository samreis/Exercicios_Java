package exercicio.poo7;

public enum Tipo {

    PILSEN("Pilsen"),
    LAGER("Lager"),
    PALE_ALE("Pale Ale"),
    BOCK("Bock"),
    WEISSBIER("Weissbier");

    private final String descricao;

    Tipo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
