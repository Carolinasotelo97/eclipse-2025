package prueba;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		// CODIGO JAVA EMPIEZA Y TERMINA DENTRO DEL MAIN
	
		//ENTRADA
		Scanner input = new Scanner (System.in);  // una vez al principio
		
		String nombre;
		int valorHoraDeTrabajo;
		int cantidadDeHoras;
		int valorSalarioSemanal;
		int valorSabados;
		int totalSalarioSemanal;
		
		System.out.print("Ingresá tu nombre: "); 		
		nombre = input.nextLine();
		
		System.out.print("Ingresá el valor de una hora de trabajo: "); 		
		valorHoraDeTrabajo = Integer.parseInt(input.nextLine());
		
		System.out.print("Ingresá la cantidad de horas trabajadas por dia: "); 		
		cantidadDeHoras = Integer.parseInt(input.nextLine());
		
		
		//PROCESOS
		valorSalarioSemanal = (valorHoraDeTrabajo * cantidadDeHoras) * 5;
		valorSabados = valorHoraDeTrabajo/2;
		totalSalarioSemanal= valorSalarioSemanal + valorSabados;
		
		//SALIDAS
		System.out.println("\nHola " + nombre + " bienvenido al clan. Esto es lo que cobras: "); 
		System.out.println("El valor del salario por semana es de: $ "+valorSalarioSemanal);
		System.out.println("El valor del salario de los Sábados es de: $ "+valorSabados);
		System.out.println("El total de tu salario por semana es: $ "+totalSalarioSemanal);
	}
}
