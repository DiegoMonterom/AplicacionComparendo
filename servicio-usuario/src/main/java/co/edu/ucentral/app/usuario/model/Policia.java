package co.edu.ucentral.app.usuario.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="policias")
public class Policia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -489344888305654515L;

	@Id
	@GeneratedValue
	private Integer idPolicia;
	private String tipoDocumentoPolicia;
	private Integer numeroDocumentoPolicia;
	private String nombrePolicia;
	private String apellidoPolicia;
	private Integer numeroPolicia;
	private String placaPolicia;
	private String entidadPolicia;
	
	public Policia(Integer idPolicia, String tipoDocumentoPolicia, Integer numeroDocumentoPolicia, String nombrePolicia,
			String apellidoPolicia, Integer numeroPolicia, String placaPolicia, String entidadPolicia) {
		super();
		this.idPolicia = idPolicia;
		this.tipoDocumentoPolicia = tipoDocumentoPolicia;
		this.numeroDocumentoPolicia = numeroDocumentoPolicia;
		this.nombrePolicia = nombrePolicia;
		this.apellidoPolicia = apellidoPolicia;
		this.numeroPolicia = numeroPolicia;
		this.placaPolicia = placaPolicia;
		this.entidadPolicia = entidadPolicia;
	}

	public Integer getIdPolicia() {
		return idPolicia;
	}

	public void setIdPolicia(Integer idPolicia) {
		this.idPolicia = idPolicia;
	}

	public String getTipoDocumentoPolicia() {
		return tipoDocumentoPolicia;
	}

	public void setTipoDocumentoPolicia(String tipoDocumentoPolicia) {
		this.tipoDocumentoPolicia = tipoDocumentoPolicia;
	}

	public Integer getNumeroDocumentoPolicia() {
		return numeroDocumentoPolicia;
	}

	public void setNumeroDocumentoPolicia(Integer numeroDocumentoPolicia) {
		this.numeroDocumentoPolicia = numeroDocumentoPolicia;
	}

	public String getNombrePolicia() {
		return nombrePolicia;
	}

	public void setNombrePolicia(String nombrePolicia) {
		this.nombrePolicia = nombrePolicia;
	}

	public String getApellidoPolicia() {
		return apellidoPolicia;
	}

	public void setApellidoPolicia(String apellidoPolicia) {
		this.apellidoPolicia = apellidoPolicia;
	}

	public Integer getNumeroPolicia() {
		return numeroPolicia;
	}

	public void setNumeroPolicia(Integer numeroPolicia) {
		this.numeroPolicia = numeroPolicia;
	}

	public String getPlacaPolicia() {
		return placaPolicia;
	}

	public void setPlacaPolicia(String placaPolicia) {
		this.placaPolicia = placaPolicia;
	}

	public String getEntidadPolicia() {
		return entidadPolicia;
	}

	public void setEntidadPolicia(String entidadPolicia) {
		this.entidadPolicia = entidadPolicia;
	}

	@Override
	public String toString() {
		return "Policia [idPolicia=" + idPolicia + ", tipoDocumentoPolicia=" + tipoDocumentoPolicia
				+ ", numeroDocumentoPolicia=" + numeroDocumentoPolicia + ", nombrePolicia=" + nombrePolicia
				+ ", apellidoPolicia=" + apellidoPolicia + ", numeroPolicia=" + numeroPolicia + ", placaPolicia="
				+ placaPolicia + ", entidadPolicia=" + entidadPolicia + "]";
	}
	
}
