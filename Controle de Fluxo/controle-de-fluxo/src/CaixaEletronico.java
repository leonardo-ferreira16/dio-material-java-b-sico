import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Digite o valor para saque: ");
        double valorSolicitado = scanner.nextDouble();

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("O novo saldo é: R$ " + saldo);
        } 
        else{
            System.out.println("Você não possui saldo suficiente!");
        }

        scanner.close();
    }
}
