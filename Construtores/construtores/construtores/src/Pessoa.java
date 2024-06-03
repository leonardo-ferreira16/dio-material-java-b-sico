public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    
public Pessoa(String nome, String cpf){//construtor
    this.cpf = cpf;
    this.nome = nome;
}

    public String getNome(){
        return nome;
    }
    public String getCpfc(){
        return cpf;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
