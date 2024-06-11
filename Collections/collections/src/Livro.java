
//O comparable recebe um genérico que se deseja ordenar, nesse caso, Livro

public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String ti, String au, int an){
        this.titulo = ti;
        this.autor = au;
        this.ano = an;
    }

    // Métodos getters para acessar os dados privados
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    //Já que está sendo implementada a INTERFACE Comparable, é necessário implementar os métodos dela, que nesse caso é o compareTo()

    //método para ordenar livros por ano
    public int compareTo(Livro l1){
        return titulo.compareTo(l1.titulo);
    }
    
}






