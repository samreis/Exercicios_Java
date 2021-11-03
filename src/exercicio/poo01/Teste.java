package exercicio.poo01;

import java.util.Locale;

public class Teste {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		//Instanciando 4 empregados da classe Empregado
		//E chamando o construtor com os argumentos e atribuindo valores respectivamente;
		Empregado empregado1 = new Empregado("Joao", 9, 36);
		Empregado empregado2 = new Empregado("Maria", 9, 56);
		Empregado empregado3 = new Empregado("Pedro", 9, 76);
		Empregado empregado4 = new Empregado("Ana", 9, 45);
		
		
        // Estrutura condicional composta 01
		if (empregado1.calculaSalarioMensal() > empregado2.calculaSalarioMensal()
				&& empregado1.calculaSalarioMensal() > empregado3.calculaSalarioMensal()
				&& empregado1.calculaSalarioMensal() > empregado4.calculaSalarioMensal()) {
			System.out.printf("O empregado 1 de nome %s trabalhou %d horas e tem o maior salario. Valor: R$ %.2f%n",
					empregado1.getNome(), empregado1.getHorasTrabalhadasNoMes(), empregado1.calculaSalarioMensal());
		} else if (empregado2.calculaSalarioMensal() > empregado1.calculaSalarioMensal()
				&& empregado2.calculaSalarioMensal() > empregado3.calculaSalarioMensal()
				&& empregado2.calculaSalarioMensal() > empregado4.calculaSalarioMensal()) {
			System.out.printf("O empregado 2 de nome %s trabalhou %d horas e tem o maior salario. Valor: R$ %.2f%n",
					empregado2.getNome(), empregado2.getHorasTrabalhadasNoMes(), empregado2.calculaSalarioMensal());

		} else if (empregado3.calculaSalarioMensal() > empregado1.calculaSalarioMensal()
				&& empregado3.calculaSalarioMensal() > empregado2.calculaSalarioMensal()
				&& empregado3.calculaSalarioMensal() > empregado4.calculaSalarioMensal()) {
			System.out.printf("O empregado 3 de nome %s trabalhou %d horas e tem o maior salario. Valor: R$ %.2f%n",
					empregado3.getNome(), empregado3.getHorasTrabalhadasNoMes(), empregado3.calculaSalarioMensal());

		} else {
			System.out.printf("O empregado 4 de nome %s trabalhou %d horas tem o maior salario. Valor: R$ %.2f%n \n",
					empregado4.getNome(), empregado4.getHorasTrabalhadasNoMes(), empregado4.calculaSalarioMensal());

		} // Fim da estrutura condicional composta 01;
		
		// Invocando método do cálculo da média salarial da classe Empregado;
		float mediaSalarial = empregado1.mediaSalarial(empregado1, empregado2, empregado3, empregado4);
		
        // Listando salário dos empregados;
		System.out.println("\nLista de salários dos empregados:");
		System.out.printf("\nO empregado 1 - R$ %.2f%n", empregado1.calculaSalarioMensal());
		System.out.printf("O empregado 2 - R$ %.2f%n", empregado2.calculaSalarioMensal());
		System.out.printf("O empregado 3 - R$ %.2f%n", empregado3.calculaSalarioMensal());
		System.out.printf("O empregado 4 - R$ %.2f%n", empregado4.calculaSalarioMensal());
		
       //Mostrar média do salário dos 4 empregados 
		System.out.printf("\nMedia salarial dos empregados: R$ %.2f%n", mediaSalarial);
		
		
      //Estrutura condicional composta 02 - para verificar salário(s) abaixo da média e aumentar em 20% os que estão abaixo;
		if (empregado1.calculaSalarioMensal() < mediaSalarial) {
			float aumento1 = empregado1.aumentoMediaSalarial(empregado1);

			System.out.printf("\nO empregado %s teve um aumento de vinte por cento e seu novo salário é: %.2f%n",
					empregado1.getNome(), aumento1);

		}
		if (empregado2.calculaSalarioMensal() < mediaSalarial) {
			float aumento2 = empregado2.aumentoMediaSalarial(empregado2);

			System.out.printf("\nO empregado %s teve um aumento de vinte por cento e seu novo salário é: %.2f%n",
					empregado2.getNome(), aumento2);
		}
		if (empregado3.calculaSalarioMensal() < mediaSalarial) {
			float aumento3 = empregado3.aumentoMediaSalarial(empregado3);

			System.out.printf("\nO empregado %s teve um aumento de vinte por cento e seu novo salário é: %.2f%n",
					empregado3.getNome(), aumento3);

		}
		if (empregado4.calculaSalarioMensal() < mediaSalarial) {
			float aumento4 = empregado4.aumentoMediaSalarial(empregado4);

			System.out.printf("\nO empregado %s teve um aumento de vinte por cento e seu novo salário é: %.2f%n",
					empregado4.getNome(), aumento4);
			
			//Fim

		}

	}
}
