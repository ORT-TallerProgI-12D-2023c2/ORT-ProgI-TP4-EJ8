package ejercicio8;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

	public static void main(String[] args) {
		Aerolinea flyOrt = new Aerolinea();
		
		flyOrt.agregarReserva(new Reserva("fake1", "3124234", 50));
		flyOrt.agregarReserva(new Reserva("asdsad", "1321234", 71));
		flyOrt.agregarReserva(new Reserva("asd3wfers", "65645756", 90));
		flyOrt.agregarReserva(new Reserva("4132rffcv", "14235676", 33));
		flyOrt.agregarReserva(new Reserva("asdwed32", "25472652", 1));
		flyOrt.agregarReserva(new Reserva("adasdfzdvc", "234523624", 96));
		flyOrt.agregarReserva(new Reserva("adasdfzdvc", "234523624", 17));
		
		flyOrt.asignar();
		
		int cant = flyOrt.asientosConVentanillaPorEstado(Estado.LIBRE);
		System.out.println("Cant: " + cant);
	}
	
	

}