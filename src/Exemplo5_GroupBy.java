import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exemplo5_GroupBy {

	public static void main(String[] args) {

		List<Pessoa> pessoas = Arrays.asList(new Pessoa("Maria", 29), new Pessoa("Ana", 50), 
				new Pessoa("Carla", 29));
		
		Map<Integer, List<Pessoa>> map = new HashMap<>();
		for (Pessoa pessoa : pessoas) {
			
			if (map.containsKey(pessoa.getIdade())) {
				List<Pessoa> list = map.get(pessoa.getIdade());
				list.add(pessoa);
			} else {
				List<Pessoa> list = new ArrayList<>();
				list.add(pessoa);
				map.put(pessoa.getIdade(), list);				
			}
		}
		
		System.out.println(map);
		
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
		
		@Override
		public String toString() {
			return nome;
		}

	}

}
