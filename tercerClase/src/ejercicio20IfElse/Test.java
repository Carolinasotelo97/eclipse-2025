package ejercicio20IfElse;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int numero1, numero2;
		double resultado;
		char operacion;

		System.out.println("Ingresa el primer numero: ");
		
		numero1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingresa la operacion a realizar: ");
		
		operacion = input.nextLine().charAt(0);
		
		System.out.println("Ingresa el segundo numero: ");
		
		numero2 = Integer.parseInt(input.nextLine());
		
		if (operacion == '/' && (numero2 != 0)) {
			resultado = (double) numero1  - numero2; //casteo double para que me de con coma
			System.out.println("El resultado es" + resultado);
		}
		else if (operacion == '+'){
			resultado = numero1 + numero2;
			System.out.println("El resultado es" + resultado);
		}
		else if (operacion == '*') {
			resultado = numero1 * numero2; 
			System.out.println("El resultado es" + resultado);
		}
		else {
			System.out.println("ERROR");
		}		
	}	
		
			
}

