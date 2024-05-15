package aulas.modulos.basico;

public class BoletimEstudantil {
    public static void main(String [] args){
        int mediaFinal = 7;
        if(mediaFinal<7){
            System.out.println("REPROVADO!");
        }else if(mediaFinal==7){
            System.out.println("Passou raspando!");
        } else {
            System.out.println("APROVADO!");
        }
    }
}
