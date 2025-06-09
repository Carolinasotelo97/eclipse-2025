package ejercicio5;

import java.util.Scanner;

public class Test {
	
	public static final int ESCALA_10 = 10000;
	public static final int ESCALA_19 = 19999;
	public static final int ESCALA_20 = 20000;
	public static final int ESCALA_29 = 29999;
	public static final int ESCALA_30 = 30000;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);  
		
		int edad;
		double sueldo, aporte, porcentaje;
		
		System.out.println("Ingresa tu edad: ");
		edad = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingresa tu sueldo: ");
		sueldo = Double.parseDouble(input.nextLine());
		
		
		if(edad > 0 && sueldo > 0 ) {
		
			if(sueldo < ESCALA_10) {
				porcentaje=  0.005;
			}else if (sueldo < ESCALA_20) {
				porcentaje = 0.01;
			}else if(sueldo < ESCALA_30) {
				porcentaje = 0.02;
			} else {
				porcentaje = 0.025;
			}
			
			aporte = sueldo * porcentaje;
			if(edad <= 30) {
				aporte = aporte+ aporte * 0.2;
			}
			System.out.println("Tu edad es: " + edad + " tu sueldo es: $ " + sueldo + " entonces el aporte será: $ " + aporte);
			
			
		}else {
			System.out.println("Hubo un error");
		}
		
		
	}

}
