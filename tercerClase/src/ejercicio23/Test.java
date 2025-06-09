package ejercicio23;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in); 
	public static void main(String[] args) {
		
		int numeroEntero;
		int multiplos;
		
		System.out.println("Ingrese un numero entero: ");
		numeroEntero= input.nextInt();
		
		
		for (int i = 1; i < 11; i++) {
			multiplos = i * numeroEntero;
			System.out.printf("Este es el numero entero %d y estos son sus 10 multiplos: %d \n", numeroEntero, multiplos);
		}
		
	}
}
	
