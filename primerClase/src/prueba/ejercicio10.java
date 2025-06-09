package prueba;

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {
		// CODIGO JAVA EMPIEZA Y TERMINA DENTRO DEL MAIN
	
		//ENTRADA
		Scanner input = new Scanner (System.in);  // una vez al principio
		
		String socio1;
		String socio2;
		String socio3;
		int dineroSocio1;
		int dineroSocio2;
		int dineroSocio3;
		double porcentaje1;
		double porcentaje2;
		double porcentaje3;
		int totalAportado;
		
		
		System.out.print("Ingresa el nombre del primer socio: "); 		
		socio1 = input.nextLine();
		
		System.out.print("Ingresá el nombre del segundo socio: "); 		
		socio2= input.nextLine();
		
		System.out.print("Ingresá el nombre del tercer socio: "); 		
		socio3= input.nextLine();
		
		System.out.print("Cuanto dinero aporto el primero?:  "); 		
		dineroSocio1= Integer.parseInt(input.nextLine());
		
		System.out.print("Cuanto dinero aporto el segundo?:  "); 		
		dineroSocio2= Integer.parseInt(input.nextLine());
		
		System.out.print("Cuanto dinero aporto el tercer?:  "); 		
		dineroSocio3= Integer.parseInt(input.nextLine());
		
		
		//operaciones
		totalAportado = dineroSocio1 + dineroSocio2 + dineroSocio3;
		porcentaje1 = ((double)dineroSocio1/ totalAportado) *100;
		porcentaje2= ((double)dineroSocio2/ totalAportado) *100;
		porcentaje3= ((double)dineroSocio3/ totalAportado) *100;
		
		
		//SALIDAS
		System.out.println("El primer socio se llama "+socio1+" y aportó: $"+dineroSocio1+" y el porcentaje total aportado fue de: "+porcentaje1+"%"); 
		System.out.println("El segundo socio se llama "+socio2+" y aportó: $"+dineroSocio2+" y el porcentaje total aportado fue de: "+porcentaje2+"%");
		System.out.println("El tercer socio se llama "+socio3+" y aportó: $"+dineroSocio3+" y el porcentaje total aportado fue de: "+porcentaje3+"%");
		System.out.println("El total aportado de la sociedad es de: $"+totalAportado);
	}

}
