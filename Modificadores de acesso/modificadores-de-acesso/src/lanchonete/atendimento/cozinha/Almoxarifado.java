package lanchonete.atendimento.cozinha;

public class Almoxarifado {
    private void controlarEntrada(){
        System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
    }
    private void controlarSaida(){
        System.out.println("CONTROLANDO A SAIDA DOS ITENS");
    }
     void entregarIngredientes(){
        System.out.println("ENTREGANDO INGREDIENTES");   
        controlarSaida(); 
    }
     void trocarGas(){
        System.out.println("ATENDENTE TROCANDO O GÁS");
    }
    
}
