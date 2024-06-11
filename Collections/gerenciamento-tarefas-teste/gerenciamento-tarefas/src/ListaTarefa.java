import java.util.List;
import java.util.ArrayList;

public class ListaTarefa {
    private List<Tarefa> listaTarefa;

    public ListaTarefa(){
        this.listaTarefa = new ArrayList<>();
    }
    public void adicionarTarefa(String desc, int pr){
        System.out.println("Adicionando tarefa...");
        listaTarefa.add(new Tarefa(desc, pr));
        System.out.println("Tarefa adicionada!");
    }
    public void removerTarefa(String descricao){
        System.out.println("Removendo tarefa...");
        //Criação de uma lista para adicionar as tarefas que deseja remover:
        List<Tarefa> tarefasRemover = new ArrayList<>();
        for(Tarefa tarefa : listaTarefa){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(tarefa);
            } else{
                System.out.println("Errou burro");
            }
        }
        listaTarefa.removeAll(tarefasRemover);
        System.out.println("Tarefa removida!");
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefa.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefa);
    }
}
