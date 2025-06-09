package ejercicioFor;

import java.util.Scanner;

public class factorial {
	
	static final Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int acumulador = 1;
		
		System.out.println("Ingresa un numero: ");
		num = Integer.parseInt(input.nextLine());
		
		
		if(num > 0) {
			for (int i = 1; i <= num; i++) {	
				
				acumulador *= i;
			}
			
			System.out.println("El factorial del numero " + num + " es: " + acumulador);				
				
		}else {
			System.out.println("Error, debe ser un numero natural entero");
		}
		
		
		
		
	}

}
