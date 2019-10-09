import static java.util.Objects.*;
import java.util.Optional;

public class Exemplo9_Optional {


	public static void main(String[] args) {
		
		try {

			Pessoa maria = new Pessoa("Maria", "maria@uolinc.com");
			enviarEmail(maria);
			
			System.out.println("\n----------------- JAVA 8 -------------------");
			
			Pessoa2 jose = new Pessoa2("Jose", "jose@uolinc.com");
			enviarEmail2(jose);
			
			Pessoa2 joao = new Pessoa2("Joao");
			enviarEmail2(joao);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void enviarEmail(Pessoa pessoa) {
		
		if (nonNull(pessoa.getEmail())) {
			System.out.println("Enviar email para " + pessoa.getNome());
		} else if (isNull(pessoa.getEmail())) {
			throw new RuntimeException("Email não cadastrado para " + pessoa.getNome());
		}

	}
	
	public static void enviarEmail2(Pessoa2 pessoa) {
		
	}
	
	static class Pessoa {
		
		private String nome;
		private String email;
		
		public Pessoa(String nome) {
			this.nome = nome;
		}
		
		public Pessoa(String nome, String email) {
			this.nome = nome;
			this.email = email;
		}
		
		public String getNome() {
			return nome;
		}
		
		public String getEmail() {
			return email;
		}
		
	}
	
	static class Pessoa2 {
		
		private String nome;
		private String email;
		
		public Pessoa2(String nome) {
			this.nome = nome;
		}
		
		public Pessoa2(String nome, String email) {
			this.nome = nome;
			this.email = email;
		}
		
		public String getNome() {
			return nome;
		}
		
		public Optional<String> getEmail() {
			return Optional.ofNullable(email);
		}
	}
}
