package src;

public class CuentaCorriente extends Cuenta {
	private final Double SALDO_DESCUBIERTO =150.0;
	private Double descubiertoActual;
	public CuentaCorriente(Double saldo, TipoDeCuenta tipoCuenta, Cliente cliente) {
		super(saldo, tipoCuenta, cliente);
		this.descubiertoActual = SALDO_DESCUBIERTO;
	}
	@Override
	public void extraer(Double montoAExtraer) {
		// TODO Auto-generated method stub
		
	}

	

}
