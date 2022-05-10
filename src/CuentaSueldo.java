package src;

public class CuentaSueldo extends Cuenta {

	public CuentaSueldo(Double saldo, TipoDeCuenta tipoCuenta, Cliente cliente) {
		super(saldo, tipoCuenta, cliente);
		
	}

	@Override
	public void extraer(Double montoAExtraer) {
		if(getSaldo() >= montoAExtraer)
			setSaldo(montoAExtraer);
		
	}

}
