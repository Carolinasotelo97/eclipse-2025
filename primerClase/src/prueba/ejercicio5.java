package prueba;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		// CODIGO JAVA EMPIEZA Y TERMINA DENTRO DEL MAIN
	
		//ENTRADA
		Scanner input = new Scanner (System.in);  // una vez al principio
		
		String nombre;
		int num1;
		int num2;
		int numConvertido;
		
		System.out.print("Ingresá tu nombre: "); 		
		nombre = input.nextLine();
		
		System.out.print("Ingresá el primer valor: "); 		
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.print("Ingresá el segundo valor: "); 		
		num2= Integer.parseInt(input.nextLine());
		
		numConvertido = num1;
		
		//SALIDAS
		System.out.println("\nHola " + nombre + " bienvenido al clan. Esto es lo que cobras: "); 
		System.out.println("Estos son los valores ingresados: num1: "+num1+ ", num2: "+num2);
		
		num1 = num2;
		num2 = numConvertido;
		
		System.out.println("Nuevos valores: num1: "+num1+" num2: "+num2); 
		

	}
}
