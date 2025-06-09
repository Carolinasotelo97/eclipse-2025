package ejercicio22;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in); 
	public static void main(String[] args) {
		/*Realizá un programa que muestre todos los números enteros del 1 al 5, y luego los mismos
		números pero en orden inverso. [EC] */
		
		System.out.println("Hola");
		for (int cont = 1; cont <= 5; cont++) { //con = cont +1 -> es lo mismo que cont++
			System.out.println(cont);
		} 
		//ahora en sentido inverso
		/*for (int cont = 5; cont >=1; cont--) {
			System.out.println(cont);
		}*/
		for (int cont = 1; cont <= 5; cont--) { //con = cont +1 -> es lo mismo que cont++
			System.out.println(6-cont);
		} 
		
		System.out.println("Chau");
	}
}
