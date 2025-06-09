package ejercicio30;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in); 
	
	public static void main(String[] args) {
		int num1;
		int num2;
		char operador;

		
		do {

			System.out.print("Ingrese un operador matematico (+, -, *,/ ,F): ");
			operador = input.nextLine().charAt(0);
			
			if (operador == 'F' || operador == 'f') {
				System.out.println("Finalizo la operacion");
			}else {
	            
				
				System.out.print("Ingrese el primer número: ");
	            num1 = Integer.parseInt(input.nextLine());
	            System.out.print("Ingrese el segundo número: ");
	            num2 = Integer.parseInt(input.nextLine());
	            
	            
	            
				switch (operador) {
				case '+':
	            	 System.out.println("Resultado: " + (num1 + num2));
	                break;
	            case '-':
	            	 System.out.println("Resultado: " + (num1 - num2));
	                break;
	            case '*':
	            	 System.out.println("Resultado: " + (num1 * num2));
	                break;
	            case '/':
	              
	                if (num2 != 0) {
	                    System.out.println("Resultado: " + (double)num1 / num2);
	                } else {
	                    System.out.println("no se puede dividir por cero");
	                }
	                break;
	            default:
	            	 System.out.println("operacion invalida");
	                break;
	                
				}
			}

			
		}while(operador != 'F');
	}

}
