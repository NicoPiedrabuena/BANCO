package test;
import static org.junit.Assert.*;

import org.junit.Test;

import src.Banco;
import src.CajaDeAhorro;
import src.Cliente;
import src.Cuenta;
import src.CuentaCorriente;
import src.CuentaSueldo;
import src.TipoDeCuenta;

public class testBanco {

	@Test
	public void queSePuedaCrearUnaCuentaSueldo() {
		Double saldoEsperado = 3000.0;
		String titular = "Walter Piedrabuena";
		Integer cbu = 12321313;
		TipoDeCuenta tipoCuenta = TipoDeCuenta.CUENTA_SUELDO;
		String nombreBanco="PEREZ";
		
		
		Cliente cliente = new Cliente (titular,cbu);
		Cuenta cuentaSueldo= new CuentaSueldo (saldoEsperado, tipoCuenta, cliente);
		Banco peres = new Banco (nombreBanco);
		
		peres.agregarCuenta(cuentaSueldo);
		assertEquals(titular, cuentaSueldo.getCliente().getTitular());
	}
	@Test
	public void queSePuedaExtraerDeUnaCuentaSueldo() {
		Double saldo = 3000.0;
		Double montoDescontado = 1500.0;
		Double resto = 1500.0;
		String titular = "Walter Piedrabuena";
		Integer cbu = 12321313;
		TipoDeCuenta tipoCuenta = TipoDeCuenta.CUENTA_SUELDO;
		
		Cliente cliente = new Cliente (titular,cbu);
		Cuenta cuentaSueldo= new CuentaSueldo (saldo, tipoCuenta, cliente);
		
		cuentaSueldo.extraer(montoDescontado);
		Double saldoEsperado = cuentaSueldo.getSaldo();
		
		assertEquals(resto,saldoEsperado);
	}
	@Test
	public void queSePuedaExtraerDeUnaCajaDeAhorro() {
		Double saldo = 6000.0;
		
		Double montoDescontado = 500.0;
		Double resto = 2494.0;
		String titular = "Walter Piedrabuena";
		Integer cbu = 12321313;
		TipoDeCuenta tipoCuenta = TipoDeCuenta.CAJA_DE_AHORRO;
	
		Cliente cliente = new Cliente (titular,cbu);
		Cuenta cajaDeAhorro= new CajaDeAhorro (saldo, tipoCuenta, cliente);
		cajaDeAhorro.extraer(montoDescontado);
		System.out.println(cajaDeAhorro.getSaldo());
		cajaDeAhorro.extraer(montoDescontado);
		System.out.println(cajaDeAhorro.getSaldo());
		cajaDeAhorro.extraer(montoDescontado);
		System.out.println(cajaDeAhorro.getSaldo());
		cajaDeAhorro.extraer(montoDescontado);
		System.out.println(cajaDeAhorro.getSaldo());
		cajaDeAhorro.extraer(montoDescontado);
		System.out.println(cajaDeAhorro.getSaldo());
		cajaDeAhorro.extraer(montoDescontado);
		System.out.println(cajaDeAhorro.getSaldo());
		cajaDeAhorro.extraer(montoDescontado);
		System.out.println(cajaDeAhorro.getSaldo());
		System.out.println(((CajaDeAhorro)cajaDeAhorro).getCantidadExtracciones());
		
		assertEquals(resto, cajaDeAhorro.getSaldo());
		
		
	}
	@Test 
	public void queSeCobreCincoPorcientoDeComisionAlDepositarDineroLuegoDeHaberRealizadoUnaExtraccionMayorAlSaldo() {
Double saldo = 6000.0;
		
		Double montoDescontado = 500.0;
		Double resto = 2494.0;
		String titular = "Walter Piedrabuena";
		Integer cbu = 12321313;
		TipoDeCuenta tipoCuenta = TipoDeCuenta.CAJA_DE_AHORRO;
	
		Cliente cliente = new Cliente (titular,cbu);
		Cuenta cajaDeAhorro= new CuentaCorriente (saldo, tipoCuenta, cliente);
		
		
		
		
	}

}
