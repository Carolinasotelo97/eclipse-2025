package ar.ort.edu.thp.parcial1;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in);

	private static final int TOPE_PRUEBAS_POR_TERMOTANQUE = 4;
	private static final double LIMITE_MAX_PERDIDA = .25;
	private static final double RELACION_OK = .1;

	public static void main(String[] args) {
		
		
		String codigoIdentificacion;
		int capacidadCalorica;
		int capacidadCaloricaMax;
		int perdidaCalorica;
		int diferenciaTermica;
		int diferenciaTermicaMin;
		int contadorRelacionOk=RELACION_OK;
		
		
		//se usa un while ya que si el usuario no ingresa nada, deberia cerrarse el programa y no seguir preguntando 0 a N
		// n a 0 es do while
		
		
		System.out.println("Ingresá el codigo de identificación: ");
		codigoIdentificacion = input.nextLine();	
		System.out.println("Ingresá la capacidad calórica: ");
		
		
		while(!codigoIdentificacion.equals("")) {
			do {
				System.out.println("Ingreese la capacidad calorica del " + codigoIdentificacion + " termotanque: "+ capacidadCalorica);
				capacidadCalorica = Integer.parseInt(input.nextLine()); 
			}while(capacidadCalorica <= 0);
			do {
				codigoIdentificacion++;
				do {
					System.out.println(codigoIdentificacion + " termotanque");
					perdidaCalorica= Integer.parseInt(input.nextLine()); 
					
				}while(perdidaCalorica < 0);
				diferenciaTermica = (double) perdidaCalorica / capacidadCalorica;	
				if(diferenciaTermica < RELACION_OK) {
					contadorRelacionOk++;
					if(diferenciaTermica < diferenciaTermicaMin) {
						diferenciaTermicaMin = diferenciaTermica;
						
					}
				}
			}while(codigoIdentificacion < TOPE_PRUEBAS_POR_TERMOTANQUE &&diferenciaTermica <= LIMITE_MAX_PERDIDA);			

			
			System.out.println("Ingresá otro codigo de identificación: ");
			codigoIdentificacion = input.nextLine();	
		}
	}

}