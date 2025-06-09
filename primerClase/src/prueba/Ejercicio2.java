package prueba;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// CODIGO JAVA EMPIEZA Y TERMINA DENTRO DEL MAIN
	
		//ENTRADA
		Scanner input = new Scanner (System.in);  // una vez al principio
		
		String nombre;
		int nota1;
		int nota2;
		int nota3;
		int promedio;

		System.out.print("Ingresá tu nombre: "); 		
		nombre = input.nextLine();
		
		System.out.print("Ingresá tu primer nota: "); 		
		nota1 = Integer.parseInt(input.nextLine());
		
		System.out.print("Ingresá tu segunda nota: "); 		
		nota2 = Integer.parseInt(input.nextLine());
		
		System.out.print("Ingresá tu tercer nota: "); 		
		nota3 = Integer.parseInt(input.nextLine());
		
		//PROCESOS
		promedio = (nota1 + nota2 + nota3)/3;
		
		//SALIDAS
		System.out.println("Hola " + nombre + " bienvenido al clan"); 
		System.out.println("Tus 3 notas son: " + nota1  +", "+ nota2 +" y " + nota3);
		System.out.println("Tu promedio es:  " + promedio);
		
	}
}
