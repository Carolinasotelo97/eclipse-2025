package ciclosAnidados;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in);
	static final int EDAD_LEGAL= 18;
	static final int EDAD_MIN= 1;
	static final int EDAD_MAX= 122;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantPersonas, edad, contMayoresDeEdad = 0;
		double porcentajeMayoresDeEdad;
		
		System.out.println("Ingresá la cantidad de personas: ");
		cantPersonas = Integer.parseInt(input.nextLine());
		
		while(cantPersonas <= 0) {
			System.out.println("Error. Vove a ingresar la cantidad de personas: ");
			cantPersonas = Integer.parseInt(input.nextLine());
		}
		
		for(int i = 1; i <= cantPersonas; i++) {
			System.out.println("Ingresá la edad de la persona " + i + ": ");
			edad =  Integer.parseInt(input.nextLine());
			
			while(!(edad >= EDAD_MIN && edad <= EDAD_MAX)) {
				System.out.println("Error. Volve a ingresar la edad de la persona " + i + ": ");
				edad =  Integer.parseInt(input.nextLine());
			}
			if(edad >= EDAD_LEGAL) {
				contMayoresDeEdad++;
			}
		}
		
		porcentajeMayoresDeEdad = (contMayoresDeEdad * 100.0) / cantPersonas;
		System.out.println(porcentajeMayoresDeEdad + "% de personas fueron mayores de: " + EDAD_LEGAL);

	}

}
