package exercicio.poo10;

public class Veiculo {

    protected String placa;
    protected int ano;

    public Veiculo(){
    }
    public Veiculo(String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getPlaca(){
        return placa;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }

    public void exibirDados(){
        System.out.printf("A placa do veículo é %s e o ano de fabricação é %d%n", placa, ano);
    }

}
