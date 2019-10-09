import static java.math.BigDecimal.ZERO;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Exemplo8_Reduce {

	
	public static void main(String[] args) {
		
		List<Funcionario> funcionarios = Arrays.asList(new Funcionario("Joaquina", new BigDecimal(2500)), 
					new Funcionario("Joaquim", new BigDecimal(6000)), 
					new Funcionario("Jurema", new BigDecimal(10000)));
		
		
		funcionarios.forEach(f -> System.out.println(f.getNome() + " recebe R$ " + f.getSalario()));

		BigDecimal valorTotal = ZERO;
		for (Funcionario funcionario : funcionarios) {
			valorTotal = valorTotal.add(funcionario.getSalario());
		}
		
		System.out.println("Valor da folha de pagamento " + valorTotal);
		
		System.out.println("\n----------------- JAVA 8 --------------------");
		
		
	}
	
	static class Funcionario {
		
		private String nome;
		private BigDecimal salario;
		
		public Funcionario(String nome, BigDecimal salario) {
			this.nome = nome;
			this.salario = salario;
		}

		public String getNome() {
			return nome;
		}

		public BigDecimal getSalario() {
			return salario;
		}
		
	}
}
