import java.util.Scanner;

public class AplicacionZoologico {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec=new Scanner (System.in);
		Zoologico zog=new Zoologico();
		int opc;
		do {
			verMenu();
			System.out.println("Que quieres hacer? ");
			opc=tec.nextInt();
			switch (opc) {
			case 1:
				anyadirAnimal();
				break;
			case 2:
				existePais();
				break;
			case 3:
				prueba();
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			case 9:
				
				break;
			case 10:
				
				break;
			case 11:
				
				break;
			case 12:
				
				break;
			case 13:
				
				break;
			case 14:
				System.out.println("Okay Hasta luego");
				break;
			default:
				System.out.println("Opcion no correcta");
				break;
			}
		}
		while (opc != 14);
	}
	
	public static void verMenu() {
		System.out.println("---------------Menu------------");
		System.out.println("1) Anyadir animal");
		System.out.println("2) Existe animal pais");
		System.out.println("3) Edad promedio");
		System.out.println("4) Elimina animales de pais");
		System.out.println("5) Cuantos pesan mas");
		System.out.println("6) Animal existe");
		System.out.println("7) Edad del primero");
		System.out.println("8) Peso del ultimo");
		System.out.println("9) Reemplaza Animal");
		System.out.println("10) Elimina animal");
		System.out.println("11) Inserta animal");
		System.out.println("12) Clausura Zoologico");
		System.out.println("13) Zoologico Clausurado ?");
		System.out.println("14) Salir");
		System.out.println("-------------------------------");
	}
	
	public static void existePais() {
		Zoologico z=new Zoologico();
		Scanner tec=new Scanner (System.in);
		System.out.println("Dime el pais: ");
		String p = tec.nextLine();
		System.out.println("Hay algun animal de este pasi ? "+ z.existeAnimalPais(p));
	}
	
	public static void anyadirAnimal() {
		Zoologico z=new Zoologico();
		z.anyadeAnimal();
	}
	
	public static void prueba() {
		Zoologico z= new Zoologico();
		z.veer();
	}
	


}
