import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplo2_Map2 {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = Arrays.asList(new Pessoa("Maria", 29), new Pessoa("Ana", 50));
		
		List<String> nomes = new ArrayList<>(); 
		for (Pessoa pessoa : pessoas) {
			nomes.add(pessoa.getNome());
		}
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("\n----------------- JAVA 8 -------------------");
		
		
		
		
	}
	
	static class Pessoa {
		
		private String nome;
		
		private int idade;
		
		public Pessoa(String nome, int idade) {
			this.nome = nome;
			this.idade = idade;
		}

		public String getNome() {
			return nome;
		}

		public int getIdade() {
			return idade;
		}
		
	}
}
