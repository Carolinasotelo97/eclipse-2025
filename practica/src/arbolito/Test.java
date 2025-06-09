package arbolito;

import java.util.Scanner;


public class Test {
	public static Scanner input = new Scanner (System.in);
	
	static final int NUM_MINIMO = 3;
	static final char ASTERISCOS = '*';
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeroImpar, espaciosIniciales;	
		
		System.out.println("Ingresa un numero impar mayor o igual a 3: ");
		numeroImpar = Integer.parseInt(input.nextLine());
		
		while(!(numeroImpar % 2 != 0 && numeroImpar >= NUM_MINIMO) ) {
			System.out.println("Error. Ingresa otro numero impar mayor o igual a 3: ");
			numeroImpar = Integer.parseInt(input.nextLine());
			
		}
		
		espaciosIniciales = numeroImpar  /2;
		
		for(int i = 1; i <= numeroImpar; i+= 2) {	
			//imprime los espacios
			for(int j = 1; j <= espaciosIniciales; j++) {
				System.out.print(" ");
			}
			
			//imprime los asteriscos
			for(int k = 1; k <= i; k++ ) {
				System.out.print(ASTERISCOS);
				
			}
			espaciosIniciales--;
			System.out.println();
		}
		
		
	}

}
