package ejercicio31;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);  // una vez al principio
	 
		char respuesta;
		 
		
		do {
		
			System.out.print("Desea continuar? [S/N] ");
			respuesta = input.nextLine().toUpperCase().charAt(0);
			
		}while(respuesta != 'N' && respuesta == 'S');
		
		System.out.println("Programa finalizado");
	}

}
