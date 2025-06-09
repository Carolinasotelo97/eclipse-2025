package YA_THPG_LUCESOLI_LUCIA;

import java.util.Scanner;

public class primerParcial {

	public static Scanner scanner = new Scanner(System.in);
    
    public static final String FIN_DE_CARGA = "-1";

    public static void main(String[] args) {

        String fecha = "";
        int fechaNumerica;
        int fechaAnterior = Integer.MIN_VALUE;
        int asistenciaFuncionTarde;
        int asistenciaFuncionNoche;
        double promedio;
        double mayorPromedio = 0;
        String fechaMayorPromedio = ""; 

        System.out.println("- BIENVENIDOS AL CINE ORT -");

        System.out.println("\nIngrese la fecha de la funcion (AAAAMMDD) o -1 para finalizar: ");
        fecha = scanner.nextLine();

        while (!fecha.equals(FIN_DE_CARGA)) {

            fechaNumerica = Integer.parseInt(fecha);

            if (fechaNumerica >= fechaAnterior) {
                fechaAnterior = fechaNumerica;
                
                

                do {
                    System.out.println("Ingrese la cantidad de asistentes a la primera funcion (tarde): ");
                    asistenciaFuncionTarde = Integer.parseInt(scanner.nextLine());
                } while (asistenciaFuncionTarde <= 0);

                do {
                    System.out.println("Ingrese la cantidad de asistentes a la segunda funcion (noche): ");
                    asistenciaFuncionNoche = Integer.parseInt(scanner.nextLine());
                } while (asistenciaFuncionNoche <= 0);
                
                

                promedio = (double)(asistenciaFuncionTarde + asistenciaFuncionNoche) / 2;
                System.out.println("Promedio de asistentes para la fecha " + fecha + ": " + promedio);

                if (promedio > mayorPromedio || fechaMayorPromedio.equals("")) {
                    mayorPromedio = promedio;
                    fechaMayorPromedio = fecha;
                    
                    
                }

            } else {
            	
                System.out.println("\nERROR - La fecha debe ser mayor a la anterior.");
            }

            System.out.println("\nIngrese la fecha de la funcion (AAAAMMDD) o -1 para finalizar: ");
            fecha = scanner.nextLine();
            
            
        }

        if (!fechaMayorPromedio.equals("")) {
            System.out.println("\nLa fecha con el mayor promedio de asistentes fue el dia " + fechaMayorPromedio + " con un promedio de " + mayorPromedio + " asistentes.");
        } else {
            System.out.println("\nFinalizo el programa - no se ingresaron datos.");
        }
    }
}
