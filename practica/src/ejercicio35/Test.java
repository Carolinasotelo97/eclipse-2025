package ejercicio35;

import java.util.Scanner;

public class Test {

	

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);  
		String nombre;
		String nombreMasJoven;
		int edad;
		int edadMasJoven;

		System.out.println("Ingrese un nombre (o * para finalizar): ");
		nombre = input.nextLine();

		if (nombre.equals("*")) {
			System.out.println("No se ingresaron personas.");

		}else {

			System.out.println("Ingrese edad: ");
			edad = Integer.parseInt(input.nextLine());
	
			nombreMasJoven = nombre;
			edadMasJoven = edad;
	
			System.out.println("Ingrese un nombre (o * para finalizar): ");
			nombre = input.nextLine();
	
			while (!nombre.equals("*")) {
				System.out.println("Ingrese edad: ");
				edad = Integer.parseInt(input.nextLine());
	
				if (edad < edadMasJoven) {
					nombreMasJoven = nombre;
					edadMasJoven = edad;
				}
	
				System.out.println("Ingrese un nombre (o * para finalizar): ");
				nombre = input.nextLine();
			}
			System.out.println("La persona más joven es: " + nombreMasJoven + ", que tiene " + edadMasJoven + " años.");
		}
		
	}

}


