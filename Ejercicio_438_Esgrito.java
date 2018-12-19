import java.util.Scanner;

public class Ejercicio_438_Esgrito {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		String linia;
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] ABC = abc.toCharArray();
		
		
		while (sc.hasNext()) {
			
			linia = sc.nextLine();
			String LINIA = linia.toUpperCase();
			
			int num_letras = 0;
			char letra;
			int num_ex = 0;
			
			
				char[] vector = LINIA.toCharArray();
				
				for (int i = 0; i < vector.length; i++) {
					
					letra = vector[i];
						
					if (vector[i] == '!') {

						num_ex++;
					}
					
					for (int j = 0; j < ABC.length; j++) {
						
						if (ABC[j] == letra) {
							num_letras++;
						}	
					}

				}
		
				int resultado;
				
				resultado = num_letras - num_ex;
		
				if (resultado >= 0) {
					System.out.println("escrito");
				}
				else {
					System.out.println("ESGRITO");
				}
		
		}
		
		
		
		
		
		
	}

}
