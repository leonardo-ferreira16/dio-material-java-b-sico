import java.util.Locale;
import java.util.Scanner;

public class AboutMeExcecoes {
    public static void main (String [] args){
        try{
        //criando o scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

       System.out.println("Nome: " + nome + " " + sobrenome);
       System.out.println("Idade: " + idade + " anos");
       System.out.println("Altura: " + altura );

        scanner.close();
        } catch(java.util.InputMismatchException e){
            System.out.println("A altura e idade devem ser numéricos!");
        }
        }
    }

