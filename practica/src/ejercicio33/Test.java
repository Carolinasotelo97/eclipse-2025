package ejercicio33;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);  // una vez al principio
		
		int num;
		int numMax = 0;
		int numMin = 0;
		
		System.out.println("Ingrese un numero: ");
		num = Integer.parseInt(input.nextLine());
		
		while(num != 0) {
			
			System.out.println("Ingrese otro numero: ");
			num = Integer.parseInt(input.nextLine());
			
			if(num > numMax) {
				numMax = num;
			}
			if (num < numMin && numMin!= 0) {
				numMin = num;
			}
			
		}
		System.out.println("el num Max es: " + numMax + "y el num min es: " + numMin);

	}

}
