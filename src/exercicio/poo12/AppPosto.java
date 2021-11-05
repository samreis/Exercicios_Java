package exercicio.poo12;

import java.util.Scanner;

public class AppPosto {

    public static void main(String[] args) {

        Posto posto = new PostoImpl();

        String menu = "1. Comprar combustível para posto\n" +
                "2. Vender combustível do Posto\n" +
                "3. Mostrar litros de combustível restante do posto\n" +
                "4. Encerrar aplicação";


        int opcao = 0;
        do {

            System.out.println(menu);
            Scanner input = new Scanner(System.in);
            System.out.println("Digite a opção desejada: ");
            try {
                opcao = input.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Escolha um dos tipos de combustível: ");
                        System.out.println("1. Gasolina comum \n"
                                + "2. Gasolina aditivada\n"
                                + "3. Etanol\n"
                                + "4. Etanol aditivado\n"
                                + "5. Diesel comum\n"
                                + "6. Diesel aditivado\n"
                        );
                        int tipo = input.nextInt();
                        Tipo tipoCombustivel = null;
                        switch (tipo) {
                            case 1:
                                tipoCombustivel = Tipo.GASOLINA_COMUM;
                                break;
                            case 2:
                                tipoCombustivel = Tipo.GASOLINA_ADITIVADA;
                                break;
                            case 3:
                                tipoCombustivel = Tipo.ETANOL;
                                break;
                            case 4:
                                tipoCombustivel = Tipo.ETANOL_ADITIVADO;
                                break;
                            case 5:
                                tipoCombustivel = Tipo.DIESEL_COMUM;
                                break;
                            case 6:
                                tipoCombustivel = Tipo.DIESEL_ADITIVADO;
                                break;
                        }
                        System.out.println("Informar preco do litro do combustível: ");
                        float preco = input.nextFloat();
                        PrecoLitro precoLitro = new PrecoLitro(preco);
                        System.out.println("Informar quantidade de litros de combustível: ");
                        float litros = input.nextFloat();
                        Combustivel combustivel = new Combustivel(tipoCombustivel, precoLitro, litros);
                        System.out.println("Informar nome do posto de combustível");
                        String nomePosto = input.next();
                        posto.comprarCombustivel(combustivel, nomePosto);
                        break;
                    case 2:
                        System.out.println("Nome do posto de venda do combustível: ");
                        String nomePosto1 = input.next();
                        System.out.println("Quantidade de litros vendidos: ");
                        float litros1 = input.nextFloat();
                        posto.venderCombustivel(nomePosto1, litros1);
                        break;
                    case 3:
                        System.out.println("Digite o nome do posto para mostrar a quantidade de litros de combustível restante");
                        String nomePosto2 = input.next();
                        posto.litrosRestantes(nomePosto2);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Por favor, digite um numero correspondente as opções!\n");
            }
        } while (opcao != 4);
    }
}

