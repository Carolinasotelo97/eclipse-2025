package ejercicio20Switch;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in); 
	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Ingrese un numero del 1 al 7: ");
		numero = input.nextInt();
		
		switch (numero) {
			case 1: 
				System.out.println("Es el lunes");
				break;
			case 2: 
				System.out.println("Es el martes");
				break;
			case 3: 
				System.out.println("Es el miercoles");
				break;
			case 4: 
				System.out.println("Es el jueves");
				break;
			case 5: 
				System.out.println("Es el viernes");
				break;
			case 6: 
				System.out.println("Es el sabado");
				break;
			case 7: 
				System.out.println("Es el domingo");
				break;	
			default:
		        System.out.println("Error - Ingrese un numero del 1 al 7");
		
		}
	}
}
