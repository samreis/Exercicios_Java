package exercicio.poo10;

public class Caminhao extends Veiculo {

    private int eixos;

    public Caminhao(){
    }
    public Caminhao(String placa, int ano,int eixos){
        super(placa, ano);
        this.eixos = eixos;
    }
    public void setEixos(int eixos){
        this.eixos = eixos;
    }
    public int getEixos(){
        return eixos;
    }

    public void exibirDados(){
        System.out.printf("A placa do veículo é %s e o ano de fabricação é %d e o numero de eixos é %d%n", placa, ano, eixos);
    }
}
