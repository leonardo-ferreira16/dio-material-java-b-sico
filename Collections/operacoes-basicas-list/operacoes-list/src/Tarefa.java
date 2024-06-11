

public class Tarefa implements Comparable<Tarefa> {
    private String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString(){
        return descricao;
    }

    public int compareTo(Tarefa t1){
        return descricao.compareTo(t1.descricao);
    }
}
