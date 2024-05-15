package aulas.modulos.basico;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada: " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("TV ligada: " + smartTV.ligada + "\n");
        smartTV.desligar();
        System.out.println("TV ligada: " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.diminuirCanal();
        System.out.println("Canal: " + smartTV.canal);



    }
}
