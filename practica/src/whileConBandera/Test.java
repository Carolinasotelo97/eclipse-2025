package whileConBandera;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cantNumeros= 0, num, sumatoria = 0;
		double promedio;
		int umbral = 10;
		
		while(sumatoria < umbral) {
			cantNumeros++;
			System.out.println("Ingresa numero " + cantNumeros + ": ");
			num = Integer.parseInt(input.nextLine());
			sumatoria += num; 
		}
		promedio = (double) sumatoria / cantNumeros;
		System.out.println("El promedio es de: " + promedio);

	}

}
