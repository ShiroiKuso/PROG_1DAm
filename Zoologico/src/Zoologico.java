import java.util.ArrayList;
import java.util.Scanner;

public class Zoologico {
	Scanner tec=new Scanner (System.in);
	Animal ani=new Animal();
	ArrayList<Animal> lista = new ArrayList<Animal>();
	public void anyadeAnimal() {

		System.out.println("Dime el nombre del animal: ");
		String nombre = tec.nextLine();
		
		System.out.println("Dime el pais de origen: ");
		String pais = tec.nextLine();
		
		System.out.println("Dime el peso: ");
		double peso = tec.nextDouble();
		
		System.out.println("Dime la edad: ");
		int edad = tec.nextInt();
		
		Animal an1= new Animal(nombre, pais, peso ,edad);
		lista.add(an1);
	}
	
	public boolean existeAnimalPais (String p) {
		
		for (Animal ani : lista) {
			if (ani.getPaisOrigen().equals(p)) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
		
	}
	
	public void edadPromedio() {
		
	}
	
	public void eliminaAnimalesDe(String p) {
		
	}
	
	public void cuantosPesanMas(double p) {
		
	}
	
	public void siEsta(ArrayList<Animal> a) {
		
	}
	
	public void edadDelPrimero() {
		
	}
	
	public void pesoDelUltimo() {
		
	}
	
	public void reemplazaAnimal (ArrayList<Animal> a, int pos) {
		
	}
	
	public void eliminaAnimal (ArrayList<Animal> a, int pos) {
		
	}
	
	public void insertaAnimal (ArrayList<Animal> a, int pos) {
		
	}
	
	public void clausuraZoologico () {
		
	}
	
	public void zoologicoClausurado () {
		
	}
	
	public void veer() {
		for (Animal ani : lista) {
			System.out.println(ani.getNombre()+":"+ ani.getPaisOrigen()+":"+ ani.getPeso()+":"+ ani.getEdad());
		}
	}
	
}
