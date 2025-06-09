package clase05;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int x;
		x = 8;
		
		/*NaveEspacial nave;
		nave = new NaveEspacial();
		
		NaveEspacial nave2 = new NaveEspacial();
		
		NaveEspacial segundaNave = nave2;
		
		System.out.println(nave);
		System.out.println(nave2);
		System.out.println(segundaNave);*/
		Scanner input = new Scanner(System.in);		
		Jugador messi = new Jugador("Lionel", "Messi", false, 1.69, 37);
		
		Club equipo; //declaro variable
		equipo = new Club();  //instancio y guardo su referencia en la variable
		
		System.out.println(equipo.getCantSocios());
		messi.mostrar();		
		messi.cumplirAnios();		
		messi.mostrar();
		
	}

}
