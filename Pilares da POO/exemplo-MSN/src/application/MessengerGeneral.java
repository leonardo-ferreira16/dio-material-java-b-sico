package application;
public abstract class MessengerGeneral {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected void salvarHistoricoMensagem(){
        System.out.println("Salvando mensagens...");
    }
    
    protected void validarConectadoInternet(){
        System.out.println("VALIDANDO SE ESTÁ CONECTANDO...");
    }
}
