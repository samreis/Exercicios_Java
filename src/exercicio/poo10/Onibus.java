package exercicio.poo10;

public class Onibus extends Veiculo{

    private int assentos;

    public Onibus(){

    }
    public Onibus(String placa, int ano, int assentos){
        super(placa, ano);
        this.assentos = assentos;
    }
    public void setAssentos(int assentos){
        this.assentos = assentos;
    }
    public int getAssentos(){
        return assentos;
    }

    public void exibirDados(){
        System.out.printf("A placa do veículo é %s e o ano de fabricação é %d e o numero de assentos é %d%n", placa, ano, assentos);
    }

}
