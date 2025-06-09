package ar.ort.edu.thp.parcial1;

import java.util.Scanner;

public class Test {

	private static final int TOPE_PRUEBAS_POR_TERMOTANQUE = 4;
	private static final double LIMITE_MAX_PERDIDA = 0.25;
	private static final double RELACION_OK = 0.1;


	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String codigoIdentificacion;
		int capacidadCalorica;
		int perdidaCalorica;
		double deficienciaTermica;
		double menorDeficiencia = Double.MAX_VALUE;
		String codigoMenorDeficiencia = "";

		System.out.println("Ingrese el codigo de identificación del termotanque: ");
		codigoIdentificacion = input.nextLine();

		while (!codigoIdentificacion.equals("")) {

			do {
				System.out.println("Ingrese la capacidad calorica del termotanque: ");
				capacidadCalorica = Integer.parseInt(input.nextLine());
			} while (capacidadCalorica <= 0);

			boolean descartado = false;
			boolean cumpleEficiencia = false;
			int prueba = 1;

			while (prueba <= 4 && !descartado) {
				System.out.println("Ingrese la perdida calorica en la prueba " + prueba + ": ");
				perdidaCalorica = Integer.parseInt(input.nextLine());

				deficienciaTermica = (double) perdidaCalorica / capacidadCalorica;

				if (deficienciaTermica > 0.25) {
					descartado = true;
					System.out.println("PERDIDA EXCESIVA DE CALORIAS");
				}

				if (deficienciaTermica < 0.10) {
					cumpleEficiencia = true;
				}

				if (!descartado && deficienciaTermica < menorDeficiencia) {
					menorDeficiencia = deficienciaTermica;
					codigoMenorDeficiencia = codigoIdentificacion;
				}

				prueba++;
			}

			if (!descartado) {
				if (cumpleEficiencia) {
					System.out.println("TERMOTANQUE APTO");
				} else {
					System.out.println("AISLACION INSUFICIENTE");
				}
			}

			System.out.println("\nIngrese el codigo de identificacion del proximo termotanque (vacío para terminar): ");
			codigoIdentificacion = input.nextLine();
		}

		if (!codigoMenorDeficiencia.isEmpty()) {
			System.out.println("\nEl termotanque con menor deficiencia termica fue: " + codigoMenorDeficiencia
					+ " con un " + (menorDeficiencia * 100) + "% de deficiencia");
		}
		if(codigoIdentificacion.equals("")) {
		    System.out.println("\nNo hay termotanques para procesar. Fin del programa.");
			
		}
		
	}
}