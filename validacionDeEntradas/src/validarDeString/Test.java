package validarDeString;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String categoria;
		
		//validacion con while
		
		System.out.println("¿Cual es la categoria? A, B o C?");
		categoria = input.nextLine().toUpperCase();
		
		while(!(categoria.equals("A") || categoria.equals("B") || categoria.equals("C"))) {
			System.out.println("ERROR. ¿Cual es la categoria? A, B o C? ");
			categoria = input.nextLine().toUpperCase();
		}
		
		System.out.println("todo ok");
	}

}
