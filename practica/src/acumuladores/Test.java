package acumuladores;


public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cant = 100;
		int sumatoria = 0;
		
		System.out.println("hola");
		for (int i = 1; i <= cant; i++) {
			sumatoria = sumatoria + i; // o sumatoria += i;
		}
		
		System.out.print("La sumatoria de los primeros " + cant + " numeros naturales es: " + sumatoria);
	}
}