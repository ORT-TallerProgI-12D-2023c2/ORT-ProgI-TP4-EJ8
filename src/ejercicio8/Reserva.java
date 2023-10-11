package ejercicio8;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Reserva {

	private String ID;
	private String DNICliente;
	private int nroAsiento;
	
	public Reserva(String iD, String dNICliente, int nroAsiento) {
		ID = iD;
		DNICliente = dNICliente;
		this.nroAsiento = nroAsiento;
	}

	public int getNroAsiento() {
		return nroAsiento;		
	}
	

}