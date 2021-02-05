package ec.edu.ups.MoraBryamCajeraJEE.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Movimiento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="movimiento_id")
	private int movimientoId;
	private String tipo;
	private Date fecha;
	private double saldo;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="cuenta_id")
	private Cuenta cuenta;
	
	public int getMovimientoId() {
		return movimientoId;
	}
	public void setMovimientoId(int movimientoId) {
		this.movimientoId = movimientoId;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Movimiento [movimientoId=" + movimientoId + ", tipo=" + tipo + ", fecha=" + fecha + ", saldo=" + saldo
				+ "]";
	}

}
