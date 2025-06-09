package clase05;

public class Club {
	
	//atributos son siempre privados
	private String nombre;
	private int cantSocios;
	private String color;

	public int getCantSocios() { //el get lo uso para poder llamarlo en mi main ya que es publico y los atributos son privados.
		return cantSocios;
	}
	@Override
	public String toString() {
		return "Club [nombre=" + nombre + ", cantSocios=" + cantSocios + ", color=" + color + "]";
	}
}
