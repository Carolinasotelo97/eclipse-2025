package parcial1;

import java.util.Scanner;

public class Parcial1 {

    private static final int FECHA_MINIMA = 19010101;
    private static final int SIN_DATOS = -1;
    private static final int FIN_CARGA = -1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fechaAnterior = FECHA_MINIMA;
        int fechaMayorDiferencia = SIN_DATOS;
        double mayorDiferencia = SIN_DATOS;
        
        // Variables que se cargan por teclado o se calculan
        int fecha;
        int asistentesTarde;
        int asistentesNoche;
        int diferencia;

        // Pedimos la fecha
        System.out.print("Ingrese la fecha en formato AAAAMMDD o -1 para finalizar: ");
        fecha = Integer.parseInt(input.nextLine());
        
        while (fecha != FIN_CARGA && fecha <= fechaAnterior) {
            System.out.println("La fecha ingresada debe ser mayor que la anterior.");
            System.out.print("Ingrese la fecha en formato AAAAMMDD o -1 para finalizar: ");
            fecha = Integer.parseInt(input.nextLine());
        }

        while (fecha != FIN_CARGA) {

            // Cargamos los datos de asistentes para la función de la tarde
            System.out.println("Ingrese la cantidad de asistentes para la función de la tarde:");
            asistentesTarde = Integer.parseInt(input.nextLine());

            // Cargamos los datos de asistentes para la función de la noche
            System.out.println("Ingrese la cantidad de asistentes para la función de la noche:");
            asistentesNoche = Integer.parseInt(input.nextLine());

            // Calculamos la diferencia total del día
            if (asistentesTarde > asistentesNoche)
            	diferencia = asistentesTarde - asistentesNoche;
            else
            	diferencia = asistentesNoche - asistentesTarde;

            // Verificamos si la diferencia total es la mayor hasta el momento
            if (diferencia > mayorDiferencia) {
                fechaMayorDiferencia = fecha;
                mayorDiferencia = diferencia;
            }

            // Imprimimos los resultados para la fecha
            System.out.println("Fecha: " + fecha);
            System.out.println("Función de la tarde: " + asistentesTarde + " asistentes");
            System.out.println("Función de la noche: " + asistentesNoche + " asistentes");
            System.out.println("Diferencia de asistentes: " + diferencia);

            // Actualizamos la fecha anterior
            fechaAnterior = fecha;

            // Pedimos la siguiente fecha
            System.out.print("Ingrese la fecha en formato AAAAMMDD o -1 para finalizar: ");
            fecha = Integer.parseInt(input.nextLine());
            while (fecha != FIN_CARGA && fecha <= fechaAnterior) {
                System.out.println("La fecha ingresada debe ser mayor que la anterior.");
                System.out.print("Ingrese la fecha en formato AAAAMMDD o -1 para finalizar: ");
                fecha = Integer.parseInt(input.nextLine());
            }

        }

        input.close();

        // Mostramos los datos globales verificando si se ingresaron al menos un par de cantidades de asistentes
        if (mayorDiferencia != SIN_DATOS) {
            System.out.println("La fecha con la mayor diferencia de asistentes fue: " + fechaMayorDiferencia + ".");
            System.out.println("La diferencia de asistentes fue de " + mayorDiferencia + " personas.");
        } else {
            System.out.println("No hay datos procesados.");
        }
    }
}
