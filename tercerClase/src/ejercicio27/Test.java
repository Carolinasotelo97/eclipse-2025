package ejercicio27;

import java.util.Scanner;

public class Test {
	static int CANT_EDADES = 5;
	static int VALOR_ESPECIAL =18;
	
	public static Scanner input = new Scanner (System.in); 
	public static void main(String[] args) {
		/*27. Realizá un programa que permita ingresar 5 edades. Calcular y mostrar el promedio de todas
		las edades ingresadas y cuántas edades fueron valores impares mayores que 18*/
	
		int acumulador =0;
		double promedio;
		int edad;
		int contEspecial =0;
		
		
		
		for (int cont = 1; cont < CANT_EDADES; cont++) {
			System.out.printf("Edad %d de %d: ", cont, CANT_EDADES);
			edad= Integer.parseInt(input.nextLine());
			acumulador += edad; //acumulador = acumulador + edad;
			if (edad >VALOR_ESPECIAL && edad %2 !=0) {
				contEspecial++;
			}
		}
		promedio = (double) acumulador / CANT_EDADES; //esta division se hace una sola vez y afuera del for. El promedio se calcula una sola vez y al final.
		System.out.printf("El promedio es %.2f", promedio);
		System.out.printf("Hubo %d valores impares mayores que %d\n", contEspecial, VALOR_ESPECIAL);
	}
	
}
