package ejercicioFor;

import java.util.Scanner;

public class Edades {
	
	static final int EDAD_MINIMA = 18;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		int cantPersonas;
		int edades;
		int contEdades = 0;
		double porcentaje;
		
		System.out.println("Ingrese la cantidad de personas: ");
		cantPersonas = Integer.parseInt(input.nextLine());
		
		if(cantPersonas <= 0) {
			System.out.println("Debe ingresar un numero valido");
		}else {
			for(int i= 1; i <= cantPersonas; i++) {
				System.out.println("Ingrese la edad de la persona " + i + ": ");
				edades = Integer.parseInt(input.nextLine());
				
				if(edades >= EDAD_MINIMA) {
					contEdades++;
				}
				
			}
		
			porcentaje = (double) (contEdades *100)/ cantPersonas;
			System.out.println("El porcentaje de personas mayores de edad es de: "+porcentaje);
		}

	}

}
