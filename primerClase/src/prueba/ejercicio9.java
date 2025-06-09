package prueba;

import java.util.Scanner;

public class ejercicio9 {
	public static Scanner input = new Scanner (System.in);  // una vez al principio
	
	public static void main(String[] args) {
		// CODIGO JAVA EMPIEZA Y TERMINA DENTRO DEL MAIN
	
		//ENTRADA
	
		
		String nombre;
		int angulo1;
		int angulo2;
		int angulo3;
		
		
		System.out.print("En este programa deberás ingresar grados. Primero, como te llamas?: "); 		
		nombre = input.nextLine();
		
		System.out.print("Ingresá el primer angulo: "); 		
		angulo1= Integer.parseInt(input.nextLine());
		
		System.out.print("Ingresá el segundo angulo: "); 		
		angulo2= Integer.parseInt(input.nextLine());
		
		
		//operaciones
		angulo3 = 180 - (angulo1+angulo2);
		
		
		//SALIDAS
		System.out.println("\nHola " + nombre + " bienvenido al clan."); 
		System.out.println("El valor del angulo restante es: "+angulo3+"°");
		
	}

}
