package ec.edu.ups.MoraBryamOperadoraJEE.negocio;

import javax.ejb.Local;

import ec.edu.ups.MoraBryamOperadoraJEE.modelo.Recarga;

@Local
public interface RecargaONLocal {

	public boolean crearRecarga(Recarga recarga) throws Exception;
}
