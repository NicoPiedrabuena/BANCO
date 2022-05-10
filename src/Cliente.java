package src;
import java.util.ArrayList;

public class Cliente {
	
	private String titular;
	private Integer cbu;
	private ArrayList <Cuenta>cuentas;

	public Cliente (String titular ,Integer cbu) {
		this.titular = titular;
		this.cbu = cbu;
		cuentas = new ArrayList<Cuenta>();
	}

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getCbu() {
		return cbu;
	}

	public void setCbu(Integer cbu) {
		this.cbu = cbu;
	}
	
}
