package recursos.multifuncional;

import recursos.aparelho_telefonico.AparelhoTelefonico;
import recursos.navegador.NavegadorInternet;
import recursos.reprodutor_musica.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void ligar(){
        System.out.println("Ligando com o iPhone...");
    }
    public void atender(){
        System.out.println("Atendendo com o iPhone...");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz com o iPhone");
    }
    public void exibirPagina(){
        System.out.println("Exibindo página com o iPhone...");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba no iPhone...");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página no iPhone...");
    }
    public void tocar(){
        System.out.println("Tocando música no iPhone...");
    }
    public void pausar(){
        System.out.println("Pausando música no iPhone...");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando música no iPhone...");
    }

}
