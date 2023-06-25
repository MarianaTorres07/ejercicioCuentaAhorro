package ejercicioCuentaAhorro;

public class cajaAhorro extends Cuenta{
	
	//2.Metodo constructor (heredar datos)
	public cajaAhorro(String titular, float cantidad) {
		super(titular, cantidad);
	} //cajaAhorro

	
	//2.Metodos
	public void imprimirDatosCajaAhorro() {
		System.out.println("Titular: " + titular);
		System.out.println("Cantidad: " +cantidad);
	}

} //cajaAhorro
