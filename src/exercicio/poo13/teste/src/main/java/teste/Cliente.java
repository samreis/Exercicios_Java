package teste;

public class Cliente {


    private String nome;
    private long telefone;
    private float saldoEmConta;
    private float saldoTelefone;

    public Cliente(String nome, long telefone, float saldoEmConta) {
        this.nome = nome;
        this.telefone = telefone;
        this.saldoEmConta = saldoEmConta;
    }

    public Cliente(float saldoTelefone) {
        this.saldoTelefone = saldoTelefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return Math.toIntExact(telefone);
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public double getSaldoEmConta() {
        return saldoEmConta;
    }

    public void setSaldoEmConta(float saldoEmConta) {
        this.saldoEmConta = saldoEmConta;
    }

    public double getSaldoTelefone() {
        return saldoTelefone;
    }

    public void setSaldoTelefone(float saldoTelefone) {
        this.saldoTelefone = saldoTelefone;
    }

    public void fazerRecarga(float valorRecarga){
     this.saldoEmConta -= valorRecarga;
     this.saldoTelefone += valorRecarga;

    }

    public void fazerLigacao(int qntLigacao){
        float valorLigFixo = 2.00F;
        float valorLigacao = qntLigacao * valorLigFixo;
        this.saldoTelefone -= valorLigacao;
    }



    @Override
    public String toString() {
        return "Cliente: " +
                "Nome= " + nome  +
                ", Telefone = " + telefone +
                ", Saldo da Conta = R$" + saldoEmConta +
                ", Saldo do telefone = " + saldoTelefone;
    }

}

