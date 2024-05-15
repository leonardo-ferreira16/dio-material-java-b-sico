package aulas.modulos.basico;

public class SmartTV {
    boolean ligada = false;
    int canal=1;
    int volume=25;

public void ligar(){
    System.out.println("\nLigando a TV...\n");
    ligada = true;
}
public void desligar(){
    System.out.println("\nDesligando a TV...\n");
    ligada = false;
}
public void aumentarVolume(){
    System.out.println("\nAumentando o volume...\n");
    volume++;
}
public void diminuirVolume(){
    System.out.println("Diminuindo o volume...\n");
    volume--;
}
public void aumentarCanal(){
    canal++;
}
public void diminuirCanal(){
    canal--;
}
}
