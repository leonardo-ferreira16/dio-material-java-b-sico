import java.util.Scanner;
import java.util.Locale;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String [] alunos = {"Leonardo", "Lucas", "Maria", "João"};

        double media = calcularMedia(alunos, scanner);

        System.out.printf("Média da turma %.2f", media);
    }

    public static double calcularMedia(String [] alunos, Scanner scanner){
        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma +=nota;
        }
        return soma/alunos.length;
    }
}
