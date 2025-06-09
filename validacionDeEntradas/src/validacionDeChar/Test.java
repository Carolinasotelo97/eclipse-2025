package validacionDeChar;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char categoria;
		
		//validacion con while
		
		System.out.println("¿Cual es la categoria? A, B o C?");
		categoria = Character.toUpperCase(input.nextLine().charAt(0));
		
		while(!(categoria == 'A' || categoria == 'B' || categoria == 'C')) {
			System.out.println("ERROR. ¿Cual es la categoria? A, B o C? ");
			categoria = Character.toUpperCase(input.nextLine().charAt(0));
		}

	}

}
