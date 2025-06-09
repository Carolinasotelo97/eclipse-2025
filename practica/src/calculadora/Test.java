package calculadora;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in); 
		
		int num1;
		int num2;
		double resultado;
		char operacion;
		
		System.out.println("Ingrese el primer numero: ");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el segundo numero: ");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese una operacion matematica (+, -, X o / ): ");
		operacion = input.nextLine().charAt(0);
		
		switch (operacion) {
		case '+': 
			resultado = num1 + num2;
			System.out.println("El resultado de la suma es: "+resultado);
			break;
		case '-': 
			resultado = num1 - num2;
			System.out.println("El resultado de la resta es: "+resultado);
			break;
		case 'X':
		case 'x':
			resultado = num1 * num2;
			System.out.println("El resultado de la multiplicacion es: "+resultado);
			break;
			
		case '/':
			
			if(num2 != 0) {
				resultado = (double) num1 / num2;
				System.out.println("El resultado de la division es: "+ resultado);
			}else {
				System.out.println("Error. No se puede dividir por cero");
			}
			
			break;
		default:
			System.out.println("Ninguna opcion es correcta");
		}
		
		
	}
}

