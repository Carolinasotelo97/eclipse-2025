package ejercicio25;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Test {
	public static Scanner input = new Scanner (System.in); 
	 
	
	public static void main(String[] args) {

		int ancho, alto;
		
		System.out.println("Ingrese un numero entero (ancho): ");
		ancho = Integer.parseInt(input.nextLine());
		
		//System.out.println("Ingrese un numero entero (alto): ");
		//alto = Integer.parseInt(input.nextLine());
		
		
		//SEGUNDA OPCION SIN ALTO - CORRECTA: 
		for(int i = 0; i < ancho; i++) {
			System.out.print("x");
		}
		System.out.println("");
		
		/* PRIMER OPCION - CORRECTA: 
		 * 		
		for(int i = 0; i < alto; i++) {
			for(int j=0; j< ancho; j++) {
				System.out.println("x");
			}
			System.out.println("");
		}*/
		
		
		//cronometro
		for(int horas = 0; horas < 2; horas++) {
			for(int minutos=0; minutos< 60; minutos++) {
				for(int segundos=0; segundos< 60; segundos++) {
					System.out.printf("%d:%d:%d", horas, minutos, segundos);
					//TimeUnit.SECONDS.sleep(1);
				}
			}
		}
		input.close();
	
}
}
