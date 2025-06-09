package validacionDeNumero;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in);
	static final int MAX = 18;
	static final int MIN = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		System.out.println("Ingresa un numero entre " + MIN + " y " + MAX + " : ");
		num = Integer.parseInt(input.nextLine());
		
		while(!(num >= MIN && num <= MAX)) {
			System.out.println("Error. Ingresa un numero entre " + MIN + " y " + MAX + " : ");
			num = Integer.parseInt(input.nextLine());
		}
	}

}
