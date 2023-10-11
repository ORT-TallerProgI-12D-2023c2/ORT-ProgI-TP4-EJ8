package ejercicio8;

import java.util.ArrayList;
import java.util.List;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Aerolinea {

	private List<Reserva> reservas;
	private Avion avion;

	public Aerolinea() {
		super();
		this.reservas = new ArrayList<>();
		this.avion = new Avion(16, 6, "Boeing");
	}
	
	public void agregarReserva(Reserva r) {
		this.reservas.add(r);
	}

	public void asignar() {
		avion.mostrarAsientos();
		for (Reserva reserva : reservas) {
			this.avion.asignar(reserva.getNroAsiento());
		}
		System.out.println("//////////////////////////////////////////////");
		avion.mostrarAsientos();
	}

	public int asientosConVentanillaPorEstado(Estado reservado) {
		return this.avion.asientosConVentanillaPorEstado(reservado);
	}

}