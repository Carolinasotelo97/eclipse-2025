package modeloFunda;

import java.util.Scanner;

public class almagroExpress {

	public static Scanner input = new Scanner (System.in);
	public static final int CANTIDAD_CIUDADES = 10;
	public static final int TIEMPO_VUELO_MIN = 0;
	public static final int TIEMPO_VUELO_MAX = 1440;
	
	public static void main(String[] args) {
		
		String nombreCiudad;
		String codigoDrone = "";
		int mayorEntregas = 0;
		int entregas;
		int tiempoVuelo = 0;
		String codigoDroneMasEntregas = "";
		double promedioEntregas;
		int totalEntregas;
		int totalVueloTiempo;
		int totalDrones;
		int totalEntregasGeneral = 0;  
		
		
		System.out.println("MENSAJERIA - ALMAGRO EXPRESS");
		
		for (int i = 1; i <= CANTIDAD_CIUDADES; i++) {
			
		    totalEntregas = 0;
		    totalVueloTiempo = 0;
		    totalDrones = 0;
			
			do {
				System.out.println("Ingrese el nombre de la ciudad: ");
				nombreCiudad = input.nextLine();

			} while (nombreCiudad.equals(""));
			
			do {
				System.out.println("Ingrese el codigo del drone: ");
				codigoDrone = input.nextLine();

			} while (codigoDrone.equals(""));
			
			while (!codigoDrone.equals("FIN")) {  
				
				do {
					System.out.println("Ingrese la cantidad de entregas realizadas: ");
					entregas = Integer.parseInt(input.nextLine());

				} while (entregas < 0);
				
				totalEntregas += entregas;
				totalEntregasGeneral += entregas;  

				
				do {
					System.out.println("Ingrese el tiempo total de vuelo en minutos (0 a 1440): ");
					tiempoVuelo = Integer.parseInt(input.nextLine());

				} while (tiempoVuelo < TIEMPO_VUELO_MIN || tiempoVuelo > TIEMPO_VUELO_MAX); 
				totalVueloTiempo += tiempoVuelo;
				totalDrones++;
				
				if (entregas > mayorEntregas) { 
					mayorEntregas = entregas;
					codigoDroneMasEntregas = codigoDrone;
					
				}
				
				do {
					System.out.println("Ingrese el codigo del drone: ");
					codigoDrone = input.nextLine();

				} while (codigoDrone == "");
				
				
			}
			
			if (totalDrones > 0) {
				promedioEntregas = (double) totalEntregas / totalDrones;
				
				System.out.println("La ciudad " + nombreCiudad + ", tuvo un total de " + totalVueloTiempo + " minutos en tiempo vuelo. Con un promedio por drone de: " + promedioEntregas);


				
			} else {
				
				System.out.println("No hay datos ingresados de algun Drone");
				
			}
			
			
		}
		
		System.out.println("El total de entregas entre todas las ciudades fue: " + totalEntregasGeneral);
		System.out.println("Codigo del dron con mas entregas: " + codigoDroneMasEntregas);

		
		

	}

}
