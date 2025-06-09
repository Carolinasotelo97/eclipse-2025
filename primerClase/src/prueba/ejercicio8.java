package prueba;

import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {
		// CODIGO JAVA EMPIEZA Y TERMINA DENTRO DEL MAIN
	
		//ENTRADA
		Scanner input = new Scanner (System.in);  // una vez al principio
		
		String nombre;
		int num1;
		int num2;
		int suma;
		int resta;
		double division;
		int multiplicacion;
		
		System.out.print("Ingresá tu nombre: "); 		
		nombre = input.nextLine();
		
		System.out.print("Ingresá el primer numero: "); 		
		num1= Integer.parseInt(input.nextLine());
		
		System.out.print("Ingresá el segundo numero: "); 		
		num2= Integer.parseInt(input.nextLine());
		
		
		//operaciones
		suma = num1 + num2;
		resta = num1 - num2;
		division = ((double)num1 / num2);
		multiplicacion = num1 * num2;
		
		//SALIDAS
		System.out.println("\nHola " + nombre + " bienvenido al clan."); 
		System.out.println("El resultado de la suma es: " +suma);
		System.out.println("El resultado de la resta es: " +resta);
		System.out.println("El resultado de la division es: " +division);
		System.out.println("El resultado de la multiplicacion es: " +multiplicacion);
		
		
	}

}
