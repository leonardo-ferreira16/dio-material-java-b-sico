import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        /* 
        //Escreva um algoritmo que calcule a soma dos números de 1 a 15

        int soma = 0;
        for(int i=1; i<=15; i++){
            soma += i;
            System.out.println(soma);
        }
        */


        
        /* 
        // Leia o nome do usuário e escreva o nome dele na tela 10 vezes. 

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        for(int i=1; i<=10; i++){
            System.out.println(i + " - Nome: " + nome);
        }
        */



        //Leia o nome um número do usuário um número N e escreva o nome dele na tela N vezes

        /* 
        System.out.println("Digite o seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite a quantidade de vezes que você deseja printar: ");
        int vezes = scanner.nextInt();

        for(int i=0; i<vezes; i++){
            System.out.println("Seu nome é: " + nome);
        }
        System.out.println("Foi impresso " + vezes + " vezes");
        */



        //Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses numeros
        /* 
        int soma = 0;
        for(int i=1; i<=10; i++){
            System.out.println("Digite o " + i + "º número: " );
            int numero = scanner.nextInt();
            soma+=numero;
        }
        System.out.println("A soma é: " + soma);
        */



        //Leia a idade de 20 pessoas e exiba a soma das idades. 
        /* 
        int soma = 0;
        for(int i=1; i<=20; i++){
            System.out.println("Digite a " + i + "º idade:");
            int idade = scanner.nextInt();

            soma+=idade;
        }
        System.out.println("A soma das idades é: " + soma);
        */



        //Leia a idade de 20 pessoas e exiba a média das idades. 
        /* 
        int soma = 0;
        int media = 0;

        for(int i=1; i<=20; i++){
            System.out.println("Digite a " + i + "º idade: ");
            int idade = scanner.nextInt();

            soma += idade;
            media = soma/i;
        
        }
        System.out.println("A média das idades é: " + media);
        */



        //Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade
        /* 
        int contador = 0;
        for(int i=1; i<=20; i++){
            System.out.println("Digite a " + i + "º idade: ");
            int idade = scanner.nextInt();

            if(idade >= 18){
                contador++;
            } 
        }
        System.out.println("Quantidade de pessoas mariores de idade: " + contador);
        */



        //Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova. 
        

        scanner.close();
    }
}
