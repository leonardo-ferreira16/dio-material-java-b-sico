import java.util.Scanner;
import java.util.Locale;


public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("===== CALCULADORA =====");
        System.out.println("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = entrada.nextDouble();
            
        System.out.println("Escolha a operação a ser realizada: \n1-Adição;\n2-Subtração;\n3-Multiplicação\n4-Divisão");
        int operacao = entrada.nextInt();
        /* 
        switch(operacao){
            case "1":{
                somar(num1, num2);
                break;
            }
            case "2":{
                subtrair(num1, num2);
                break;
            }
            case "3":{
                multiplicar(num1, num2);
                break;
            }
            case "4":{
                dividir(num1, num2);
                break;
            }
        }
        */
            if(operacao == 1){
                somar(num1, num2);
            } else if(operacao == 2){
                subtrair(num1, num2);
            } else if(operacao == 3){
                multiplicar(num1, num2);
            } else if(operacao == 4){
                dividir(num1, num2);
            }
            
    }
    
    public static void somar(double num1, double num2){
        double soma = num1 + num2;
        System.out.println(soma);
    }
    public static void subtrair(double num1, double num2){
        double sub = num1 - num2;
        System.out.println(sub);
    }
    public static void multiplicar(double num1, double num2){
        double mult = num1 * num2;
        System.out.println(mult);
    }
    public static void dividir(double num1, double num2){
        double div = num1 / num2;
        System.out.println(div);
    }

}
