package Parcial;

import java.util.Scanner;

public class YA_THPG_BOSISIO_NATALIA {

	public static Scanner input = new Scanner(System.in);

	public static final int FECHA_MINIMA_VALIDA = 19010101;
	public static final int FIN_DE_CARGA = -1;
	public static final double CANT_FUNCIONES = 2.0;

	public static void main(String[] args) {

		int fecha;
		int fechaAnterior = 0;
		int asistentesTarde, asistentesNoche;
		double promedioDia;
		double mayorPromedio = 0;
		int fechaMayorPromedio = 0;
		int cantidadRegistrosValidos = 0;
		
		

		System.out.println("Ingrese la fecha en formato AAAAMMDD o -1 para finalizar: ");
		fecha = Integer.parseInt(input.nextLine());

		while (fecha != FIN_DE_CARGA) {

			if (fecha <= fechaAnterior) {
				System.out.println("Error: la fecha debe ser mayor a la anterior.");
				
			} else if (fecha < FECHA_MINIMA_VALIDA) {
				System.out.println("Error: la fecha debe ser igual o mayor a " + FECHA_MINIMA_VALIDA);
				
			} else {
				
				System.out.println("Ingrese la cantidad de asistentes a la función de la tarde: ");
				asistentesTarde = Integer.parseInt(input.nextLine());

				System.out.println("Ingrese la cantidad de asistentes a la función de la noche: ");
				asistentesNoche = Integer.parseInt(input.nextLine());

				promedioDia = (asistentesTarde + asistentesNoche) / CANT_FUNCIONES;
				System.out.println("El promedio de asistentes para el día " + fecha + " es: " + promedioDia);

				if (cantidadRegistrosValidos == 0 || promedioDia > mayorPromedio) {
					mayorPromedio = promedioDia;
					fechaMayorPromedio = fecha;
				}

				cantidadRegistrosValidos++;
				fechaAnterior = fecha;
			}

			System.out.println("Ingrese la próxima fecha (o -1 para finalizar): ");
			fecha = Integer.parseInt(input.nextLine());
		}

		if (cantidadRegistrosValidos > 0) {
			System.out.println("El mayor promedio fue " + mayorPromedio + " el día " + fechaMayorPromedio);
		} else {
			System.out.println("No hay datos para procesar.");
		}
	}
}