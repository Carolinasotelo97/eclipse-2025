package prueba;

import java.util.Scanner;


// System.out.print(nombreDeUsuario); // mostre el valor de la variable 'nombreDeUsuario'	
// System.out.print(2); // es un entero
// System.out.print(2.0); // Real (double)
// System.out.print('2'); // caracter (char)
// System.out.print("11111 asdasd"); // cadena de caracteres (string)
// System.out.print("false"); // cadena de caracteres (string)
// System.out.print(false); // valores de verdad (boolean)
// System.out.print(2 + 2); // suma
// System.out.print(2 - 2); // resta
//	nombreDeUsuario = "Lucia"; // inicie la variable 'nombreDeUsuario'

public class ClaseUno {

	public static void main(String[] args) {
		// CODIGO JAVA EMPIEZA Y TERMINA DENTRO DEL MAIN
	
		//ENTRADA
		Scanner input = new Scanner (System.in);  // una vez al principio
		String nombreDeUsuario; // declare la variable 'nombreDeUsuario'
		int anioDeNacimiento;
		int edad;
		
		System.out.print("Tu nombre: "); 		
		nombreDeUsuario = input.nextLine();
		
		System.out.print("Tu año de nacimiento: "); 		
		anioDeNacimiento = Integer.parseInt(input.nextLine());
		
		//PROCESOS
		edad = 2025 - anioDeNacimiento;
		
		//SALIDAS
		System.out.println("Hola " + nombreDeUsuario + " bienvenido al clan"); 
		System.out.println("Naciste en " + anioDeNacimiento);
		System.out.println("Tu edad es  " + edad + " ó " + (edad-1));
		
	}

}