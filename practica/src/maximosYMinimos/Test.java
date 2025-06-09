package maximosYMinimos;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		int cantNumero, num;
		int maxNumero; //Integer.MIN_VALUE; -> para fijar un minimo grande
		int minNumero; //Integer.MAX_VALUE; -> para fijar un maximo grande
		int posMinimo = 1; //se ininicializa en -1 que equivale a falso porque no hay tal posiion negativa
		int posMaximo = 1;
		
		cantNumero = 4;
		System.out.println("Ingresa numero 1:");
		num = Integer.parseInt(input.nextLine());
		
		maxNumero = num;
		minNumero = num;
		
		for (int i = 2; i <= cantNumero; i++) {
			System.out.println("Ingresa numero " + i + ": ");
			num = Integer.parseInt(input.nextLine());
			if(num > maxNumero) {
				maxNumero = num;
				posMaximo = i;
			}else if (num < minNumero){
				minNumero = num;
				posMinimo = i;
			}
		}
		
		System.out.println("El maximo numero fue: "+ maxNumero + " en la posicion: " + posMaximo);
		System.out.println("El minimo numero fue: "+ minNumero + " en la posicion: " + posMinimo);

	}

}
