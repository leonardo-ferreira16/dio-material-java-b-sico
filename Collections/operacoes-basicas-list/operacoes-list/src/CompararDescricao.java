import java.lang.Comparable;

public class CompararDescricao implements Comparable<Tarefa> {
    public int compareTo(Tarefa t1){
        return getDescricao().compareTo(t1.getDescricao());
    }
}
