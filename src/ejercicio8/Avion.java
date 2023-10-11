package ejercicio8;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Avion {

	private int FILAS;
	private int ASIENTOS_X_FILA;
	private String marca;
	private Asiento[][] asientos;	

	public Avion(int FILAS, int ASIENTOS_X_FILA, String marca) {
		super();
		this.FILAS = FILAS;
		this.ASIENTOS_X_FILA = ASIENTOS_X_FILA;
		this.marca = marca;
		this.asientos = new Asiento[FILAS][ASIENTOS_X_FILA];
		autoGenerarAsientos();
	}

	private void autoGenerarAsientos() {
		for (int f = 0; f < asientos.length; f++) {
			for (int c = 0; c < asientos[f].length; c++) {
				asientos[f][c] = new Asiento(f * ASIENTOS_X_FILA + c + 1);
			}
		}			
	}
	
	public void asignar(int nroAsiento) {
		int laFila = (nroAsiento - 1) / ASIENTOS_X_FILA;
		int laColumna = (nroAsiento - 1) % ASIENTOS_X_FILA;
		asientos[laFila][laColumna].reservar();	
	}
	
	public void mostrarAsientos() {
		UtilArrays.mostrarMatriz(asientos);
	}
	
	public int asientosConVentanillaPorEstado(Estado estado) {
		int cant = 0;
		for (int i = 0; i < FILAS; i++) {
			
			for (int j = 0; j < ASIENTOS_X_FILA; j += ASIENTOS_X_FILA-1) {
				Asiento a = this.asientos[i][j];		
				if (a.getEstado() == estado) {
					cant++;
				}
			}
			
			
		}
		return cant;
	}
	
	
	

}