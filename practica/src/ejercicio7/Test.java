package ejercicio7;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in); 
	final static int CANT_VUELTAS = 3;
	
	public static void main(String[] args) {
		
		double ancho;
		double largo;
		double valorMetro2;
		double valorTotal;
		double perimetro;
		double superficie;
		double cantAlambre;
		
		System.out.println("Ingrese el ancho: ");
		ancho = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese el largo: ");
		largo = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese el valor del metro cuadrado: ");
		valorMetro2 = Double.parseDouble(input.nextLine());
		
		superficie = (ancho * largo);
		valorTotal = valorMetro2 * superficie;
		perimetro = (2* ancho) + (2* largo);
		cantAlambre = perimetro * CANT_VUELTAS; 
		
		System.out.println("El ancho es: "+ ancho + " El largo es: "+ largo + " El valor del metro cuadrado es de: $ " + valorMetro2);
		System.out.println("El valor total del terreno es: $ "+ valorTotal + " Cantidad de metros de alambres es: "+ cantAlambre);
		
		
		
		
		
	}
}
