
public class Animal {
	private String nombre;
	private String paisOrigen;
	private double peso;
	private int edad;
	
	public Animal() {
		this.nombre = "DEFAULT";
		this.paisOrigen = "DEFAULT";
		this.peso = peso;
		this.edad = 0;
	}
	
	public Animal(String nombre, String paisOrigen, double peso, int edad) {
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
		this.peso = peso;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	

}
