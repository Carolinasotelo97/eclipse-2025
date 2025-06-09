package ejerciciosDoWhile;

import java.util.Scanner;

public class login {
	public static Scanner input = new Scanner (System.in);

	static final int MAX_INTENTOS = 3;
	static final String NOMBRE_VALIDO = "Pepe";
	static final String CLAVE_VALIDA = "1234";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre, clave;
		int intentos = 0;
		boolean credencialesInvalidas;
		
		do {
			System.out.println("Ingrese su nombre: ");
			nombre = input.nextLine();
			
			System.out.println("Ingrese su contraseña: ");
			clave = input.nextLine();
			
			credencialesInvalidas = !nombre.equalsIgnoreCase(NOMBRE_VALIDO) || !clave.equals(CLAVE_VALIDA);
			
			intentos++;
		}while(credencialesInvalidas && intentos < MAX_INTENTOS);
		
		if(credencialesInvalidas) {
			System.out.println("Se bloqueo la cuenta");
		}else {
			System.out.println("Acceso concedido");
		}

	}

}
