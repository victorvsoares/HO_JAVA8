import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplo2_Map {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3 ,4, 5, 6);
		
		List<Integer> potencias = new ArrayList<>(); 
		for (Integer numero : numeros) {
			potencias.add(numero * numero);
		}
		
		for (Integer potencia : potencias) {
			System.out.print(potencia + " ");
		}
		
		System.out.println("\n----------------- JAVA 8 -------------------");
			
		numeros.stream().filter(n -> n % 2 == 0).map(n -> n * n).forEach(p -> System.out.print(p + " "));
		
	}
}
