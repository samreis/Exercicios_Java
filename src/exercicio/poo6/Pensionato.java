package exercicio.poo6;

import java.text.ParseException;
import java.util.Scanner;

public class Pensionato {
	public static void main(String[] args) throws ParseException {
		
		
      
		Scanner leitor = new Scanner(System.in);
		Aluguel[] vetor = new Aluguel[10];
		
		System.out.print("Quantos quartos serão alugados?");

		int n = leitor.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			leitor.nextLine();
			String nome = leitor.nextLine();
			System.out.print("Email: ");
			String email = leitor.nextLine();
			System.out.print("Quarto: ");
			int quarto = leitor.nextInt();
			vetor[quarto] = new Aluguel(nome, email);
		}

		System.out.println();
		System.out.println("Quartos alugados: ");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] != null) {
				System.out.println("Quarto " +  i + vetor[i]);
			}
		}
		
		leitor.close();
	}
}