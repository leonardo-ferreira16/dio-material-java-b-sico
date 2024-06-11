import java.util.Comparator;

public class CompararPrioridade implements Comparator<Tarefa> {
    public int compare(Tarefa t1, Tarefa t2){
        return Integer.compare(t1.getPrioridade(), t2.getPrioridade());
    }
}
