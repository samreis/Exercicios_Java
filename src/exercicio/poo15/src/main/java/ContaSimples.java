public class ContaSimples {

    private int numeroConta;
    private String nome;
    private String cpf;
    private double saldo = 0.0;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaSimples(int numeroConta, String nome, String cpf) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.cpf = cpf;
    }

    public void depositar(double valor) {
        if(valor > 0.0){
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (this.saldo >= valor && valor > 0.0) {
            this.saldo -= valor;
        }
    }

    public boolean validarCpf() {
        if (this.cpf.length() == 11) {
            return true;
        }
        return false;
    }
}


