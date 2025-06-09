package ejercicio24;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in); 
	public static void main(String[] args) {
		/*Realizá un programa que permita al usuario ingresar dos números enteros num1 y num2,
			donde el primero siempre deberá ser menor o igual al segundo. La computadora debe
			mostrar la secuencia de números existentes entre ambos:
			a. Incluyéndolos;
			b. Excluyéndolos.*/
		
		
		int num1;
		int num2;
		
		
		System.out.println("Ingrese el primer numero del 1 al 10: ");
		num1 = input.nextInt();
		
		System.out.println("Ingrese el segundo numero del 1 al 10: ");
		num2 = input.nextInt();
		
		if (num1 <= num2) {
			System.out.println("a. Incluyendolos: ");
			for (int i = num1; i <= num2; i++) {
				System.out.println(i + "");
			}
			System.out.println("b. Excluyendolos: ");
			for (int i = num1; i <= num2; i++) {
				System.out.println(i + "");
			}
		}else {
			System.out.println("Error, el primer numero debe ser menor o igual al segundo.");
		}
		
		
		
	}
	
	
}
