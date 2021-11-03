package exercicio.poo05;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String menu = "\n1. Cadastrar pessoa na agenda"
                + "\n2. Remover pessoa da agenda"
                + "\n3. Buscar pessoa na agenda"
                + "\n4. Imprime os dados de todas as pessoas da agenda"
                + "\n5. Imprime os dados da pessoa da agenda, de acordo com a posição informada"
                + "\n6. Sair";

        String digiteOpcao = "\nDigite o numero da opção desejada:";
        int opcao = 0;

        Agenda agenda = new Agenda();

        do {
            System.out.println(menu);
            Scanner ler = new Scanner(System.in);
            try {
                System.out.println(digiteOpcao);
                opcao = ler.nextInt();
                Scanner lerDados = new Scanner(System.in);
                switch (opcao) {
                    case 1: { // Cadastrar pessoa na agenda
                        if (agenda.getIndice() < 10) {
                            System.out.println("Digite o nome");
                            String nome = lerDados.next();

                            System.out.println("Digite a idade");
                            int idade = lerDados.nextInt();

                            System.out.println("Digite a altura");
                            float altura = lerDados.nextFloat();

                            agenda.armazenaPessoa(nome, idade, altura);
                        } else {
                            System.out.println("A agenda atingiu a quantidade limite de 10 pessoas armazenadas");
                        }
                        break;
                    }
                    case 2: { // Remove a pessoa da agenda pelo nome
                        System.out.println("Digite o nome");
                        String nome = lerDados.next();

                        agenda.removePessoa(agenda.getPessoas(), nome);
                        break;
                    }
                    case 3: { // Busca a pessoa na agenda pelo nome e informa em que posição da agenda ela está
                        System.out.println("Digite o nome");
                        String nome = lerDados.next();

                        agenda.buscaPessoa(nome);
                        break;
                    }
                    case 4: { // Imprime os dados de todas as pessoas da agenda
                        agenda.imprimeAgenda();
                        break;
                    }
                    case 5: { // Imprime os dados da pessoa da agenda através da posição informada
                        System.out.println("Digite o numero da posição");
                        int posicao = lerDados.nextInt();

                        agenda.imprimePessoa(posicao);
                        break;
                    }
                    default: {
                        System.out.println("Opção inválida.");
                        break;
                    }
                }
            } catch (Exception e) {
               System.out.println("Digite um número inteiro!");
            }
        } while (opcao != 6);
        System.out.println("Obrigado por utilizar o sistema!");
    }
}