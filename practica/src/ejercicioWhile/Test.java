package ejercicioWhile;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		int num;
		
		
		System.out.println("Ingrese un numero entero positivo: ");
		num = Integer.parseInt(input.nextLine());
		
		
		if(num > 0) {
			if(num % 2 != 0) { // esto hace que a partir del numero impar que le paso, decremente en 1 y muestre los pares
				num = num -1; // num--
			}
			int contador = num;
			while (contador >= 0) {
				System.out.print(contador + " ");
				contador = contador - 2; // cont -=2
			}
			
		}else {
			System.out.println("Error, el numero debe ser entero y positivo.");
		}
		
		
	}

}
