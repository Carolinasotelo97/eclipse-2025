package Test;

import java.util.Scanner;

public class IndiceCalor {


	public static Scanner input = new Scanner(System.in);


	public static final int TOPE__HORA_MAXIMA = 23;
	public static final int TOPE__MINUTO_MAXIMO = 59;
	//ETC con temperatura max y min y humedad max 

	public static void main(String[] args) {
		
		String fecha;
		int horaMedicion;
		int minutosMedicion;
		double temperatura;
		double humedad;
		char continuar;
		double heatIndex;
		double indexMaximo = Double.MIN_VALUE;
		int horaHeatIndex = 0;
		int minutoHeatIndex = 0;
	

		System.out.println("Ingrese la fecha del estudio (dd/mm/aaaa): ");
		fecha = input.nextLine();

		do {
			do {
				System.out.println("Ingrese la hora de la medición (0-23): ");
				horaMedicion = Integer.parseInt(input.nextLine());
			} while (horaMedicion < 0 || horaMedicion > TOPE__HORA_MAXIMA);

			do {
				System.out.println("Ingrese los minutos de la medición (0-59): ");
				minutosMedicion = Integer.parseInt(input.nextLine());
			} while (minutosMedicion < 0 || minutosMedicion > TOPE__MINUTO_MAXIMO);

			do {
				System.out.println("Ingrese la temperatura de la medición (-20.0 a 55.0): ");
				temperatura = Double.parseDouble(input.nextLine());
			} while (temperatura < -20 || temperatura > 55);

			do {
				System.out.println("Ingrese la humedad de la medición (0.0% a 100.0%): ");
				humedad = Double.parseDouble(input.nextLine());
			} while (humedad < 0 || humedad > 100);

			heatIndex = temperatura * (humedad / 100);
			
			
			
			System.out.println("\n Los datos de la medición son: ");
			System.out.println("Hora: " + horaMedicion + ":" + minutosMedicion + "hs.");
			System.out.println("\n % de humedad " + humedad);
			System.out.println("\n HeatIndex " + heatIndex);		


			System.out.println("\n¿Desea iniciar una nueva medición ('S/N'): ");
			continuar = input.nextLine().toLowerCase().charAt(0);

			
			if(indexMaximo < heatIndex) {
				horaHeatIndex = horaMedicion;
				minutoHeatIndex = minutosMedicion;
				indexMaximo = heatIndex;
			
			};
			
		} while (continuar != 'n');

		System.out.println("Se han finalizado las mediciones.");
		System.out.println("Para la fecha " + fecha + "A las " +horaHeatIndex + ":" + minutoHeatIndex + " se registró el mayor heat index con un valor de " + indexMaximo);

		
		
	}}







