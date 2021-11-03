package exercicio.poo03;

import java.util.Locale;
import java.util.Scanner;

// Samantha Alves Reis - 202122146

/**
 * Crie uma classe principal chamada com.teste.Banco que vai manipular as contas.
 */
public class Banco {

    private static final String VOCE_ESCOLHEU_A_OPCAO = "Você escolheu a opção: ";

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Conta contaSimples = new Conta(123, "Zé Carioca");

        String opcao1 = "1. Realizar depósito";
        String opcao2 = "2. Realizar saque";
        String opcao3 = "3. Mostrar saldo";
        String opcao4 = "4. Mostrar informações do titular";
        String opcao5 = "5. Sair";
        String opcaoInvalida = "Opção inválida";

        String perguntarValorDeposito = "\nQual o valor do depósito?";
        String perguntarValorSaque = "\nQual o valor do saque?";
        String mostrarSaldo = "\nSeu saldo é %.2f%n";
        String mostrarInformacoesTitular = "\nNúmero da conta: %d" +
                "\nNome do titular da conta: %s" +
                "\nTipo da conta: %s\n";

        Scanner leitor = new Scanner(System.in);

        System.out.println(contaSimples.toString());

        int opcao = 0;

        while (opcao != 5) {

            System.out.println("\n" + opcao1 +
                    "\n" + opcao2 +
                    "\n" + opcao3 +
                    "\n" + opcao4 +
                    "\n" + opcao5);

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(VOCE_ESCOLHEU_A_OPCAO + opcao1);
                    System.out.println(perguntarValorDeposito);
                    float valorDeposito = leitor.nextFloat();
                    contaSimples.valorDepositado(valorDeposito);
                    break;
                case 2:
                    System.out.println(VOCE_ESCOLHEU_A_OPCAO + opcao2);
                    System.out.println(perguntarValorSaque);
                    float valorSacado = leitor.nextFloat();
                    contaSimples.valorSacado(valorSacado);
                    break;
                case 3:
                    System.out.println(VOCE_ESCOLHEU_A_OPCAO + opcao3);
                    System.out.printf(mostrarSaldo, contaSimples.getSaldo());
                    break;
                case 4:
                    System.out.println(VOCE_ESCOLHEU_A_OPCAO + opcao4);
                    System.out.printf(mostrarInformacoesTitular, contaSimples.getNumero(), contaSimples.getNome(), contaSimples.getTipo());
                    break;
                case 5:
                    System.out.println(VOCE_ESCOLHEU_A_OPCAO + opcao5);
                    break;
                default:
                    System.out.println(opcaoInvalida);
            }
        }
        leitor.close();
    }
}