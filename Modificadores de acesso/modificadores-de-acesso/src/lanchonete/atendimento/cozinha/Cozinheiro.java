package lanchonete.atendimento.cozinha;


public class Cozinheiro { 
    
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }
    public void adicionarComboNoBalcao(){
        prepararCombo();
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche(){
        lavarIngredientes();
        selecionarIngredientesLanche();
        fritarIngredientesLanche();
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }
    private void prepararVitamina(){
        lavarIngredientes();
        selecionarIngredientesVitamina();
        baterVitaminaLiquidificador();
        System.out.println("PREPARANDO SUCO");
    }
    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche(){
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }
    private void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }
    private void fritarIngredientesLanche(){
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGUER");
    }
    void pedirTrocarGas(Almoxarifado almoxarife){
        almoxarife.trocarGas();
    }
    void pedirIngredientes(Almoxarifado almoxarife){
        almoxarife.entregarIngredientes();
    }

}
