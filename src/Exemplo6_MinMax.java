import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exemplo6_MinMax {

	
	public static void main(String[] args) {
		
		List<Funcionario> funcionarios = Arrays.asList(new Funcionario("Joaquina", 17), 
				new Funcionario("Joaquim", 18), 
				new Funcionario("Jurema", 25));
		
		
		int menorIdade = Integer.MAX_VALUE;
		Funcionario funcionarioMaisNovo = null; 
		
		int maiorIdade = 0;
		Funcionario funcionarioMaisVelho = null;
		
		for (Funcionario funcionario : funcionarios) {
			
			if (funcionario.getIdade() < menorIdade) {
				menorIdade = funcionario.getIdade();
				funcionarioMaisNovo = funcionario;
			}
			
			if (funcionario.getIdade() > maiorIdade) {
				maiorIdade = funcionario.getIdade();
				funcionarioMaisVelho = funcionario;
			}
			
		}
		
		System.out.println("O funcionario mais novo é " + funcionarioMaisNovo.getNome());
		System.out.println("O funcionario mais velho é " + funcionarioMaisVelho.getNome());
		
		System.out.println("\n----------------- JAVA 8 -------------------");
		
		Comparator<Funcionario> comparing = Comparator.comparing(f -> f.getIdade());
		funcionarios.stream().min(comparing).ifPresent(f -> System.out.println("O funcionario mais novo é " + f.getNome()));
		funcionarios.stream().max(Comparator.comparing(f -> f.getIdade())).ifPresent(f -> System.out.println("O funcionario mais velho é " + f.getNome()));		
	}
	
	static class Funcionario {
		
		private String nome;
		
		private int idade;
		
		public Funcionario(String nome, int idade) {
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
