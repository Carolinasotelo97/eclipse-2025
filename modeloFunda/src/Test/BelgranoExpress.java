package Test;

import java.util.Scanner;

public class BelgranoExpress {

    public static Scanner input = new Scanner(System.in);

    public static final int TOPE_HORA_VUELO_MAXIMA = 1440;
    public static final int CANTIDAD_CIUDADES = 3;

    public static void main(String[] args) {

        String ciudad;
        String idDron;
        String idDronMax = " ";

        int cantEntregaDron;
        int cantEntregasCiudad;
        int cantEntregasTotales = 0;
        int cantDrones;
        
        int tiempoVuelo;
        int tiempoVueloCiudad;
        int tiempoVueloTotal = 0;
        int tiempoVueloMaximo = Integer.MIN_VALUE;
        double promedioMinVuelo;

        for (int i = 1; i <= CANTIDAD_CIUDADES; i++) {

            // Inicializo por ciudad
            cantEntregasCiudad = 0;
            tiempoVueloCiudad = 0;
            cantDrones = 0;

            do {
                System.out.println("Ingrese la Ciudad numero: " + i);
                ciudad = input.nextLine();
            } while (ciudad.isEmpty());

            System.out.println("Ingrese el codigo del dron (o 'FIN' para terminar): ");
            idDron = input.nextLine().toUpperCase();

            while (!idDron.equals("FIN")) {

                cantDrones++;

                do {
                    System.out.println("Ingrese la cantidad de entregas: ");
                    cantEntregaDron = Integer.parseInt(input.nextLine());
                } while (cantEntregaDron < 0);

                cantEntregasCiudad += cantEntregaDron;
                cantEntregasTotales += cantEntregaDron;

                do {
                    System.out.println("Ingrese el tiempo de vuelo: ");
                    tiempoVuelo = Integer.parseInt(input.nextLine());
                } while (tiempoVuelo < 0 || tiempoVuelo > TOPE_HORA_VUELO_MAXIMA);

                tiempoVueloCiudad += tiempoVuelo;
                tiempoVueloTotal += tiempoVuelo;

                if (tiempoVuelo > tiempoVueloMaximo) {
                    tiempoVueloMaximo = tiempoVuelo;
                    idDronMax = idDron;
                }

                
                do {
                System.out.println("Ingrese el codigo del proximo dron (o 'FIN' para terminar): ");
                idDron = input.nextLine();
                } while (!idDron.equals("FIN"));
            }

            if (cantDrones == 0) {
                System.out.println("No hubo operaciones en la ciudad " + ciudad);
            } else {
                promedioMinVuelo = (double) tiempoVueloCiudad / cantDrones;
                System.out.println("La ciudad " + ciudad + " tiene un promedio de " + promedioMinVuelo + " minutos de vuelo por dron.");
            }
        }

        System.out.println("Se acumularon " + tiempoVueloTotal + " minutos de vuelo en todas las ciudades.");
        if (!idDronMax.equals(" ")) {
            System.out.println("El dron " + idDronMax + " acumuló el mayor tiempo de vuelo con un total de " + tiempoVueloMaximo + " minutos.");
        }
    }
}
