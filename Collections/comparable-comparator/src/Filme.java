
//Nesse caso, o comparable deve receber o tipo genérico Filme, já que deseja ordenar este
public class Filme implements Comparable<Filme>{
    private String titulo;
    private int ano;

    public Filme(String ti, int an){
        this.titulo = ti;
        this.ano = an;
    }

    public String getTitulo(){
        return titulo;
    }
    public int getAno(){
        return ano;
    }

    //Já que está sendo implementada a interface Comparable, é necessário implementar os métodos dela, que nesse caso é o compareTo()

    //método para ordenar filmes por titulo
    public int compareTo(Filme f1){
        return titulo.compareTo(f1.titulo);
    }
}
