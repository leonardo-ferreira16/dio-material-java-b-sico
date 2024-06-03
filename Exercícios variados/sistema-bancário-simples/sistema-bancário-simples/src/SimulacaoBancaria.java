import java.util.Scanner;
import java.util.Locale;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n==== MENU ====\n1-Depositar;\n2-Sacar;\n3-Consultar Saldo;\n4-Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Informe o valor a ser depositado: \n");
                    double valorDepositado = scanner.nextDouble();
                    saldo += valorDepositado;
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Informe o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    if(valorSaque < saldo){
                    saldo -= valorSaque;
                      System.out.printf("Saldo atual: %.1f\n", saldo);
                    } else{
                      System.out.printf("Saldo insuficiente!\n");
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.\n");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        }
        scanner.close();
    }
}
