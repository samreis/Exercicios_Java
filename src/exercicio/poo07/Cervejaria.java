package exercicio.poo07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cervejaria {

    private List<Cerveja> cervejas = new ArrayList<>();
    private Map<Cerveja, Integer> estoque = new HashMap<>();

    public Cervejaria() {
    }

    public void compraCerveja(Cerveja cerveja, Integer quantidade) {
        cervejas.add(cerveja);
        estoque.put(cerveja, quantidade);
    }

    public void listaCervejasCompradas() {
        for (Cerveja cerveja : cervejas) {
            System.out.printf("%nA cerveja de nome %s do tipo %s e de preço R$ %.2f foram compradas a quantidade de %d.",
                    cerveja.getNome(), cerveja.getTipo().getDescricao(), cerveja.getPreco(), estoque.get(cerveja));
        }
        System.out.println();
    }

    public void totalizaValorCervejasCompradas() {
        Float valorCervejas = 0.0F;
        for (Cerveja cerveja : cervejas) {
            valorCervejas += cerveja.getPreco() * estoque.get(cerveja);
        }
        System.out.printf("%nO valor total gasto para a compra de todas as cervejas é de R$ %.2f%n", valorCervejas);
    }

    @Override
    public String toString() {
        return "Cervejaria{" +
                "cerveja=" + cervejas +
                ", estoque=" + estoque +
                '}';
    }
}
