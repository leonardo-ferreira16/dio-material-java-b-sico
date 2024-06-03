package application;
public class MSNMessenger extends MessengerGeneral{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("ENVIANDO MENSAGEM PELO MSN MESSENGER");
    }
    public void receberMensagem(){
        System.out.println("RECEBENDO MENSAGEM PELO MSN MESSENGER");
    }
    
}
