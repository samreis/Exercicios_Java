package exercicio.poo4;

public class Conta {

	private int numero;
	private String titular;
	private float saldo;

	public Conta(int numero, String titular) { // sobrecarga de 2 argumentos
		this.numero = numero;
		this.titular = titular;
	}

	public Conta(int numero, String titular, float depositoInicial) { // sobrecarga de 3 argumentos
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}

	public int getNumero() { // somente get pois numero da conta nao pode ser alterado
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) { 
		this.titular = titular;
	}

	public float getSaldo() { // somente get pois o saldo da conta só pode ser alterado por meio de deposito/saque
		return saldo;
	}
	
	public void deposito(float quantia) {
		saldo += quantia;
	}
	 public void saque(float quantia) {
		 saldo -= quantia + 5.0;
	 }
	 
	 public String toString() {
		 return "Conta "
				 + numero
				 + ", Titular: "
				 + titular
				 +", Saldo: R$ "
				 + String.format("%.2f", saldo);
		 
	 }

}
