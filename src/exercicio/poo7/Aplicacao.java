package exercicio.poo7;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        Cervejaria cervejaria = new Cervejaria();

        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\n****************** Bem vindo a aplicação da Cervejaria TPB ******************");

        System.out.println("\nEscolha dentre as opções do menu:");

        Integer opcao = 0;

        while (opcao != 4) {
            System.out.println("\n" +
                    "1. Comprar cerveja\n" +
                    "2. Listar cervejas compradas\n" +
                    "3. Valor total gasto em reais das cervejas compradas\n" +
                    "4. Encerrar aplicação");

            System.out.print("\nDigite o numero da opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da cerveja: ");
                    String nome = leitor.next();
                    System.out.println("Escolha entre um dos tipo da cerveja: ");
                    System.out.println("" +
                            "1. Pilsen\n" +
                            "2. Lager\n" +
                            "3. Pale Ale\n" +
                            "4. Bock\n" +
                            "5. Weissbier");
                    int tipo = leitor.nextInt();
                    Tipo tipoCerveja = null;
                    switch (tipo) {
                        case 1:
                            tipoCerveja = Tipo.PILSEN;
                            break;
                        case 2:
                            tipoCerveja = Tipo.LAGER;
                            break;
                        case 3:
                            tipoCerveja = Tipo.PALE_ALE;
                            break;
                        case 4:
                            tipoCerveja = Tipo.BOCK;
                            break;
                        case 5:
                            tipoCerveja = Tipo.WEISSBIER;
                            break;
                    }
                    System.out.println("Digite o preço da cerveja: ");
                    Float preco = leitor.nextFloat();
                    System.out.println("Digite a quantidade que será comprada: ");
                    Integer quantidade = leitor.nextInt();
                    Cerveja cerveja = new Cerveja(nome, tipoCerveja, preco);
                    cervejaria.compraCerveja(cerveja, quantidade);
                    break;
                case 2:
                    cervejaria.listaCervejasCompradas();
                    break;
                case 3:
                    cervejaria.totalizaValorCervejasCompradas();
                    break;
                case 4:
                    System.out.println("\nAplicação encerrada! Obrigado pela utilização!");
                    break;
                default:
                    System.out.println("\nOpção inválida");
                    break;
            }
            leitor.close();
        }
    }
}
