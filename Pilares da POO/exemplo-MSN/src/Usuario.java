import application.FacebookMessenger;
import application.MSNMessenger;
import application.MessengerGeneral;
import application.Telegram;
import java.util.Scanner;
import java.util.Locale;

public class Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escolha o aplicativo para mandar mensagens: \n1 - MSN\n2 - Facebook\n3 - Telegram");
        int appEscolhido = scanner.nextInt();

        MessengerGeneral mg = null;
        /*
         * Não se sabe qual app 
         * Mas, qualquer um deverá enviar e receber mensagem
         */

        if(appEscolhido == 1){
            mg = new MSNMessenger();
        } else if(appEscolhido == 2){
            mg = new FacebookMessenger();
        } else if(appEscolhido == 3){
            mg = new Telegram();
        }
    
        mg.enviarMensagem();
        mg.receberMensagem();
    
        scanner.close();
    }
}
