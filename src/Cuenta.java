package src;

public abstract class Cuenta {
	private String cbu;
	private Double saldo;
	private TipoDeCuenta tipoCuenta;
	
	private Cliente cliente;

	public Cuenta (Double saldo,TipoDeCuenta tipoCuenta,Cliente cliente) {
		this.saldo = saldo;
		this.tipoCuenta = tipoCuenta;
		this.cliente = cliente;
	}
	public abstract void extraer (Double montoAExtraer);
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public TipoDeCuenta getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(TipoDeCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getCbu() {
	return cbu;
	}
	public void setCbu(String cbu) {
		this.cbu = cbu;
}
		
}
