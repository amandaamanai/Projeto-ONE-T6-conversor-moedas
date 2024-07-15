package Principal;

import Conversor.Conversor;

import java.util.Scanner;

    public class Principal extends Conversor {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Scanner indice = new Scanner(System.in);

            while (true) {

                String menu = """
            
            |----------------------------------------------------|
            |_-_-_-_-_-_-_-_-_-_-_-_Menu_-_-_-_-_-_-_-_-_-_-_-_-_|
            |_-_-_-_-_-_-_-_Conversor de Moedas_-_-_-_-_-_-_-_-_-|
            |_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-|
            |                                                    |
            |      Seja bem-vindo(a) ao Conversor de Moedas      |
            |                                                    |
            | 1) - (USD) Dólar >>>>>>>>>>> Real Brasileiro (BRL) |
            | 2) - (EUR) Euro >>>>>>>>>>>> Real Brasileiro (BRL) |
            | 3) - (GBP) Libra Esterlina > Real Brasileiro (BRL) |
            | 4) - (JPY) Iene >>>>>>>>>>>> Real Brasileiro (BRL) |
            | 5) - (ARS) Peso Argentino >> Real Brasileiro (BRL) |
            | 6) - (UYU) Peso Uruguaio >>> Real Brasileiro (BRL) |
            | 7) - Sair                                          |
            |                                                    |
            |----------------------------------------------------|
            
            """;
                System.out.println(menu);
                System.out.print("Escolha uma opção válida: ");
                int opcao = scanner.nextInt();
                scanner.nextLine();

                if (opcao == 7) {
                    System.out.printf("\nObrigado por utilizar o conversor de Moeda! Fim do programa.\n");
                    break;
                }

                System.out.print("Digite o valor que deseja converter: ");
                double valor = indice.nextDouble();

                switch (opcao) {

                    case 1:
                        System.out.printf("\nO valor de %.2f [USD] Dólar corresponde ao valor final de %.2f [BRL] Real Brasileiro\n", valor, converteMoedas("USD", "BRL", valor));
                        break;

                    case 2:
                        System.out.printf("\nO valor de %.2f [EUR] Euro corresponde ao valor final de %.2f [BRL] Real Brasileiro\n", valor, converteMoedas("EUR", "BRL", valor));
                        break;

                    case 3:
                        System.out.printf("\nO valor de %.2f [GBP] Libra Esterlina corresponde ao valor final de %.2f [BRL] Real Brasileiro\n", valor, converteMoedas("GBP", "BRL", valor));
                        break;

                    case 4:
                        System.out.printf("\nO valor de %.2f [JPY] Iene corresponde ao valor final de %.2f [BRL] Real Brasileiro\n", valor, converteMoedas("JPY", "BRL", valor));
                        break;

                    case 5:
                        System.out.printf("\nO valor de %.2f [ARS] Peso Argentino corresponde ao valor final de %.2f [BRL] Real Brasileiro\n", valor, converteMoedas("ARS", "BRL", valor));
                        break;

                    case 6:
                        System.out.printf("\nO valor de %.2f [UYU] Peso Uruguaio corresponde ao valor final de %.2f [BRL] Real Brasileiro\n", valor, converteMoedas("UYU", "BRL", valor));
                        break;

                    default:
                        System.out.print("\nOpção Inválida! Por favor escolha uma opção válida!\n");
                        break;
                }
            }
        }

    }
