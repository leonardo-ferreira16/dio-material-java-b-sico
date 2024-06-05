package principal;

import recursos.aparelho_telefonico.AparelhoTelefonico;
import recursos.aparelho_telefonico.Telefone;
import recursos.navegador.NavegadorInternet;
import recursos.navegador.Chrome;
import recursos.navegador.Safari;
import recursos.reprodutor_musica.ReprodutorMusical;
import recursos.reprodutor_musica.Mp3;
import recursos.multifuncional.Iphone;



public class Ativacao {
    public static void main(String[] args) throws Exception {
        AparelhoTelefonico aparelho = new Telefone();
        NavegadorInternet chrome = new Chrome();
        NavegadorInternet safari = new Safari();
        ReprodutorMusical mp3 = new Mp3();
        Iphone iPhone = new Iphone();

        Iphone iphone = new Iphone();
        AparelhoTelefonico aparelho1 = iphone;
        NavegadorInternet navegador = iphone;
        ReprodutorMusical reprodutor = iphone;


        System.out.println("\nTelefone: \n");
        aparelho.ligar();
        aparelho.atender();
        aparelho.iniciarCorreioVoz();

        System.out.println("\n===========================\n");


        System.out.println("\nNavegador - Chrome: \n");
        chrome.adicionarNovaAba();
        chrome.atualizarPagina();
        chrome.exibirPagina();

        System.out.println("\nNavegador - Safari: \n");
        safari.adicionarNovaAba();
        safari.atualizarPagina();
        safari.exibirPagina();

        System.out.println("\n===========================\n");

        System.out.println("\nReprodutor musical - MP3: \n");
        mp3.selecionarMusica();
        mp3.tocar();
        mp3.pausar();
        
        System.out.println("\n===========================\n");

        System.out.println("\nMultifuncional - iPhone: \n");
        iPhone.adicionarNovaAba();
        iPhone.atender();
        iPhone.tocar();

        System.out.println("\n===========================\n");

        System.out.println("\nTestes de instância:\n");
        aparelho1.atender();
        navegador.adicionarNovaAba();
        reprodutor.tocar();


    }
}
