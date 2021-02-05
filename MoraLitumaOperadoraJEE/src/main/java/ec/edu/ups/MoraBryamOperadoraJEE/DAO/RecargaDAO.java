package ec.edu.ups.MoraBryamOperadoraJEE.DAO;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import ec.edu.ups.MoraBryamOperadoraJEE.modelo.Recarga;

@Stateless
public class RecargaDAO {

	@Inject
	private EntityManager em;
	
	public boolean insterRecarga(Recarga recarga) throws SQLException{
		em.persist(recarga);
		return true;
	}
}
