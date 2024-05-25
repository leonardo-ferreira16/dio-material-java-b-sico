import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe a sua primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Informe a sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        double soma = nota1 + nota2 + nota3;

        double media = soma/3;

        if(media > 7){
            System.out.println("Parabéns! Sua média foi " + media + " e você foi aprovado\n");
        } else if(media == 7){
            System.out.println("Passou raspando, sua média foi " + media);
        } else {
            System.out.println("Sinto muito! Sua média foi " + media + " e você foi reprovado!\n");
        }
        scanner.close();

    }
}
