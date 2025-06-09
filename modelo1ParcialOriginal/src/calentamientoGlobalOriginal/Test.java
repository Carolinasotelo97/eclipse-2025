package calentamientoGlobalOriginal;

import java.util.Scanner;

public class Test {
	public static Scanner input = new Scanner (System.in);

	static final int HORA_MAX = 23;
	static final int HORA_MIN = 0;
	static final int MINUTOS_MIN = 0;
	static final int MINUTOS_MAX = 59;
	static final double TEMP_MAX = 55.00;
	static final double TEMP_MIN = -20.00;
	static final double HUMEDAD_MIN = 0.00;
	static final double HUMEDAD_MAX = 100.00;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fechaDeEstudio;
		int horaMedicion, minutosMedicion, horaMax = 0, minutosMax = 0;
		double temperatura, porcentajeHumedad, heatIndex;
		double maxHeatIndex = Double.MIN_VALUE;
		char respuesta;

		System.out.print("Ingrese la fecha del estudio en formato 'dd/mm/aaaa': ");
		fechaDeEstudio = input.nextLine();

		while(fechaDeEstudio.equals("")) {

			System.out.print("Error. Ingrese una fecha valida en formato 'dd/mm/aaaa': ");
			fechaDeEstudio = input.nextLine();

		}
		do {

			System.out.println("Ingrese la hora de la medición (0 a 23): ");
			horaMedicion = Integer.parseInt(input.nextLine());

			System.out.println("Ingrese los minutos de la medición (0 a 59): ");
			minutosMedicion = Integer.parseInt(input.nextLine());

			System.out.println("Ingrese la temperatura en grados centígrados (-20.00 a 55.00): ");
			temperatura = Double.parseDouble(input.nextLine());

			System.out.println("Ingrese el porcentaje de humedad (0.00 a 100.00): ");
			porcentajeHumedad = Double.parseDouble(input.nextLine());




			while(!(horaMedicion >= HORA_MIN && horaMedicion <= HORA_MAX)) {
				System.out.println("Error, ingrese una hora válida (0 a 23): ");
				horaMedicion = Integer.parseInt(input.nextLine());
			}

			while(!(minutosMedicion >= MINUTOS_MIN && minutosMedicion <= MINUTOS_MAX)) {
				System.out.println("Error, ingrese minutos válidos (0 a 59): ");
				minutosMedicion = Integer.parseInt(input.nextLine());
			}

			while(!(temperatura >= TEMP_MIN && temperatura <= TEMP_MAX)) {
				System.out.println("Error, ingrese una temperatura válida (-20.00 a 55.00): ");
				temperatura = Double.parseDouble(input.nextLine());
			}

			while(!(porcentajeHumedad >= HUMEDAD_MIN && porcentajeHumedad <= HUMEDAD_MAX)) {
				System.out.println("Error, ingrese un porcentaje de humedad válido (0.00 a 100.00): ");
				porcentajeHumedad = Double.parseDouble(input.nextLine());
			}

			heatIndex = temperatura * (porcentajeHumedad /100);
			

			if (heatIndex > maxHeatIndex) {
			    maxHeatIndex = heatIndex;
			    horaMax = horaMedicion;
			    minutosMax = minutosMedicion;
			}

			System.out.println("Hora: " + horaMedicion + ":" + minutosMedicion + " hs.");
			System.out.println("Temperatura registrada: " + temperatura + "°C");
			System.out.println("% de humedad: " + porcentajeHumedad + "%");
			System.out.println("Heat Index: " + heatIndex);
			

			
			System.out.print("Desea continuar? [S/N]: ");
			respuesta = input.nextLine().charAt(0);
		
		}while (respuesta == 'S' || respuesta == 's');

		 System.out.println("Para la fecha: " + fechaDeEstudio + " A las "+ horaMax + ":" + minutosMax + " del heat maximo: " + maxHeatIndex);
	}
}