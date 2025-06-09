package ejerciciosDoWhile;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantArticulo;
		double precioUnitario;
		double contPrecio = 0;
		char respuesta;
		

		
		do {
			System.out.println("Ingresa la cantidad de un articulo: ");
			cantArticulo = Integer.parseInt(input.nextLine());
			
			System.out.println("Ingresa el precio unitario: ");
			precioUnitario = Double.parseDouble(input.nextLine());
			contPrecio += cantArticulo * precioUnitario;

			System.out.print("Desea continuar? [S/N]: ");
			respuesta = input.nextLine().charAt(0);
			
		
		}while(respuesta != 'n' && respuesta != 'N' ); // !(respuesta == 'n' || respuesta == 'N') 
		
		System.out.println("El monto total del ticket es de: $ "+ contPrecio);
	}

}
