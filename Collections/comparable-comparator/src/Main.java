import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        System.out.println("---------------------------------------");

        ArrayList<Filme> filmes = new ArrayList<Filme>(){
            {
                add(new Filme("Vingadores", 2012));
                add(new Filme( "Avatar", 2009));
                add(new Filme("StarWars: O Despertar da Força", 2015));
                add(new Filme("Titanic", 1997));
                add(new Filme("Homem-Aranha: Sem Volta Para Casa", 2021));
        }
    };

    System.out.println("Ordenação dos filmes por título: \n");

    //O método collections.sort() deverá ordenar de acordo com o método compareTo() da classe original

    Collections.sort(filmes);

    for(Filme filme : filmes){
        System.out.println(filme.getTitulo() + " - " + filme.getAno());
    }

    System.out.println("---------------------------------------");

    System.out.println("Ordenação dos filmes por ano: \n");

    //Nesse caso, o collections.sort() irá ordenar de acordo com o método presente dentro da instância dessa classe:

    Collections.sort(filmes, new CompararPorAno());

    for(Filme filme : filmes){
        System.out.println(filme.getTitulo() + " - " + filme.getAno());
    }
}
}