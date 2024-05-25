import java.util.Locale;
import java.util.Scanner;

public class PlanoTelefonico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o plano que deseja adquirir para saber as vantagens: \nOpções: T; M; B");
        String plano = scanner.next();

        switch(plano){
            case "T":{
                System.out.println("\n5Gb Youtube");
            }
            case "M":{
                System.out.println("\nWhatsApp e Instagram gratis");
            }
            case "B":{
                System.out.println("\n100 minutos de ligação\n");
            }
        }
        scanner.close();
    }
}
