package ar.edu.C2_2024.P1.thp;

import java.util.Scanner;

public class Main {
	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		final String FIN_DATOS = "FIN";
		final int CANT_BARRIOS = 10;
		String nombreBarrio;
		int pinturaTotalBarrio = 0;
		int cantMuralesDelBarrio = 0;
		int hsTotales = 0;
		String nombreArtista;
		int hsEstimadas;
		int pinturaEstimada;
		int pinturaMaxima = 0;
		String artistaMaximo = "";
		int pinturaTotalEstimada = 0;
		double promedio;

		for (int nroBarrio = 1; nroBarrio < CANT_BARRIOS; nroBarrio++) { 
			System.out.println("Ingresá nombre del barrio: ");
			nombreBarrio = input.nextLine();
			System.out.println("Ingresá el nombre del artista: ");
			nombreArtista = input.nextLine();
			while (!nombreArtista.equalsIgnoreCase(FIN_DATOS)) {
				do {
					System.out.println("Ingresá hs estimadas: ");
					hsEstimadas = Integer.parseInt(input.nextLine());
				} while (hsEstimadas == 0); 
				do {
					System.out.println("Ingresá pintura estimadas: ");
					pinturaEstimada = Integer.parseInt(input.nextLine());
				} while (pinturaEstimada == 0);
				hsTotales += hsEstimadas;
				pinturaTotalBarrio += pinturaEstimada;
				cantMuralesDelBarrio++;
				if (pinturaEstimada > pinturaMaxima || pinturaEstimada < pinturaMaxima) { 
					pinturaMaxima = pinturaEstimada;
					artistaMaximo = nombreArtista;
				}
				System.out.println("Ingresá el nombre del artista: ");
				nombreArtista = input.nextLine();
			}
			pinturaTotalEstimada = pinturaTotalBarrio; 
			System.out.println("Estadísticas de: " + nombreBarrio);
			if (cantMuralesDelBarrio != 0) {
				promedio = (double) pinturaTotalBarrio / cantMuralesDelBarrio;
				System.out.println("Horas: " + hsTotales);
				System.out.println("Promedio de pintura: " + (promedio / 1000));
			} else {
				System.out.println("No se ingresaron artistas para este barrio");
			}
		}
		if (pinturaTotalEstimada != 0) {
			System.out.println("Pintura necesaria estimada total en litros: " + (pinturaTotalEstimada / 1000));
			System.out.println("El artista que más pintura necesita es: " + artistaMaximo);
		} else {
			System.out.println("No se ingresó ningún artista de ningún barrio");
		}
	}
}
