public class Tarefa implements Comparable<Tarefa> {
    private String descricao;
    private int prioridade;
    
    public Tarefa(String desc, int pr){
        this.descricao = desc;
        this.prioridade = pr;
    
    }

    public Tarefa(String descricao){
        this.descricao=descricao;
    }

    public String getDescricao(){
        return descricao;
    }
    public int getPrioridade(){
        return prioridade;
    }

    public int compareTo(Tarefa t1){
        return descricao.compareTo(t1.descricao);
    }
}
