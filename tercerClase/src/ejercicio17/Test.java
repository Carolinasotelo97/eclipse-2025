package ejercicio17;

import java.util.Scanner;

public class Test {
	//constantes
	public final static int EDAD_JUBILCION_MASC =65;
	public final static int EDAD_JUBILCION_FEM =60;
	public final static int MIN_EDAD =1;
	public final static int MAX_EDAD =120;
	public final static char FEMENINO = 'F';
	public final static char MASCULINO = 'M';
	
	public static Scanner input = new Scanner (System.in);  // una vez al principio se puede hacer dentro o fuera del main
	
	public static void main(String[] args) {
		/*Realizá un programa que permita ingresar una edad (entre 1 y 120 años) y un género ('F'
		para mujeres, 'M' para hombres). En caso de haber ingresado valores erróneos (edad fuera
		de rango o género inválido), informar tal situación y terminar el programa. Si los datos están
		bien ingresados el programa debe indicar, sabiendo que las mujeres se jubilan con 60 años o
		más y los hombres con 65 años o más, si la persona está en edad de jubilarse.*/
	
		
		int edad;
		char genero;
		
		System.out.print("Edad: ");
		edad= Integer.parseInt(input.nextLine());
		
		System.out.print("Ingrese su genero: ");
		genero = input.nextLine().toUpperCase().charAt(0);
		
		
		//opcion 3
		if (edad >= MIN_EDAD && edad <= MAX_EDAD) {
			if (genero == FEMENINO || genero == MASCULINO) {
				System.out.println("Sigo..");
			}else{
				System.out.println("El genero es invalido");
			}
		}else {
			System.out.println("La edad es invalida");
		}
		//opcion 2
		/*if ((edad >=1 && edad <= 120) && (genero == FEMENINO || genero == MASCULINO)) {
			
		}else {
			System.out.println("Datos invalidos");
		}*/
		//opcion 1
		/*if ((edad <1 || edad > 120) || (genero != FEMENINO && genero != MASCULINO)) {
			System.out.println("Datos invalidos");
		}else {
			
		}*/
		
		
		
	}
}
