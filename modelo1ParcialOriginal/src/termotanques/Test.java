package termotanques;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in);
	
	private static final int TOPE_PRUEBAS_POR_TERMOTANQUE = 4;
	private static final double LIMITE_MAX_PERDIDA = .25;
	private static final double RELACION_OK = .1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String codigoIdentificacion;
		int capacidadCalorica, perdidaCalorica, diferenciaTermica;
		int cantMaxCalorias = 0;
		int cantTermotanque = 0;
		
		
		
		System.out.println("Ingrese el codigo de Identificación: ");
		codigoIdentificacion = input.nextLine();
	
		
		while(!codigoIdentificacion.equals("")) {
			do {
				System.out.println("Ingrese la capacidad calorica: ");
				capacidadCalorica = Integer.parseInt(input.nextLine());
				
				cantMaxCalorias = capacidadCalorica;
			}while(capacidadCalorica > 0);

			cantMaxCalorias++;
			cantTermotanque++;
			
			System.out.println("Error. Ingrese el codigo de Identificación: ");
			codigoIdentificacion = input.nextLine();
			
			do {
				System.out.println("Ingrese la perdida calorica: ");
				perdidaCalorica = Integer.parseInt(input.nextLine());
				
				diferenciaTermica = perdidaCalorica / capacidadCalorica;
				
				if(diferenciaTermica > LIMITE_MAX_PERDIDA) {
					System.out.println("El termotanque no sirve");
				}
				
			}while(!(cantTermotanque > TOPE_PRUEBAS_POR_TERMOTANQUE) || perdidaCalorica <= 0);
		}
		
		
		System.out.println("El codigo de indetificacion es " + codigoIdentificacion + " y su cantidad maxima fue: " + cantMaxCalorias);
	}

}
