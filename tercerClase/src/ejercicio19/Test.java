package ejercicio19;

import java.util.Scanner;

public class Test {

	public static Scanner input = new Scanner (System.in);  // una vez al principio se puede hacer dentro o fuera del main
	
	public static void main(String[] args) {
		/*
		Existen dos reglas que identifican dos conjuntos de valores:
		a. El número es de un solo dígito.
		b. El número es impar.
		A partir de estas reglas, realizá un programa que permita ingresar un número entero. Debe
		asignar el valor que corresponda a las variables booleanas esDeUnSoloDigito, esImpar,
		estaEnAmbosGrupos y noEstaEnNingunGrupo el valor Verdadero o Falso, según corresponda,
		para indicar si el valor número ingresado pertenece o no a cada conjunto. Al terminar el
		programa debe informar el número cargado y las cuatros variables lógicas. Definí un lote de
		prueba de varios números y probá el algoritmo, escribiendo los resultados tal como se hizo
		en los ejercicios anteriores.*/
		
		int numero;
		boolean esDeUnSoloDigito, esImpar, estaEnAmbosGrupos, noEstaEnNingunGrupo;
		
		System.out.print("Ingrese un numero entero: ");
		numero = Integer.parseInt(input.nextLine());
		
		esDeUnSoloDigito = numero > -10 && numero <10;
		
		esImpar = numero %2 != 0;
		
		estaEnAmbosGrupos = esImpar  && esDeUnSoloDigito;
		noEstaEnNingunGrupo = !esImpar && !esDeUnSoloDigito;
		
		System.out.println("El numero "+ numero);
		System.out.print("Es de un solo digito: "+ esDeUnSoloDigito);
		System.out.print("Es Impar:  "+ esImpar);
		System.out.print("El numero esta en ambos grupos: "+ estaEnAmbosGrupos);
		System.out.print("El numero no esta en ningun grupo: "+ noEstaEnNingunGrupo);
	}
}
