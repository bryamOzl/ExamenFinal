package ec.edu.ups.MoraLitumaSRIJEE.service;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ec.edu.ups.MoraLitumaSRIJEE.modelo.Factura;
import ec.edu.ups.MoraLitumaSRIJEE.negocio.FacturaONLocal;

@Path("factura")
public class FacturaServiceREST {

	@Inject
	private FacturaONLocal onFactura;
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path("crearFactura")
	public Mensaje crearRecarga(Factura factura) {
		Mensaje msj = new Mensaje();
		try {
			onFactura.crearFactura(factura);
			msj.setCode("OK");
			msj.setMessage("Se registro la Factura");
			return msj;
		} catch (Exception e) {
			e.printStackTrace();
			msj.setCode("ERROR");
			msj.setMessage("Error al registrar la Factura");
			return msj;
		}

	}
	
}
