package termotanques;

import java.util.Scanner;

public class intento2 {
	public static Scanner input = new Scanner (System.in);
	
    final static int MAX_PRUEBAS = 4;
    final static double DEFICIENCIA_MAXIMA = 0.25;
    final static double DEFICIENCIA_MINIMA_APTA = 0.10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mejorCodigo = "";
        double menorDeficiencia = Double.MAX_VALUE;

        String codigo;
        int capacidad;
        boolean descartado = false;
        boolean tieneBuenaAislacion = false;
        double deficienciaMinimaDelModelo = Double.MAX_VALUE;
        int pruebasRealizadas = 0;
        int perdida;
        double deficiencia;
        
        System.out.print("Ingresá el código del termotanque (vacío para terminar): ");
        codigo = input.nextLine();

        while (!codigo.equals("")) {
            
            // Validar capacidad calórica
            do {
                System.out.print("Ingresá la capacidad calórica (entero positivo): ");
                capacidad = Integer.parseInt(input.nextLine());
                
            } while (capacidad <= 0);

           

            // Ingreso de hasta 4 pruebas
            do {
               
                // Validar pérdida calórica
                do {
                    System.out.print("Ingresá la pérdida calórica (entero 0 o mayor): ");
                    perdida = Integer.parseInt(input.nextLine());
                    
                } while (perdida < 0);

                deficiencia = (double) perdida / capacidad;
                pruebasRealizadas++;

                // Evaluar deficiencia
                if (!descartado && deficiencia > DEFICIENCIA_MAXIMA) {
                    System.out.println("PÉRDIDA EXCESIVA DE CALORÍAS");
                    descartado = true;
                }

                if (!descartado && deficiencia < DEFICIENCIA_MINIMA_APTA) {
                    tieneBuenaAislacion = true;
                }

                if (!descartado && deficiencia < deficienciaMinimaDelModelo) {
                    deficienciaMinimaDelModelo = deficiencia;
                }

            } while (!descartado && pruebasRealizadas < MAX_PRUEBAS);

            if (!descartado) {
                if (tieneBuenaAislacion) {
                    System.out.println("TERMOTANQUE APTO");

                    if (deficienciaMinimaDelModelo < menorDeficiencia) {
                        menorDeficiencia = deficienciaMinimaDelModelo;
                        mejorCodigo = codigo;
                    }
                } else {
                    System.out.println("AISLACIÓN INSUFICIENTE");
                }
            }

            // Leer siguiente termotanque
            System.out.print("\nIngresá el código del siguiente termotanque (vacío para terminar): ");
            codigo = input.nextLine();
        }

        // Mostrar resultados finales
        if (!mejorCodigo.equals("")) {
            System.out.printf("El termotanque con menor deficiencia térmica fue %s con una deficiencia de %.2f%n", mejorCodigo, menorDeficiencia);
        } else {
            System.out.println("No se encontró ningún termotanque apto.");
        }

        
    }
}
