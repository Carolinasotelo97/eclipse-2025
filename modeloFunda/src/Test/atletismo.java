package Test;

import java.util.Scanner;

public class atletismo {


	public static Scanner input = new Scanner(System.in);

	public static final int TOPE_DIAS_ENTRENAMIENTO = 3;
	public static final int MINUTOS_MINIMOS = 0;
	public static final int MINUTOS_MAXIMOS = 100;
	public static final int TIEMPO_MINIMO_REQUERIDO = 15;
	public static final int TIEMPO_DESCALIFICA = 20;
	public static final int PROMEDIO_MINIMO_REQUERIDO = 18;
	public static void main(String[] args) {


		int minutos;
		int contadorDiasEntrenamiento = 0;
		int minutosTotales = 0;
		int pruebaMenorRequerida = 0;
		double promedioTotal = 0;
		boolean falloPorTiempoMayorA20 = false;

		int mejorTiempo = Integer.MAX_VALUE;
		int diaMejorTiempo = 0;
		
		
		

		System.out.println("Ingrese los minutos: ");
		minutos = Integer.parseInt(input.nextLine());

		while(minutos > MINUTOS_MINIMOS && minutos < MINUTOS_MAXIMOS && contadorDiasEntrenamiento < TOPE_DIAS_ENTRENAMIENTO && !falloPorTiempoMayorA20) {

			if(minutos > TIEMPO_DESCALIFICA) {

				falloPorTiempoMayorA20 = true;
				
			}else {	

				contadorDiasEntrenamiento++;
				minutosTotales += minutos;
				
				if (minutos < mejorTiempo) {
				    mejorTiempo = minutos;
				    diaMejorTiempo = contadorDiasEntrenamiento;
				}

				if(minutos < TIEMPO_MINIMO_REQUERIDO) {
					pruebaMenorRequerida++;
				}}

			if (!falloPorTiempoMayorA20 && contadorDiasEntrenamiento < TOPE_DIAS_ENTRENAMIENTO) {
                System.out.println("Ingrese los minutos DEL SIGUIENTE DIA: ");
                minutos = Integer.parseInt(input.nextLine());
            }

		}
		
		if (contadorDiasEntrenamiento > 0) { 
		    promedioTotal = (double) minutosTotales / contadorDiasEntrenamiento;
		}
		
		if (contadorDiasEntrenamiento == 0  && !falloPorTiempoMayorA20) {
		    System.out.println("No ingresó minutos válidos. No se puede evaluar.");
		    
		} else if (pruebaMenorRequerida > 0 && promedioTotal <= PROMEDIO_MINIMO_REQUERIDO && !falloPorTiempoMayorA20) {
		    System.out.println("Es Apto con un promedio de " + promedioTotal + " y el mejor tiempo fue el día " + diaMejorTiempo);
		} else {
		    System.out.println("No es Apto");
		}


	}


}
