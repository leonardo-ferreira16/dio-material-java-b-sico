import java.util.Comparator;

public class CompararAnoAutorTitulo implements Comparator<Livro> {
    @Override
    //Esse método receb dois objetos e compara os dois com relação a ano, autor e titulo
    public int compare(Livro l1, Livro l2) {
        int ano = Integer.compare(l1.getAno(), l2.getAno());
        if (ano != 0)
            return ano;
        int autor = l1.getAutor().compareTo(l2.getAutor());
        if (autor != 0)
            return autor;
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}
