package ciclosAnidados;

import java.util.Scanner;

public class EjercicioMatriz {
	public static Scanner input = new Scanner (System.in);
	
	final static char CARACTER = 'X';
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ancho, alto;
		
		
		//pido
		System.out.print("Ingresá el ancho: ");
		ancho = Integer.parseInt(input.nextLine());
		
		//valido
		while(ancho <= 0) {

			System.out.print("Error. Ingresá un ancho valido: ");
			ancho = Integer.parseInt(input.nextLine());
		}
		
		//pido
		System.out.print("Ingresá el alto: ");
		alto = Integer.parseInt(input.nextLine());
		
		//valido
		while(alto <= 0) {

			System.out.print("Error. Ingresá un alto valido: ");
			alto = Integer.parseInt(input.nextLine());
		}
		
		for(int i = 1; i <= alto ;i++) {
			for(int j = 1; j <= ancho; j++) {
				System.out.print(CARACTER);
			}
			System.out.println();
		}
	}

}
