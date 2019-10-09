import java.util.Arrays;
import java.util.List;

public class Exemplo4_AllAny {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

		boolean all = true;
		for (Integer numero : numeros) {
			
			if (numero != 3) {
				all = false;
				break;
			}
		}

		boolean any = false;
		for (Integer numero : numeros) {
			
			if (numero == 3) {
				any = true;
				break;
			}
		}
		
		System.out.println(all);
		System.out.println(any);

		System.out.println("\n----------------- JAVA 8 -------------------");


	}

}
