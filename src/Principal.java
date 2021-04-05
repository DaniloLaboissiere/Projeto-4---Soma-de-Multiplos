import java.util.ArrayList;
import java.util.Collections;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Apresentando a soma dos multiplos de um conjunto de numeros");
		
		Integer[] valores = {3, 5};
		ArrayList<Integer> multiplos = new ArrayList<Integer>();
		
		Collections.addAll(multiplos, valores);
		
		System.out.println(Util.SomaMultiplos(30, multiplos));
	}

}
