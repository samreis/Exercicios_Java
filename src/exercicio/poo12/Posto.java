package exercicio.poo12;

public interface Posto {

    void comprarCombustivel(Combustivel combustivel, String nomePosto);

    void venderCombustivel(String nomePosto, Float litros);

    void litrosRestantes(String nomePosto);

}
