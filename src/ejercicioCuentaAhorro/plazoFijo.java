package ejercicioCuentaAhorro;

public class plazoFijo extends Cuenta {
	
	//1. Attributos
	public int plazo;
	public double interes;
	
	
	//2. Metodo constructor
	public plazoFijo(String titular, float cantidad, int plazo, double interes) {
		super(titular, cantidad);
		this.plazo = plazo;
		this.interes = interes;
	}
	
	//Metodo obtener importe de interes
	public double obtenerImporteInteres() {
		return ((cantidad *interes)/100);
	}
	
	//Metodo para mostrarInformacion
	public void mostrarInformacionPlazoFijo() {
		System.out.println("Informacion de la cuenta Plazo Fijo");
		imprimirDatosCuenta(); //metodo imprimir datos de la clase Cuenta
		System.out.println("Plazo: " + plazo);
		System.out.println("Interes: " + interes);
		System.out.println("Total de Interes: " + obtenerImporteInteres());
	}
	
		
} //PlazoFijo
	
	
