package ec.edu.ups.MoraBryamOperadoraJEE.service;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import ec.edu.ups.MoraBryamOperadoraJEE.modelo.Recarga;
import ec.edu.ups.MoraBryamOperadoraJEE.negocio.RecargaONLocal;

@Path("recarga")
public class RecargaServiceREST {


	@Inject
	private RecargaONLocal onRecarga;

	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path("crearRegistro")
	public Mensaje crearRecarga(Recarga recarga) {
		Mensaje msj = new Mensaje();
		try {
			onRecarga.crearRecarga(recarga);
			msj.setCode("OK");
			msj.setMessage("Se registro la Recarga");
			return msj;
		} catch (Exception e) {
			e.printStackTrace();
			msj.setCode("ERROR");
			msj.setMessage("Error al registrar la Recarga");
			return msj;
		}

	}
}
