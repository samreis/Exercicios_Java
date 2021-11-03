package exercicio.poo03;

public class Conta {

	
	// Samantha Alves Reis - 202122146
	
    /**
     * Número da conta
     */
    private int numero;
    /**
     * Nome do titular da conta
     */
    private String nome;
    /**
     * Tipo da conta (poupança ou conta corrente)
     */
    private String tipo;
    /**
     * O saldo da conta
     */
    private float saldo;

    public Conta() {
        this.saldo = 0.0f;
    }

    public Conta(int numeroDaConta, String nomeDoTitular) {
        this.saldo = 0.0f;
        this.numero = numeroDaConta;
        this.nome = nomeDoTitular;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void valorDepositado(float valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void valorSacado(float valorSaque) {
        this.saldo -= valorSaque;
    }


    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}