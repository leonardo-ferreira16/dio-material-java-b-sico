import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por gentileza, digite o número da Agência! ");
        int numero = scanner.nextInt();

        System.out.println("Por gentileza, informe a Agência!" );
        String agencia = scanner.next();

        System.out.println("Por gentileza, informe o seu nome! ");
        String nome = scanner.next();

        System.out.println("Por gentileza, insira seu saldo! ");
        Double saldo = scanner.nextDouble();

        System.out.println("\nOlá, " + nome + ".\n" + "Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + "," + " conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.\n");
        
        scanner.close();
    }
    
}
