package co.edu.ucentral.app.comparendo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="tipoInfracciones")
public class Municipio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8059556088125476198L;

	@Id
	@GeneratedValue
	private Integer idMunicipio;
	private Integer codigoPostalMunicipio;
	private String nombreMunicipio;
	
	public Municipio(Integer idMunicipio, Integer codigoPostalMunicipio, String nombreMunicipio) {
		super();
		this.idMunicipio = idMunicipio;
		this.codigoPostalMunicipio = codigoPostalMunicipio;
		this.nombreMunicipio = nombreMunicipio;
	}

	public Integer getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(Integer idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public Integer getCodigoPostalMunicipio() {
		return codigoPostalMunicipio;
	}

	public void setCodigoPostalMunicipio(Integer codigoPostalMunicipio) {
		this.codigoPostalMunicipio = codigoPostalMunicipio;
	}

	public String getNombreMunicipio() {
		return nombreMunicipio;
	}

	public void setNombreMunicipio(String nombreMunicipio) {
		this.nombreMunicipio = nombreMunicipio;
	}

	@Override
	public String toString() {
		return "Municipio [idMunicipio=" + idMunicipio + ", codigoPostalMunicipio=" + codigoPostalMunicipio
				+ ", nombreMunicipio=" + nombreMunicipio + "]";
	}

}
