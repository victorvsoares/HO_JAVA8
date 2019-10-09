import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exemplo2_Map {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3 ,4, 5, 6);
		
		List<Integer> raizes = new ArrayList<>(); 
		for (Integer numero : numeros) {
			raizes.add(numero * numero);
		}
		
		for (Integer raiz : raizes) {
			System.out.print(raiz + " ");
		}
		
		System.out.println("\n----------------- JAVA 8 -------------------");
				
	}
}
