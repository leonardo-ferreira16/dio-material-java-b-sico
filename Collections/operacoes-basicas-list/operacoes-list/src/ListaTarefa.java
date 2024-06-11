import java.util.List;
import java.util.ArrayList;
//import java.util.Collections;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        //sempre que instancia um objeto ListaTarefa, automaticamente tem-se um atributo tarefaList que tem um ArrayList esperando
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        System.out.println("Adicionando tarefa...");
        tarefaList.add(new Tarefa(descricao));
        System.out.println("Tarefa adicionada!");
    }
    public void removerTarefa(String descricao){
        System.out.println("Removendo tarefa...");
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa tarefa : tarefaList){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
        System.out.println("Tarefa removida!");
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }
    
}
