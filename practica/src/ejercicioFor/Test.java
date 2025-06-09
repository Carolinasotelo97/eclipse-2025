package ejercicioFor;

import java.util.Scanner;

public class Test {
	
	static final int MIN = 1;
	static final int MAX = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		int num;
		
		 System.out.println("Ingresa un numero entero: ");
		 num = Integer.parseInt(input.nextLine());
		 
		 if(num >= MIN && num <= MAX) {
			 for(int i = 1 ; i <= 10; i++) {
				 int resultado;
				 
				 resultado = num * i;
				 
				 System.out.println(num + " x " + i + " = " + resultado + " ");
			 }
		 }else {
			 System.out.println("Error, debe ingresar un numero entero positivo");
			 
		 }
		 
		 

	}

}
