package teste;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    //Locale.setDefault(Locale.US);
    private static final String VOCE_ESCOLHEU_A_OPCAO = "Voce escolheu a opção";

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Samantha", 34996483290L, 100.00F);

    String opcao1 = "1. Realizar recarga no telefone";
    String opcao2 = "2. Fazer ligacao";
    String opcao3 = "3. Mostrar saldo da conta";
    String opcao4 = "4. Mostrar salado do telefone";
    String opcao5 = "5. Apresentar informações do cliente";
    String opcao6 = "6. Sair";
    String opcaoInvalida = "Opção inválida";


    String perguntarValorRecarga = "\nQual o valor da recarga?";
    String perguntarQuantasLigacoes = "\nQuantas ligações realizadas?";
    String mostrarSaldoDaConta = "\nSeu saldo é %.2f\n";
    String mostrarSaldoTelefone = "\nSeu saldo em sua linha de telefone é %.2f\n";
    String mostrarInformacoesCliente = "\nNome: %d" +
            "\nTelefone: %f" +
            "\nSaldo em conta: %s\n" +
            "\nSaldo do telefone: ";

    Scanner leitor = new Scanner(System.in);

    System.out.println(cliente.toString());


    int opcao = 0;

        while(opcao !=6)

    {


        System.out.println("\n" + opcao1 +
                "\n" + opcao2 +
                "\n" + opcao3 +
                "\n" + opcao4 +
                "\n" + opcao5 +
                "\n" + opcao6);

        opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(VOCE_ESCOLHEU_A_OPCAO + opcao1);
                System.out.println(perguntarValorRecarga);
                float valorRecarga = leitor.nextFloat();
                cliente.fazerRecarga(valorRecarga);
                break;

            case 2:
                System.out.println(VOCE_ESCOLHEU_A_OPCAO + opcao2);
                System.out.println(perguntarQuantasLigacoes);
                int qtdLigacao = leitor.nextInt();
                cliente.fazerLigacao(qtdLigacao);
                break;

            case 3:
                System.out.println(VOCE_ESCOLHEU_A_OPCAO + opcao3);
                System.out.printf(mostrarSaldoDaConta, cliente.getSaldoEmConta());
                break;

            case 4:
                System.out.println(VOCE_ESCOLHEU_A_OPCAO + opcao4);
                System.out.printf(mostrarSaldoTelefone, cliente.getSaldoTelefone());
                break;

            case 5:
                System.out.println(VOCE_ESCOLHEU_A_OPCAO + opcao5);
                System.out.println(cliente.toString());

                break;

            case 6:

                System.out.println(VOCE_ESCOLHEU_A_OPCAO + opcao6);
                break;

            default:
                System.out.println(opcaoInvalida);
        }
    }
        leitor.close();
 }

}


