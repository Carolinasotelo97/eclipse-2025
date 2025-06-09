package prueba;

import java.util.Scanner;

public class ejercicio7 {
	public static void main(String[] args) {
		// CODIGO JAVA EMPIEZA Y TERMINA DENTRO DEL MAIN
	
		//ENTRADA
		Scanner input = new Scanner (System.in);  // una vez al principio
		
		String nombre;
		double anchoTerreno;
		double largoTerreno;
		int valorMetroCuadrado;
		double areaTerreno;
		double perimetro;
		double alambreTotal;
		double valorTotal;
		
		System.out.print("Ingresá tu nombre: "); 		
		nombre = input.nextLine();
		
		System.out.print("Ingresá el ancho del terreno: "); 		
		anchoTerreno= Integer.parseInt(input.nextLine());
		
		System.out.print("Ingresá el largo del terreno: "); 		
		largoTerreno= Integer.parseInt(input.nextLine());
		
		System.out.print("Ingresá el valor del metro cuadrado: $ "); 		
		valorMetroCuadrado= Integer.parseInt(input.nextLine());
		
		//
		areaTerreno = anchoTerreno * largoTerreno;
		valorTotal = areaTerreno*valorMetroCuadrado;
		perimetro = 2* (anchoTerreno+ largoTerreno);
		alambreTotal = perimetro * 3;
		
		//SALIDAS
		System.out.println("\nHola " + nombre + " bienvenido al clan. Esto es lo que cobras: "); 
		System.out.println("El valor total del terreno es: $ "+valorTotal);
		System.out.println("La cantidad de metros de alambre necesarios para cercar 3 veces es: " + alambreTotal + " m.");
		 
	}
}
