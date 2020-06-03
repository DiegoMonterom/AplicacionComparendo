package co.edu.ucentral.app.comparendo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tipoInfracciones")
public class TipoInfraccion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6947885607949565674L;

	@Id
	@GeneratedValue
	private Integer idTipoInfraccion;
	private String codigoInfraccion;
	private Integer costoInfraccion;
	private String descripcionInfraccion;
	
	public TipoInfraccion(Integer idTipoInfraccion, String codigoInfraccion, Integer costoInfraccion,
			String descripcionInfraccion) {
		super();
		this.idTipoInfraccion = idTipoInfraccion;
		this.codigoInfraccion = codigoInfraccion;
		this.costoInfraccion = costoInfraccion;
		this.descripcionInfraccion = descripcionInfraccion;
	}

	public Integer getIdTipoInfraccion() {
		return idTipoInfraccion;
	}

	public void setIdTipoInfraccion(Integer idTipoInfraccion) {
		this.idTipoInfraccion = idTipoInfraccion;
	}

	public String getCodigoInfraccion() {
		return codigoInfraccion;
	}

	public void setCodigoInfraccion(String codigoInfraccion) {
		this.codigoInfraccion = codigoInfraccion;
	}

	public Integer getCostoInfraccion() {
		return costoInfraccion;
	}

	public void setCostoInfraccion(Integer costoInfraccion) {
		this.costoInfraccion = costoInfraccion;
	}

	public String getDescripcionInfraccion() {
		return descripcionInfraccion;
	}

	public void setDescripcionInfraccion(String descripcionInfraccion) {
		this.descripcionInfraccion = descripcionInfraccion;
	}

	@Override
	public String toString() {
		return "TipoInfraccion [idTipoInfraccion=" + idTipoInfraccion + ", codigoInfraccion=" + codigoInfraccion
				+ ", costoInfraccion=" + costoInfraccion + ", descripcionInfraccion=" + descripcionInfraccion + "]";
	}

}
