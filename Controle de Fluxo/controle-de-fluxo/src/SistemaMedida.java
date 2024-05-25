import java.util.Locale;
import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a sigla do tamanho: ");
        String sigla = scanner.next();
        /* 
        if(sigla == "P"){
            System.out.println("PEQUENO");
        }
        else if(sigla == "M"){
            System.out.println("MÉDIO");
        }
        else if(sigla == "G"){
            System.out.println("GRANDE");
        }
        else {
            System.out.println("INDEFINIDO");
        }
        */
        switch (sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;            
            }
            default:{
                System.out.println("INDEFINIDO");
            } 
        }
        scanner.close();
    }
}
