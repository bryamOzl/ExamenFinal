package ec.edu.ups.MoraLitumaSRIJEE.negocio;

import javax.ejb.Local;

import ec.edu.ups.MoraLitumaSRIJEE.modelo.Factura;

@Local
public interface FacturaONLocal {

	public boolean crearFactura(Factura factura) throws Exception;
}
