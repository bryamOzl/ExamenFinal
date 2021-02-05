package ec.edu.ups.MoraBryamCajeraJEE.dao;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.MoraBryamCajeraJEE.modelo.Movimiento;

@Stateless
public class MovimientoDAO {

	@Inject
	private EntityManager em;
	
	public boolean insertMovimiento(Movimiento movimiento) throws SQLException {
		em.persist(movimiento);
		return true;
	}

}
