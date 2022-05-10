package src;

public class CajaDeAhorro extends Cuenta {
	private Integer cantidadExtracciones;

	public CajaDeAhorro(Double saldo, TipoDeCuenta tipoCuenta, Cliente cliente) {
		super(saldo, tipoCuenta, cliente);
		this.cantidadExtracciones = 0;
	}
	

	public Integer getCantidadExtracciones() {
		return cantidadExtracciones;
	}


	public void setCantidadExtracciones(Integer cantidadExtracciones) {
		this.cantidadExtracciones = cantidadExtracciones;
	}


	@Override
	public void extraer(Double montoAExtraer) {
		if(this.cantidadExtracciones >5 && getSaldo() >= (montoAExtraer+6)) {
		setSaldo(getSaldo()- (montoAExtraer+6));
		}
		if(this.cantidadExtracciones <=5 && getSaldo()>= montoAExtraer) {
			setSaldo(getSaldo()-montoAExtraer);
		cantidadExtracciones++;
		}
	}

	
	
	

}
