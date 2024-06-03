package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
             
        //ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();

        Atendente atendente = new Atendente();

        atendente.servirMesa();
                
        Cliente cliente = new Cliente();
        cliente.fazerPedido();
        cliente.pagarConta();

        
    }
}
