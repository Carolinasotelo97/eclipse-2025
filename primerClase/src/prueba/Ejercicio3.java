package prueba;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		// CODIGO JAVA EMPIEZA Y TERMINA DENTRO DEL MAIN
	
		//ENTRADA
		Scanner input = new Scanner (System.in);  // una vez al principio
		
		String nombre;
		int numeroEntero;
		int numeroMultiplicado;
		int numeroDividido;
		
		System.out.print("Ingresá tu nombre: "); 		
		nombre = input.nextLine();
		
		System.out.print("Ingresá un numero entero: "); 		
		numeroEntero = Integer.parseInt(input.nextLine());
		
		
		//PROCESOS
		numeroMultiplicado = numeroEntero * 5;
		numeroDividido= numeroEntero/2;
		
		//SALIDAS
		System.out.println("\nHola " + nombre + " bienvenido al clan. Estos son los resultados:"); 
		System.out.println("a. Multiplicado por 5: " +numeroMultiplicado);
		System.out.println("b. Dividido por 2: " +numeroDividido);
		
	}

}
