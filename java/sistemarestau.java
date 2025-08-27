package javinha.java;
import java.util.Scanner;

public class sistemarestau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----Cardápio----");
        System.out.println("A = Sopa               R$20");
        System.out.println("B = Canja de galinha   R$30");
        System.out.println("C = Marmita pequena    R$14");
        System.out.println("D = Marmita média      R$20");
        System.out.println("E = Marmita grande     R$30");
        System.out.println("--------------------------");

        System.out.print("Deseja fazer o pedido? (S/N): ");
        char resposta = scanner.next().toUpperCase().charAt(0);

        if (resposta == 'N') {
            System.out.println("OK, então voltaremos para o cardápio...");
        } else if (resposta == 'S') {
            double total = 0.0;
            boolean sim = true;

            while (sim) {
                System.out.print("\nQual o seu pedido? (A, B, C, D, E): ");
                char pedido = scanner.next().toUpperCase().charAt(0);

                if (pedido == 'A') {
                    System.out.println("Você pediu a sopa.");
                    total += 20.0;
                } else if (pedido == 'B') {
                    System.out.println("Você pediu a canja de galinha.");
                    total += 30.0;
                } else if (pedido == 'C') {
                    System.out.println("Você pediu a marmita pequena.");
                    total += 14.0;
                } else if (pedido == 'D') {
                    System.out.println("Você pediu a marmita média.");
                    total += 20.0;
                } else if (pedido == 'E') {
                    System.out.println("Você pediu a marmita grande.");
                    total += 30.0;
                } else {
                    System.out.println("Opção inválida! Tente novamente.");
                    continue; // volta pro início do while sem perguntar se quer continuar
                }

                System.out.print("Deseja mais algum pedido? (S/N): ");
                char mais = scanner.next().toUpperCase().charAt(0);

                if (mais == 'N') {
                    sim = false; // termina o pedido
                } else if (mais != 'S') {
                    System.out.println("Resposta inválida! Encerrando o pedido.");
                    sim = false; // encerra por segurança
                }
                // se for 'S', o while continua para novo pedido
            }

            System.out.println("\nTotal do seu pedido: R$" + total);
        } else {
            System.out.println("Resposta inválida!");
        }
    }
}
