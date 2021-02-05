package ec.edu.ups.MoraBryamOperadoraJEE.negocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.MoraBryamOperadoraJEE.DAO.RecargaDAO;
import ec.edu.ups.MoraBryamOperadoraJEE.modelo.Recarga;

@Stateless
public class RecargaON implements RecargaONLocal{

	@Inject
	private RecargaDAO daoRecarga;
	
	public boolean crearRecarga(Recarga recarga) throws Exception{
		if (recarga == null)
			throw new Exception("El objeto recarga esta vacio");
		
		try {
			daoRecarga.insterRecarga(recarga);
		} catch (Exception e) {
			throw new Exception("No se registro la recarga");
		}
		return true;
	}
	
}
