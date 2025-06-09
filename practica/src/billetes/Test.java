package billetes;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in); 
	
	public static void main(String[] args) {
		
		int montoDolares, cant100, cant50, cant20, cant10, cant5, cant2;
		
		System.out.println("Ingrese un monto en dolares: ");
		montoDolares = Integer.parseInt(input.nextLine());
		
		cant100= montoDolares / 100;
		montoDolares = montoDolares % 100;
		
		cant50 = montoDolares / 50;
		montoDolares = montoDolares % 50;
		
		cant20 = montoDolares / 20;
		montoDolares = montoDolares % 20;
		
		cant10 = montoDolares / 10;
		montoDolares = montoDolares % 10;
		
		cant5 = montoDolares / 5;
		montoDolares = montoDolares % 5;
		
		cant2 = montoDolares / 2;
		montoDolares = montoDolares % 2;
		
		System.out.println("Cantidad de billetes del 100: " + cant100);
		System.out.println("Cantidad de billetes del 50: " + cant50);
		System.out.println("Cantidad de billetes del 20: " + cant20);
		System.out.println("Cantidad de billetes del 10: " + cant10);
		System.out.println("Cantidad de billetes del 5: " + cant5);
		System.out.println("Cantidad de billetes del 2: " + cant2);
		System.out.println("Cantidad de billetes del 1: " + montoDolares);
		
		
	}
}
