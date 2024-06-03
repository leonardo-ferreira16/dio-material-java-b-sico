package lanchonete.atendimento;

public class Atendente {
  public void servirMesa(){
    pegarPedidoBalcao();
    receberPagamento();
    pegarLancheCozinha();
    System.out.println("SERVINDO MESA");
  }  
  private void pegarLancheCozinha(){
    System.out.println("PEGANDO O LANCHE NA COZINHA");
  }
  private void receberPagamento(){
    System.out.println("RECEBENDO PAGAMENTO");
  }
  private void pegarPedidoBalcao(){
    System.out.println("PEGANDO O PEDIDO NO BALCAO");
  }
}
