package src;
import java.util.ArrayList;

public class Banco {
	private ArrayList <Cliente>clientes;
	private ArrayList <Cuenta>cuentas;
	public Banco (String nombre) {
		
		clientes = new ArrayList<Cliente>();
		cuentas = new ArrayList<Cuenta>();
	}
	
	public void agregarCuenta(Cuenta nueva) {
		cuentas.add(nueva);
	}
	public void agregarCliente(Cliente nuevo) {
		clientes.add(nuevo);
	}
}	
