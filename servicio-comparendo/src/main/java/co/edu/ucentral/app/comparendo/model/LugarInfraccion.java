package co.edu.ucentral.app.comparendo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="lugarInfraccion")
public class LugarInfraccion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5027047115015436207L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLugarInfraccion;
	private String direccionInfraccion;
	private String localidadInfraccion;
	
	public LugarInfraccion() {
		
	}
	
	public LugarInfraccion(Integer idLugarInfraccion, String direccionInfraccion, String localidadInfraccion) {
		super();
		this.idLugarInfraccion = idLugarInfraccion;
		this.direccionInfraccion = direccionInfraccion;
		this.localidadInfraccion = localidadInfraccion;
	}

	public Integer getIdLugarInfraccion() {
		return idLugarInfraccion;
	}

	public void setIdLugarInfraccion(Integer idLugarInfraccion) {
		this.idLugarInfraccion = idLugarInfraccion;
	}

	public String getDireccionInfraccion() {
		return direccionInfraccion;
	}

	public void setDireccionInfraccion(String direccionInfraccion) {
		this.direccionInfraccion = direccionInfraccion;
	}

	public String getLocalidadInfraccion() {
		return localidadInfraccion;
	}

	public void setLocalidadInfraccion(String localidadInfraccion) {
		this.localidadInfraccion = localidadInfraccion;
	}

	@Override
	public String toString() {
		return "LugarInfraccion [idLugarInfraccion=" + idLugarInfraccion + ", direccionInfraccion="
				+ direccionInfraccion + ", localidadInfraccion=" + localidadInfraccion + "]";
	}
	
}
