package exercicio.poo09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cervejaria {


    //Criando uma coleção de dados de cerveja que pode aumentar e diminuir dinamicamente
    private List<Cerveja> cervejas = new ArrayList<>();
    private Map<Cerveja, Integer> estoque = new HashMap<>(); // Criando um HashMap para armazenar dados em um par chave-valor

    public Cervejaria() {
    }

    public void vendeCerveja(Cerveja cerveja, Integer quantidade) {
        cervejas.add(cerveja);
        estoque.put(cerveja, quantidade); // atualizar chave ou adicionar nova
    }

    public void listaCervejasVendidas() {
        for (Cerveja cerveja : cervejas) {
            System.out.printf("A cerveja de marca %s do tipo %s e de preço R$ %.2f foram vendidas a quantidade de: %d",
                    cerveja.getMarca(), cerveja.getTipo().getDescricao(), cerveja.getPreco(), estoque.get(cerveja));
        }
        System.out.println();
    }

    public void totalizaValorCervejasVendidas() {
        float valorCervejas = 0.0f;
        for(Cerveja cerveja : cervejas){
            valorCervejas += cerveja.getPreco() * estoque.get(cerveja);
        }
        System.out.printf("O valor total vendido de cervejas é de R$ %.2f", valorCervejas);
    }



}
