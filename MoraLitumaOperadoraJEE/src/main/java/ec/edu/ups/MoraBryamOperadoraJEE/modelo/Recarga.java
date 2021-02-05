package ec.edu.ups.MoraBryamOperadoraJEE.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Recarga implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="recarga_id")
	private int recargaId;
	private String celular;
	private double valor;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="cuenta_id")
	private Cuenta cuenta;
	public int getRecargaId() {
		return recargaId;
	}
	public void setRecargaId(int recargaId) {
		this.recargaId = recargaId;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	@Override
	public String toString() {
		return "Recaga [recargaId=" + recargaId + ", celular=" + celular + ", valor=" + valor + ", cuenta=" + cuenta
				+ "]";
	}

}
