package exercicio.poo12;

import java.util.HashMap;
import java.util.Map;

public class PostoImpl implements Posto {

    private String nomePosto;
    private Map<String, Combustivel> combustivel = new HashMap<>();

    public void comprarCombustivel(Combustivel combustivel, String nomePosto) {
        this.combustivel.put(nomePosto, combustivel);

    }

    public void venderCombustivel(String nomePosto, Float litros) {
        try {
            Combustivel combustivel = this.combustivel.get(nomePosto);
            float litrosRestantes = combustivel.getLitros() - litros;
            float valorVenda = combustivel.getPreco().getValorReais() * litros;
            combustivel.setLitros(litrosRestantes);
            this.combustivel.put(nomePosto, combustivel);
            System.out.printf("O posto %s vendeu %.2f litros do combustível %s e o valor da venda foi de R$ %.2f%n ",
                    nomePosto, litros, combustivel.getTipo().getDescricao(), valorVenda);
        } catch (NullPointerException npe) {
            System.out.printf("Posto %s não encontrado\n", nomePosto);
        }
    }

    public void litrosRestantes(String nomePosto) {
        try {
            Combustivel combustivel = this.combustivel.get(nomePosto);
            System.out.printf("O posto %s tem %.2f restantes de litros do combustível %s%n",
                    nomePosto, combustivel.getLitros(), combustivel.getTipo().getDescricao());
        } catch (NullPointerException npe) {
            System.out.printf("Posto %s não encontrado\n", nomePosto);
        }
    }

    public PostoImpl() {

    }

    public PostoImpl(String nomePosto, Map<String, Combustivel> combustivel) {
        this.nomePosto = nomePosto;
        this.combustivel = combustivel;
    }

    public void setNomePosto(String nomePosto) {
        this.nomePosto = nomePosto;
    }

    public String getNomePosto() {
        return nomePosto;
    }

    public void setCombustivel(Map<String, Combustivel> combustivel) {
        this.combustivel = combustivel;
    }

    public Map<String, Combustivel> getCombustivel() {
        return combustivel;
    }


}
