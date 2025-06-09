package ciclosContadoryBandera;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in);
	
	static final int MESES_POR_ANIO = 12;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sueldoMensual, sueldoAnual= 0;
		int i = 1; 
		
		System.out.println("Ingresa tu sueldo para el mes n° " + i + ": ");
		sueldoMensual = Integer.parseInt(input.nextLine());
		
		while(i < MESES_POR_ANIO && sueldoMensual > 0) {
			sueldoAnual += sueldoMensual;
			i++;
			System.out.println("Ingresa tu sueldo para el mes n° " + i + ": ");
			sueldoMensual = Double.parseDouble(input.nextLine());
		}
		
		if(sueldoMensual > 0) {
			sueldoAnual += sueldoMensual;
		}
		
		System.out.println("Tu sueldo anual es: " + sueldoAnual);
	}

}
