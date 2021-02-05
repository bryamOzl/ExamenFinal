package ec.edu.ups.MoraBryamCajeraJEE.negocio;

import java.sql.SQLException;

import javax.ejb.Local;

import ec.edu.ups.MoraBryamCajeraJEE.modelo.Cuenta;
import ec.edu.ups.MoraBryamCajeraJEE.modelo.Movimiento;

@Local
public interface CuentaONLocal {

	public boolean crearCuenta(Cuenta cuenta) throws Exception;
	public int cuentaN () throws SQLException;
	public Cuenta buscarCuenta(String cedula) throws Exception;
	public boolean crearMovimiento(Movimiento movimiento) throws Exception;
}
