package ec.edu.ups.MoraBryamCajeraJEE.service;


import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import ec.edu.ups.MoraBryamCajeraJEE.modelo.Cuenta;
import ec.edu.ups.MoraBryamCajeraJEE.modelo.Movimiento;
import ec.edu.ups.MoraBryamCajeraJEE.negocio.CuentaONLocal;

@Path("cuenta")
public class CuentaServiceREST {

	@Inject
	private CuentaONLocal onCuenta;
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path("crearCuenta")
	public Mensaje crearPersona(Cuenta cuenta){
		Mensaje msj = new Mensaje();
		try {
			onCuenta.crearCuenta(cuenta);
			msj.setCode("OK");
			msj.setMessage("Se registro la Cuenta");
			return msj;
		} catch (Exception e) {
			e.printStackTrace();
			msj.setCode("ERROR");
			msj.setMessage("Error al registrar la Cuenta");
			return msj;
		}
	}
	
	@GET
	@Produces("application/json")
	@Path("buscarCuenta")
	public Cuenta buscarCedula(@QueryParam("cedula") String cedula) throws Exception {
		if (cedula.equals("")) {
			throw new Exception("Ingrese la Cedula");
		} else {
			Cuenta cuenta = onCuenta.buscarCuenta(cedula);
			return cuenta;
		}
	}
	
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	@Path("crearMovimieto")
	public Mensaje crearMovimiento(Movimiento movimiento){
		Mensaje msj = new Mensaje();
		try {
			onCuenta.crearMovimiento(movimiento);
			msj.setCode("OK");
			msj.setMessage("Se registro el Movimiento");
			return msj;
		} catch (Exception e) {
			e.printStackTrace();
			msj.setCode("ERROR");
			msj.setMessage("Error al registrar el Movimiento");
			return msj;
		}
	}
}
