package exercicio.poo02;

public class Pessoa {

	// atributos
	private String nome;
	private String cpf;
	private int idade;
	private float peso;
	private float altura;

	public Pessoa() {

	}

	public Pessoa(String nome, String cpf) { 
		this.nome = nome;
		this.cpf = cpf;

	}

	public Pessoa(String nome, String cpf, int idade, float peso, float altura) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;

	}

	public float aumentoPeso(float peso) {

		return this.peso = (peso * 0.05f) + peso;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String toString() {
		return "\nNome: " + nome + "\nCPF: " + cpf + "\nIdade: " + idade + "\nPeso: " + peso + "\nAltura: " + altura;

	}

}
