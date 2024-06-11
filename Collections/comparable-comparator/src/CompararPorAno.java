import java.util.Comparator;

public class CompararPorAno implements Comparator<Filme> {
    public int compare(Filme f1, Filme f2){
        return Integer.compare(f1.getAno(), f2.getAno());
    }
}
