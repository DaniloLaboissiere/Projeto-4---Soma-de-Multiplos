import java.util.ArrayList;

public class Util {

	
	//soma os numeros naturais **ABAIXO de N** que sejam multiplos da lista de multiplos.
	public static int SomaMultiplos(int N, ArrayList<Integer> listaMultiplos) {
		int soma = 0;
	
		
		for(int i=0; i < N; i++) {
			
			for(int multiplo : listaMultiplos) {
				if(i % multiplo == 0) {
					soma += i;
					break;
				}
			}
		}
		
		return soma;
	}
}

