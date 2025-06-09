package ar.ort.edu.thp.parcial1;

import java.util.Scanner;

public class Ejercicio {

	private static final int TOPE_PRUEBAS_POR_TERMOTANQUE = 4;
	private static final double LIMITE_MAX_PERDIDA = .25;
	private static final double RELACION_OK = .1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String codigo;

		// Variables para la mejor prueba
		String codigoTermoMejorResultado = "";
		double mejorResultadoTotal = Double.MAX_VALUE;

		// otros valores
		int capacidadCalorica;
		int valorPerdida;

		// Pedir el codigo del termotanque
		System.out.print("\nIngrese el codigo del termotanque (solo ENTER para finalizar): ");
		codigo = scanner.nextLine();

		while (!codigo.equals("")) {
			// Variables para el termotanque actual
			boolean descartado = false;
			boolean pruebaSuperada = false;
			double mejorResultadoTermotanque = 1;
			double deficienciaTermica;

			// Pedir la capacidad calorica del termotanque
			do {
				System.out.print("Ingrese la capacidad calorica del termotanque: ");
				capacidadCalorica = Integer.parseInt(scanner.nextLine());
			} while (capacidadCalorica < 1);

			int i = 1;
			while (!descartado && i <= TOPE_PRUEBAS_POR_TERMOTANQUE) {
				// Pedir la pérdida calórica de la prueba
				do {
					System.out.print("Ingrese la perdida calorica de la prueba " + i + ": ");
					valorPerdida = Integer.parseInt(scanner.nextLine());
				} while (valorPerdida < 0 || valorPerdida > capacidadCalorica);

				// multiplicarlo por 1.0 hace que el entero se comporte como real
				// es la forma mas facil de entender por ahora para tranaformar un entero el real
				// y asi mantener los decimales.
				deficienciaTermica = valorPerdida / (capacidadCalorica * 1.0);

				// Verificar si la pérdida calórica supera el límite
				if (deficienciaTermica > LIMITE_MAX_PERDIDA) {
					descartado = true;
					// Verificar si la pérdida calórica cumple con el requisito mínimo
				} else if (deficienciaTermica <= RELACION_OK) {
					pruebaSuperada = true;
					if (deficienciaTermica < mejorResultadoTermotanque) {
						mejorResultadoTermotanque = deficienciaTermica;
					}
				}
				i++;
			}
			if (descartado) {
				System.out.println("PERDIDA EXCESIVA DE CALORIAS");
			} else if (!pruebaSuperada) {
				System.out.println("AISLACION INSUFICIENTE");
			} else {
				System.out.println("TERMOTANQUE APTO");
				if (mejorResultadoTermotanque < mejorResultadoTotal) {
					mejorResultadoTotal = mejorResultadoTermotanque;
					codigoTermoMejorResultado = codigo;
				}
			}

			// Pedir el código del próximo termotanque
			System.out.print("\nIngrese el codigo del termotanque (solo ENTER para finalizar): ");
			codigo = scanner.nextLine();
		}

		scanner.close();

		// Mostrar el resultado del mejor termotanque
		if (codigoTermoMejorResultado.equals("")) {
			System.out.println("Ningun termotanque alcanzo los valores deseados");
		} else {
			System.out.println("El termotanque con codigo " + codigoTermoMejorResultado
					+ " tuvo la menor perdida calorica: " + mejorResultadoTotal);
		}
	}
}