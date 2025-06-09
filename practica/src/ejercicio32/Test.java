package ejercicio32;

import java.util.Scanner;

public class Test {  


	 public static void main(String[] args) {
	     Scanner input = new Scanner(System.in); 
	     int nota;
	     
	     do {
	         System.out.println("Ingrese una nota válida (2 o entre 4 y 10): ");
	         nota = Integer.parseInt(input.nextLine());
	         
	         // Validar si la nota es inválida
	         if (nota == 0) {
	             System.out.println("El alumno está ausente.");
	         } else if (!(nota == 2 || (nota >= 4 && nota <= 10))) {
	             System.out.println("La nota ingresada no es válida.");
	         } else {
	             System.out.println("La nota ingresada es válida: " + nota);
	         }
	         
	     } while (nota == 0 || nota == 2 || (nota >= 4 && nota <= 10)); // Condición para repetir el ciclo
	     
	     System.out.println("Programa finalizado.");
	 }
}