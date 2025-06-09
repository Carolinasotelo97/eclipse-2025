package YA_THPG_SOTELO_CAROLINA;

import java.util.Scanner;

public class primerParcial {
	public static Scanner input = new Scanner(System.in);
	static final int FIN_CARGA = -1;
	static final int FECHA_MINIMA = 19010101;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fechaRegistro, ultimaFechaIngresada= 0, cantAsistentesTarde, cantAsistentesNoche;
		double promedio, promedioMayor = -1;
		int fechaPromedioMayor = 0;
		int fechasValidas = 0;
		
		
		do {
			System.out.println("Ingresa la fecha (en formato AAAAMMDD): ");
			fechaRegistro = Integer.parseInt(input.nextLine());
			
			if( fechaRegistro != FIN_CARGA && fechaRegistro <= FECHA_MINIMA) {
				System.out.println("Error! la fecha no puede ser igual o anterior a la actual. Reingresá una fecha (AAAA/MM/DD), o -1 para terminar:");
			}
		}while(fechaRegistro != FIN_CARGA && fechaRegistro <= FECHA_MINIMA);
				
		
		while(fechaRegistro != FIN_CARGA ) {
		
			do {
				System.out.println("Ingresa la cantidad de asistentes en la tarde: ");
				cantAsistentesTarde = Integer.parseInt(input.nextLine());
				
				if(cantAsistentesTarde <0) {
					System.out.println("La cantidad de asistentes es invalida ");
				}
			}while(cantAsistentesTarde < 0);
			
			do {
				System.out.println("Ingresa la cantidad de asistentes en la noche: ");
				cantAsistentesNoche = Integer.parseInt(input.nextLine());
				
				if(cantAsistentesNoche < 0) {
					System.out.println("La cantidad de asistentes es invalida ");
				}
				
			}while(cantAsistentesNoche < 0);
			
			System.out.println(" Día " + fechaRegistro + ":");
			System.out.println(" Asistentes tarde: " + cantAsistentesTarde);
			System.out.println(" Asistentes noche: " + cantAsistentesNoche);
			
			promedio = (double)(cantAsistentesTarde + cantAsistentesNoche) / 2;
			System.out.println("Promedio de asistentes el día " + fechaRegistro + ": " + promedio);
			
			if (promedio > promedioMayor) {
				promedioMayor = promedio;
				fechaPromedioMayor = fechaRegistro;
			}
			
			fechasValidas++;
			ultimaFechaIngresada = fechaRegistro;
			
			do {
				System.out.println("Ingresá otra fecha (AAAA/MM/DD), o -1 para terminar:");
				 fechaRegistro = Integer.parseInt(input.nextLine());			
				 
				 if(fechaRegistro != FIN_CARGA && (fechaRegistro <= ultimaFechaIngresada || fechaRegistro <= FECHA_MINIMA)) {
					 System.out.println("ERROR! La fecha ingresada no puede ser igual o menor a " + ultimaFechaIngresada + " ni tampoco anterior a " + FECHA_MINIMA + " Volve a ingresar una fecha valida: ");
				 }
			}while(fechaRegistro != FIN_CARGA && (fechaRegistro <= ultimaFechaIngresada || fechaRegistro <= FECHA_MINIMA));
		}
		
		if(fechasValidas > 0) {
			System.out.println("El mayor promedio es: " + promedioMayor + " en el dia: " + fechaPromedioMayor);
		}else {
			System.out.println("No hay datos validos para procesar");
		}
	}
}
