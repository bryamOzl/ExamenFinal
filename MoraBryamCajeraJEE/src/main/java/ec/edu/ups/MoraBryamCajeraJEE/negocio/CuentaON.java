package ec.edu.ups.MoraBryamCajeraJEE.negocio;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.MoraBryamCajeraJEE.dao.CuentaDAO;
import ec.edu.ups.MoraBryamCajeraJEE.dao.MovimientoDAO;
import ec.edu.ups.MoraBryamCajeraJEE.modelo.Cuenta;
import ec.edu.ups.MoraBryamCajeraJEE.modelo.Movimiento;

@Stateless
public class CuentaON implements CuentaONLocal{

	@Inject
	private CuentaDAO daoCuenta;
	
	@Inject
	private MovimientoDAO daoMovimiento;
	
	public boolean crearCuenta(Cuenta cuenta) throws Exception{
		if (cuenta == null)
			throw new Exception("El objeto cuenta esta vacio");
		
		try {
			daoCuenta.insertCuenta(cuenta);
		} catch (Exception e) {
			throw new Exception("No se registro la cuenta");
		}
		return true;
	}
	
	public int cuentaN () throws SQLException {
		int id= daoCuenta.contarCuenta();
		return id;
	}
	
	public Cuenta buscarCuenta(String cedula) throws Exception{
		Cuenta cuenta= new Cuenta();
		if(cedula.equals(""))
			throw new Exception("No se ingreso la cedula");
		try {
			 cuenta = daoCuenta.buscarCuenta(cedula);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Error al buscar la Cuenta por la cedula");
		}
		return cuenta;
	}
	
	public boolean crearMovimiento(Movimiento movimiento) throws Exception{
		if (movimiento == null)
			throw new Exception("El objeto movimiento esta vacio");
		
		try {
			daoMovimiento.insertMovimiento(movimiento);
		} catch (Exception e) {
			throw new Exception("No se registro el movimiento");
		}
		return true;
	}
}
