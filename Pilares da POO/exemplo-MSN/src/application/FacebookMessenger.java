package application;
public class FacebookMessenger extends MessengerGeneral{
    public void enviarMensagem(){
        validarConectadoInternet();
        salvarHistoricoMensagem();
        System.out.println("ENVIANDO MENSAGEM PELO MSN FACEBOOK MESSENGER");
    }
    public void receberMensagem(){
        System.out.println("RECEBENDO MENSAGEM PELO FACEBOOK MESSENGER");
    }
}
