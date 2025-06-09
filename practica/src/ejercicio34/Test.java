package ejercicio34;

import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);  // una vez al principio

		double estatura;
		double sumaEstaturas = 0;
		int contadorJugadores = 0;

		System.out.println("Ingrese la estatura del jugador (0 para finalizar): ");
		estatura = Double.parseDouble(input.nextLine());

		while (estatura != 0) {
			sumaEstaturas += estatura;
			contadorJugadores++;

			System.out.println("Ingrese la estatura del jugador (0 para finalizar): ");
			estatura = Double.parseDouble(input.nextLine());
		}

		if (contadorJugadores > 0) {
			double promedio = sumaEstaturas / contadorJugadores;
			System.out.println("El promedio es de: " + promedio);
		} else {
			System.out.println("Programa finalizado. No se ingresaron estaturas.");
		}
	}
}