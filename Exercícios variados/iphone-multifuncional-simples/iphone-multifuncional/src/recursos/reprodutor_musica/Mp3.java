package recursos.reprodutor_musica;

public class Mp3 implements ReprodutorMusical{
    public void tocar(){
        System.out.println("Tocando música no MP3...");
    }
    public void pausar(){
        System.out.println("Pausando música no MP3...");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando música no MP3...");
    }
}
