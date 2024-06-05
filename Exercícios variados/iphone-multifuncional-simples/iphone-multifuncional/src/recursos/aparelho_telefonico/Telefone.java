package recursos.aparelho_telefonico;

public class Telefone implements AparelhoTelefonico {
    public void ligar(){
        System.out.println("Ligando com o telefone...");
    }
    public void atender(){
        System.out.println("Atendendo com o telefone...");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz com o telefone...");
    }
}
