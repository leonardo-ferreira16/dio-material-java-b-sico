import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		System.out.println("---------------------------------------");

		//Criando uma matriz de tamanho dinâmico para receber a coleção de instâncias de livros.
		ArrayList<Livro> livros = new ArrayList<Livro>() {
			{
				add(new Livro("Java - Guia do Programador: Atualizado Para Java 16", "Peter Jandl Junior", 2021));
				add(new Livro("Desenvolvimento Real de Software: Um guia de projetos para fundamentos em Java",
						"Raoul-Gabriel Urma e  Richard Warburton", 2021));
				add(new Livro(
						"Microsserviços Prontos Para a Produção: Construindo Sistemas Padronizados em uma Organização de Engenharia de Software",
						"Susan J. Fowler", 2017));
				add(new Livro("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos",
						"Aditya Y. Bhargava", 2017));
				add(new Livro("Kotlin em Ação", "Dmitry Jemerov e Svetlana Isakova", 2017));
			}
		};

		
		System.out.println("Livros após a ordenação natural (Título): ");

		//Considerando que não foi passado outro argumento no collections.sort(), percebe-se que será considerado o método do comparable que está dentro da classe Livro
		
		Collections.sort(livros);

		//Fazendo um for each para percorrer cada um dos livros adicionados e, para cada um, printa seus dados após serem ordenados
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo() + " - " +
					livro.getAutor() + " - " +
					livro.getAno());
		}

		System.out.println("---------------------------------------");

		System.out.println("Livros após a ordenação por ano: ");

		//Nesse caso, a comparação foi feita instanciando uma classe que tinha um método para comparar os objetos pelo ano e depois ordená-los
		Collections.sort(livros, new CompararAno());
		for (Livro livro : livros) {
			System.out.println(livro.getAno() + " - " +
					livro.getTitulo() + " - " +
					livro.getAutor());
		}

		System.out.println("---------------------------------------");

		System.out.println("Livros após a ordenação por autor: ");

		//Nesse caso, a comparação foi feita instanciando uma classe que tinha um método para comparar os objetos pelo autor e depois ordená-los
		Collections.sort(livros, new CompararAutor());
		for (Livro livro : livros) {
			System.out.println(livro.getAutor() + " - " +
					livro.getTitulo() + " - " +
					livro.getAno());
		}

		System.out.println("---------------------------------------");

		System.out.println("Livros após a ordenação por ano, autor e título: ");

		//Nesse caso, a comparação foi feita instanciando uma classe que tinha um método para comparar os objetos por autor, titulo e ano e depois ordená-los
		Collections.sort(livros, new CompararAnoAutorTitulo());
		for (Livro livro : livros) {
			System.out.println(livro.getAno() + " - " +
					livro.getAutor() + " - " +
					livro.getTitulo());
		}
	}
}