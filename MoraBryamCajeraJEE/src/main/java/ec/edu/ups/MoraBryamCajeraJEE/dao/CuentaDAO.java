package ec.edu.ups.MoraBryamCajeraJEE.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.MoraBryamCajeraJEE.modelo.Cuenta;

@Stateless
public class CuentaDAO {

	@Inject
	private Connection con;

	@Inject
	private EntityManager em;

	public boolean insertCuenta(Cuenta cuenta) throws SQLException {
		em.persist(cuenta);
		return true;
	}

	public Cuenta readCuenta(int cuenta_id) throws SQLException {
		Cuenta cuenta = em.find(Cuenta.class, cuenta_id);
		return cuenta;
	}

	public boolean updateCuenta(Cuenta cuenta) throws SQLException {
		em.merge(cuenta);
		return true;
	}

	public Cuenta buscarCuenta(String cedula) throws SQLException {
		Cuenta cuenta = new Cuenta();
		String sql = "SELECT * FROM Cuenta WHERE  cedula=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, cedula);
		ResultSet res = ps.executeQuery();
		res.next();
		cuenta.setCuentaId(res.getInt("cuenta_id"));
		cuenta.setCedula(res.getString("cedula"));
		cuenta.setNombre(res.getString("nombre"));
		cuenta.setNumeroCuenta(res.getString("numero_cuenta"));
		cuenta.setSaldo(res.getDouble("saldo"));
		ps.execute();
		ps.close();
		return cuenta;
	}
	
	public int contarCuenta() throws SQLException {
		int s;
		String sql = "SELECT MAX (cuetnta_id) FROM cuenta";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet res = ps.executeQuery();
		res.next();
		s = res.getInt(1) + 1;
		ps.execute();
		ps.close();
		return s;
	}
}
