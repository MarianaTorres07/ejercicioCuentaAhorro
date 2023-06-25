package tests;

import ejercicioCuentaAhorro.cajaAhorro;
import ejercicioCuentaAhorro.plazoFijo;

public class ClaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instancia #1 (cuentaAhorro)
		cajaAhorro instancia1 = new cajaAhorro("Felipe Maqueda", 1000.0f); //cuando no quiero polimorfear
		
		//Instancia #2 (PlazoFijo)
		plazoFijo instancia2 = new plazoFijo("Jesus Gonzalez", 2500.0f, 12, 5.0);
		
		
		//Mostrar informacion de las cuentas
		instancia1.imprimirDatosCajaAhorro(); //titular y cantidad
		System.out.println(); //espacio ente informacion
		instancia2.mostrarInformacionPlazoFijo(); //titular, cantidad, plazo, interes, total de interes.
		
		
		//Polimorfismo para modificar metodos (override)
		//Animal Felix = new Gato()

	}

}
