package co.edu.ucentral.app.automovil.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;





@MappedSuperclass
public class Usuario implements Serializable{



	/**
	 * 
	 */
	private static final long serialVersionUID = 8108626855795525565L;
	
	//@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	//@GenericGenerator(name="native",strategy="native")
	//@Id
	//@GeneratedValue
//	@Column(name="idciudadano")
	//private Integer idciudadano;
	@Column(name="tipodocumento")
	protected String tipoDocumento;
	protected Integer cedula;
	protected String nombre;
	protected String apellido;
	@Column(name="tiposangre")
	protected char tipoSangre;
	@Column(name="factorsangre")
	protected String factorSangre;
	@Temporal (TemporalType.DATE)
	@Column(name="fechanacimiento")
	protected Date fechaNacimiento;
	@Column(name="direccionresidencia")
	protected String direccionResidencia;
	protected Integer edad;
	protected String telefono;
	protected String municipio;
	protected String email;
	protected double estatura;
	//@Transient
	//private Integer Port;


	public Usuario() {
	}
	public Usuario(String tipoDocumento, Integer numeroDocumento, String nombre, String apellido, char tipoSangre,
			String factorSangre, Date fechaNacimiento, String municipio ,String direccionResidencia, Integer edad, String telefono,
			 String email, double estatura) {
		this.tipoDocumento = tipoDocumento;
		this.cedula = numeroDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoSangre = tipoSangre;
		this.factorSangre = factorSangre;
		this.fechaNacimiento = fechaNacimiento;
		this.direccionResidencia = direccionResidencia;
		this.edad = edad;
		this.telefono = telefono;
		this.municipio = municipio;
		this.email = email;
		this.estatura = estatura;
	}
	/*
	public Integer getIdCiudadano() {
		return idciudadano;
	}
	public void setIdCiudadano(Integer idCiudadano) {
		this.idciudadano = idCiudadano;
	}
	*/
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public Integer getNumeroDocumento() {
		return cedula;
	}
	public void setNumeroDocumento(Integer numeroDocumento) {
		this.cedula = numeroDocumento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public char getTipoSangre() {
		return tipoSangre;
	}
	public void setTipoSangre(char tipoSangre) {
		this.tipoSangre = tipoSangre;
	}
	public String getFactorSangre() {
		return factorSangre;
	}
	public void setFactorSangre(String factorSangre) {
		this.factorSangre = factorSangre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDireccionResidencia() {
		return direccionResidencia;
	}
	public void setDireccionResidencia(String direccionResidencia) {
		this.direccionResidencia = direccionResidencia;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public Integer getCedula() {
		return cedula;
	}
	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "Ciudadano [" + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento="
				+ cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", tipoSangre=" + tipoSangre
				+ ", factorSangre=" + factorSangre + ", fechaNacimiento=" + fechaNacimiento + ", direccionResidencia="
				+ direccionResidencia + ", edad=" + edad + ", telefono=" + telefono 
				+ ", email=" + email + ", estatura=" + estatura + "]";
	}

}
