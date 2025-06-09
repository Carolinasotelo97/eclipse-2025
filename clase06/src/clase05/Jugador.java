package clase05;

public class Jugador {
	// Atributos
	private String nombre;
	private String apellido;
	private boolean esDiestro;
	private double estatura;
	private int edad;
	
	// Constructor
	public Jugador(String nombre, String apellido, boolean esDiestro, double estatura, int edad) {
		// Debería llamar a los setters
		this.nombre = nombre;
		this.apellido = apellido;
		this.esDiestro = esDiestro;
		this.estatura = estatura;
		this.edad = edad;
	}
	
	// Métodos
	void mostrar() {
		System.out.print(getNombre() + " | ");
		System.out.print(apellido + " | ");
		System.out.print(esDiestro + " | ");
		System.out.print(estatura + " | ");
		System.out.println(edad);
	}
	
	String nombreCompleto() {
		return getNombre() + " " + apellido;		
	}
	
	String getNombre() {
		return nombre;		
	}
	
	String getApellido() {
		return apellido;		
	}
	
	void cumplirAnios() {
		edad++;
	}

	public void setNombre(String nom) {
		if (nom.length() >= 3) {
			nombre = nom;
		}		
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
}
