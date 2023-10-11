package ejercicio8;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Asiento {

	
	private Estado estado;
	private int numero;

	public Asiento(int numero) {
		super();
		this.estado = Estado.LIBRE;
		this.numero = numero;
	}

	public void reservar() {
		this.estado = Estado.RESERVADO;
	}
	
	public String toString() {
		return "A" + String.format("%02d", numero) 
		    + "-E: " + estado.name().charAt(0);
	}

	public Estado getEstado() {
		return estado;
	}
}