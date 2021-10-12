package exercicio.poo2;

public class Teste {

	public static void main(String[] args) {


		Pessoa pessoa1 = new Pessoa("Mateus da Silva Sauro", "123456789-01", 24, 51.f, 1.75f);
		Pessoa pessoa2 = new Pessoa("Bruna Jujuba Vermelha", "123456789-02", 40, 45.f, 1.75f);
		Pessoa pessoa3 = new Pessoa("Alice no País das Maravilhas", "123456789-03", 24, 44.f, 1.75f); 
		Pessoa pessoa4 = new Pessoa("Joao e o Pé de Feijão", "123456789-04", 37, 40.f, 1.75f); 
		
		System.out.println("Apresentando dados da pessoa mais velha:");

		if (pessoa1.getIdade() > pessoa2.getIdade() && pessoa1.getIdade() > pessoa3.getIdade()
				&& pessoa1.getIdade() > pessoa4.getIdade()) {
			System.out.println(pessoa1.toString());
		} else if (pessoa2.getIdade() > pessoa1.getIdade() && pessoa2.getIdade() > pessoa3.getIdade()
				&& pessoa2.getIdade() > pessoa4.getIdade()) {
			System.out.println(pessoa2.toString());
		} else if (pessoa3.getIdade() > pessoa1.getIdade() && pessoa3.getIdade() > pessoa2.getIdade()
				&& pessoa3.getIdade() > pessoa4.getIdade()) {
			System.out.println(pessoa3.toString());
		} else {
			System.out.println(pessoa4.toString());
		}

		
		System.out.println("\nAumento de 5% no peso de pessoas na faixa etária de 24 a 38 anos e que estão com peso abaixo de 50.0 kg: ");
		

		if (pessoa1.getIdade() >= 24 && pessoa1.getIdade() <= 38 && pessoa1.getPeso() <= 50) {
			System.out.println(pessoa1.toString());
			System.out.println("Novo peso com aumento de 5%: " + pessoa1.aumentoPeso(pessoa1.getPeso())+ " Kg");  

		}
		if (pessoa2.getIdade() >= 24 && pessoa2.getIdade() <= 38 && pessoa2.getPeso() <= 50) {
			System.out.println(pessoa2.toString());
			System.out.println("Novo peso com aumento de 5%: " + pessoa2.aumentoPeso(pessoa2.getPeso())+ " Kg");
		}
		if (pessoa3.getIdade() >= 24 && pessoa3.getIdade() <= 38 && pessoa3.getPeso() <= 50) {
			System.out.println(pessoa3.toString());
			System.out.println("Novo peso com aumento de 5%: " + pessoa3.aumentoPeso(pessoa3.getPeso())+ " Kg");

		}
		if (pessoa4.getIdade() >= 24 && pessoa4.getIdade() <= 38 && pessoa4.getPeso() <= 50) {
			System.out.println(pessoa4.toString());
			System.out.println("Novo peso com aumento de 5%: " + pessoa4.aumentoPeso(pessoa4.getPeso()) + " Kg");

		}
	}

}
