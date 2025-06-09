package prueba;

import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
		// CODIGO JAVA EMPIEZA Y TERMINA DENTRO DEL MAIN
	
		//ENTRADA
		Scanner input = new Scanner (System.in);  // una vez al principio
		
		String nombre;
		int ventaDelMes;
		int sueldoFijo =44000;
		double porcentaje = 0.16;
		double sueldoTotal;
		
		System.out.print("Ingresá tu nombre: "); 		
		nombre = input.nextLine();
		
		System.out.print("Ingresá el monto ganado en el mes: $ "); 		
		ventaDelMes= Integer.parseInt(input.nextLine());

		
		sueldoTotal = (sueldoFijo + (ventaDelMes*porcentaje));
		
		//SALIDAS
		System.out.println("\nHola " + nombre + " bienvenido al clan. Esto es lo que cobras: "); 
		System.out.println("Este es el sueldo total: "+sueldoTotal);
		 
	}
}
