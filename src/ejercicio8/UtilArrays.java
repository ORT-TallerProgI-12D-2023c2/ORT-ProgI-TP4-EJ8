package ejercicio8;

public class UtilArrays {
	public static void mostrarMatriz (Object[][] asientos) {
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[i].length; j++) {
				System.out.print(asientos[i][j] + "\t");
			}
			System.out.println();
		}	
				
	}
}
