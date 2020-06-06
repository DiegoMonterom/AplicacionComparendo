package co.edu.ucentral.app.automovil.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


public class Conductor extends Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7701651352103944556L;

	
	private Integer idConductor;
	private Integer numeroLicencia;
	private Date fechaVencimiento;
	private Integer categoria;

	public Conductor() {
		
	}
	
	public Conductor(String tipoDocumento, Integer numeroDocumento, String nombre, String apellido, char tipoSangre,
			String factorSangre, Date fechaNacimiento, String direccionResidencia, Integer edad, String telefono,
			String municipio, String email, double estatura) {
		super(tipoDocumento, numeroDocumento, nombre, apellido, tipoSangre, factorSangre,fechaNacimiento, municipio, direccionResidencia,
				edad, telefono, email, estatura);
	}

	public Integer getId() {
		return idConductor;
	}

	public void setId(Integer id) {
		this.idConductor = id;
	}

	public Integer getNumeroLicencia() {
		return numeroLicencia;
	}

	public void setNumeroLicencia(Integer numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Conductor [id=" + idConductor + ", numeroLicencia=" + numeroLicencia + ", fechaVencimiento=" + fechaVencimiento
				+ ", categoria=" + categoria + "]";
	}

}
