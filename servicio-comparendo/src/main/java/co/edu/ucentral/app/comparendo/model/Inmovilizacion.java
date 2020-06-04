package co.edu.ucentral.app.comparendo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Inmovilizaciones")
public class Inmovilizacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -47473030423353341L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idInmovilizacion;
	private Integer numeroPatio;
	private String direccionPatio;
	private Integer numeroGrua;
	private String placaGrua;
	
	public Inmovilizacion() {
		
	}
	
	public Inmovilizacion(Integer idInmovilizacion, Integer numeroPatio, String direccionPatio, Integer numeroGrua,
			String placaGrua) {
		super();
		this.idInmovilizacion = idInmovilizacion;
		this.numeroPatio = numeroPatio;
		this.direccionPatio = direccionPatio;
		this.numeroGrua = numeroGrua;
		this.placaGrua = placaGrua;
	}

	public Integer getIdInmovilizacion() {
		return idInmovilizacion;
	}

	public void setIdInmovilizacion(Integer idInmovilizacion) {
		this.idInmovilizacion = idInmovilizacion;
	}

	public Integer getNumeroPatio() {
		return numeroPatio;
	}

	public void setNumeroPatio(Integer numeroPatio) {
		this.numeroPatio = numeroPatio;
	}

	public String getDireccionPatio() {
		return direccionPatio;
	}

	public void setDireccionPatio(String direccionPatio) {
		this.direccionPatio = direccionPatio;
	}

	public Integer getNumeroGrua() {
		return numeroGrua;
	}

	public void setNumeroGrua(Integer numeroGrua) {
		this.numeroGrua = numeroGrua;
	}

	public String getPlacaGrua() {
		return placaGrua;
	}

	public void setPlacaGrua(String placaGrua) {
		this.placaGrua = placaGrua;
	}

	@Override
	public String toString() {
		return "Inmovilizacion [idInmovilizacion=" + idInmovilizacion + ", numeroPatio=" + numeroPatio
				+ ", direccionPatio=" + direccionPatio + ", numeroGrua=" + numeroGrua + ", placaGrua=" + placaGrua
				+ "]";
	}

}
