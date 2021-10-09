package aplicacao;

public class Empregado {

	// Atributos
	private String nome;
	private int horasTrabalhadasNoMes;
	private float salarioPorHora;
	
	// Construtor declarado vazio para ser utilizado por outra classe através da instanciação; Ex: Empregado empregado = new Empregado();
	public Empregado() {

	}

	// Construtor da classe com argumentos;
	public Empregado(String nome, int horasTrabalhadasNoMes, float salarioPorHora) {
		this.nome = nome;
		this.horasTrabalhadasNoMes = horasTrabalhadasNoMes;
		this.salarioPorHora = salarioPorHora;
   // "this." serve para passar o próprio objeto como argumento na chamada de um método ou construtor;
	}
       
    
	public float calculaSalarioMensal() {

		return this.salarioPorHora * this.horasTrabalhadasNoMes;

	}
   
	public float aumentoMediaSalarial(Empregado empregado) {
		return (empregado.calculaSalarioMensal() * 0.2f) + empregado.calculaSalarioMensal();
	}
	

	public float mediaSalarial (Empregado empregado1, Empregado empregado2, Empregado empregado3, Empregado empregado4) {
		return (empregado1.calculaSalarioMensal() + empregado2.calculaSalarioMensal()
		+ empregado3.calculaSalarioMensal() + empregado4.calculaSalarioMensal()) / 4;
	}
	

	
    // Método acessor "get" serve para obter o valor do atributo;
	public String getNome() {
		return nome;
	}

   // Método modificador "set" serve para modificar o valor do atributo;
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadasNoMes() {
		return horasTrabalhadasNoMes;
	}

	public void setHorasTrabalhadasNoMes(int horasTrabalhadasNoMes) {
		this.horasTrabalhadasNoMes = horasTrabalhadasNoMes;
	}

	public float getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(float salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}
	
    
	@Override // Serve para sobrescrever um método 
	public String toString() {
		return "\nEmpregado(a) criado!\n\nNome: " + nome + "\nHoras trabalhada no mês: " + horasTrabalhadasNoMes
				+ " horas" + "\nValor recebido por hora: R$ " + salarioPorHora;

	}

}
