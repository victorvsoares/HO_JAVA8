import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exemplo3_FlatMap {
	
	public static void main(String[] args) {
		
		List<Livro> livros = asList(
				new Livro("Continuous Delivery", 
						asList("Jez Humble", "David Farley")), 
				new Livro("Lean Enterprise: How High Performance Organizations Innovate at Scale", 
						 asList("Jez Humble, Barry O'Reilly, Joanne Molesky")),  
				new Livro("Refactoring: Improving the Design of Existing Code", 
						asList("Fowler")));
		
		Set<String> autores = new HashSet<>();
		
		for(Livro livro : livros) {
			autores.addAll(livro.getAutores());
		}
		
		System.out.println(autores);
		
		System.out.println("\n----------------- JAVA 8 -------------------");
			
	}
	
	static class Livro {
		private String titulo;
		private List<String> autores = new ArrayList<>();
		
		public Livro(String titulo, List<String> autores) {
			this.titulo = titulo;
			this.autores = autores;
		}

		public String getTitulo() {
			return titulo;
		}

		public List<String> getAutores() {
			return autores;
		}
	
	}

}
