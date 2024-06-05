package recursos.navegador;

public class Safari implements NavegadorInternet{
    public void exibirPagina(){
        System.out.println("Exibindo página com o Safari...");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba no Safari...");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página no Safari...");
    }
}
