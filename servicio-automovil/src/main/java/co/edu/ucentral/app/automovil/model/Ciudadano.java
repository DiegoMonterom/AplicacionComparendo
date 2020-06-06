package co.edu.ucentral.app.automovil.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;


public class Ciudadano extends Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8108626855795525565L;
	
	//@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	//@GenericGenerator(name="native",strategy="native")
	
	private Integer idciudadano;


	public Ciudadano() {
	}





	public Ciudadano(String tipoDocumento, Integer numeroDocumento, String nombre, String apellido, char tipoSangre,
			String factorSangre, Date fechaNacimiento, String direccionResidencia, Integer edad, String telefono,
			String municipio, String email, double estatura) {
		
		super(tipoDocumento, numeroDocumento, nombre, apellido, tipoSangre, factorSangre,fechaNacimiento, municipio, direccionResidencia,
				edad, telefono, email, estatura);
		
	}


	public Integer getIdciudadano() {
		return idciudadano;
	}



	public void setIdciudadano(Integer idciudadano) {
		this.idciudadano = idciudadano;
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
	
	




	


