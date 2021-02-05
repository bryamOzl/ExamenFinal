package ec.edu.ups.MoraLitumaSRIJEE.negocio;


import javax.inject.Inject;

import ec.edu.ups.MoraLitumaSRIJEE.DAO.FacturaDAO;
import ec.edu.ups.MoraLitumaSRIJEE.modelo.Factura;

public class FacturaON implements FacturaONLocal{

	@Inject
	private FacturaDAO daoFactura;
	
	public boolean crearFactura(Factura factura) throws Exception{
		if (factura == null)
			throw new Exception("El objeto factura esta vacio");
		
		try {
			daoFactura.insertFactura(factura);
		} catch (Exception e) {
			throw new Exception("No se registro la Factua");
		}
		return true;
	}
	
}
