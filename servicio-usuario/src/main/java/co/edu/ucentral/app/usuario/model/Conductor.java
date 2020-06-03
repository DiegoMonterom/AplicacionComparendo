package co.edu.ucentral.app.usuario.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="conductores")
public class Conductor extends Ciudadano implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7701651352103944556L;
	@Id
	@GeneratedValue
	private Integer id;
	private Integer numeroLicencia;
	private Date fechaVencimiento;
	private Integer categoria;

	public Conductor(String tipoDocumento, Integer numeroDocumento, String nombre, String apellido, char tipoSangre,
			String factorSangre, Date fechaNacimiento, String direccionResidencia, Integer edad, String telefono,
			String municipio, String email, double estatura) {
		super(tipoDocumento, numeroDocumento, nombre, apellido, tipoSangre, factorSangre, fechaNacimiento, direccionResidencia,
				edad, telefono, municipio, email, estatura);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		return "Conductor [id=" + id + ", numeroLicencia=" + numeroLicencia + ", fechaVencimiento=" + fechaVencimiento
				+ ", categoria=" + categoria + "]";
	}

}
