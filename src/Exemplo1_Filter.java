import java.util.Arrays;
import java.util.List;

public class Exemplo1_Filter {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		for (Integer numero : numeros) {
			if (numero % 2 == 0) {
				System.out.print(numero + " ");
			}
		}
		
		System.out.println("\n----------------- JAVA 8 -------------------");
				
	}

}

