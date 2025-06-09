package ejercicio29;

import java.util.Scanner;

public class Test {
	static int ANIO_ACTUAL= 2025;
	public static Scanner input = new Scanner (System.in); 
	
	public static void main(String[] args) {
		
		int anioNacimiento;
		int calcularEdad;
		
		System.out.printf("Ingresa tu año de nacimiento: ");
		anioNacimiento = Integer.parseInt(input.nextLine());
		
		calcularEdad = ANIO_ACTUAL - anioNacimiento;
		
		System.out.println("tu edad es: " + calcularEdad);
	}
}
