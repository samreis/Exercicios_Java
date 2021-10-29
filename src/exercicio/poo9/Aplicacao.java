package exercicio.poo9;
import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        Cervejaria cervejaria = new Cervejaria();

        System.out.println("\n****************** Bem vindo a aplicação da Cervejaria TPB ******************");

        System.out.println("\nEscolha dentre as opções do menu:");

        Integer opcao = 0;

        while (opcao != 4) {
            System.out.println("\n" +
                    "1. Vender cerveja\n" +
                    "2. Listar cervejas vendidas\n" +
                    "3. Valor total obtido em reais das cervejas vendidas\n" +
                    "4. Encerrar aplicação");

            System.out.print("\nDigite o numero da opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a marca da cerveja: ");
                    String marca = leitor.next();
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
                    float preco = leitor.nextFloat();
                    System.out.println("Digite a quantidade que será comprada: ");
                    Integer quantidade = leitor.nextInt();
                   Cerveja cerveja = new Cerveja(marca, preco, tipoCerveja);
                    cervejaria.vendeCerveja(cerveja, quantidade);
                    break;
                case 2:
                    cervejaria.listaCervejasVendidas();
                    break;
                case 3:
                    cervejaria.totalizaValorCervejasVendidas();
                    break;
                case 4:
                    System.out.println("\nAplicação encerrada! Obrigado pela utilização!");
                    break;
                default:
                    System.out.println("\nOpção inválida");
                    break;
            }
            //leitor.close();
        }
    }
}
