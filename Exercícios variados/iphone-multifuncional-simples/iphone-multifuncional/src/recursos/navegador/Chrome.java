package recursos.navegador;

public class Chrome implements NavegadorInternet {
    public void exibirPagina(){
        System.out.println("Exibindo página com o Chrome...");
    }
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba no Chrome...");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando página no Chrome...");
    }
}
