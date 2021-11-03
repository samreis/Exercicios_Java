package exercicio.poo10;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Veiculo("HTF-8474", 2020));
        veiculos.add(new Veiculo("HSA-8265", 2020));
        veiculos.add(new Veiculo("SAM-6666", 2020));
        veiculos.add(new Caminhao("GTR-8963", 1987,7));

        ArrayList<Caminhao> caminhoes = new ArrayList<>();
        veiculos.add(new Veiculo("LEK-1254",1999 ));
        veiculos.add(new Caminhao("BNG-4984", 2001, 4));

        ArrayList<Onibus> onibusLista = new ArrayList<>();
        veiculos.add(new Veiculo("KOO-1478", 2005));
        veiculos.add(new Onibus("TYS-7653", 2010, 30));

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
        }
        for (Caminhao caminhao : caminhoes) {
            caminhao.exibirDados();
        }
        for (Onibus onibus : onibusLista) {
            onibus.exibirDados();
        }
    }
}
