package application;
public class Telegram extends MessengerGeneral{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("ENVIANDO MENSAGEM PELO TELEGRAM");
    }
    public void receberMensagem(){
        System.out.println("RECEBENDO MENSAGEM PELO MSN MESSENGER");
    }
}
