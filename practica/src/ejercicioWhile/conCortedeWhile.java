package ejercicioWhile;

import java.util.Scanner;

public class conCortedeWhile {
	public static Scanner input = new Scanner (System.in);
	final static String CORTE = "*";
	final static String NOMBRE_INVALIDO = "@@@@"; //esto lo hacemos para que tengamos algun valor para la variable y ya este inicializada
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, nombreMasJoven = NOMBRE_INVALIDO;
		int edad, minEdad = Integer.MAX_VALUE; //se inicializa con un valor sufiecientemente grande para que cualquier valor que ingresemos sea menor a esta

		System.out.println("Ingresa un nombre ("+ CORTE + " para cortar): ");
		nombre = input.nextLine();
		
	
		while (!nombre.equals(CORTE)) {
			System.out.print("Ingresa su edad para " + nombre + " :");
			edad = Integer.parseInt(input.nextLine());
			
			if(edad < minEdad) {
				minEdad = edad;
				nombreMasJoven = nombre;
				
			}
			//volver a pedir el nombre para que no quede en un bucle infinito. Equivale al contador++
			System.out.println("Ingresa otro nombre ("+ CORTE + " para cortar): ");
			nombre = input.nextLine();
			
		}
		
		if(!nombreMasJoven.equals(NOMBRE_INVALIDO)) {
			System.out.println("La persona mas joven es " + nombreMasJoven + " y tiene " + minEdad + " años");	
		}else {
			System.out.println("No se ingresaron personas.");
		}
			
		
		
	}

}
