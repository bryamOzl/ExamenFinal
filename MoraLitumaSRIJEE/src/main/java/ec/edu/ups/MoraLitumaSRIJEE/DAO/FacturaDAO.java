package ec.edu.ups.MoraLitumaSRIJEE.DAO;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;


import ec.edu.ups.MoraLitumaSRIJEE.modelo.Factura;

@Stateless
public class FacturaDAO {

	@Inject
	private EntityManager em;
	
	public boolean insertFactura(Factura factura) throws SQLException{
		em.persist(factura);
		return true;
	}
	
}
