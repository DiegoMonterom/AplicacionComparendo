package co.edu.ucentral.app.usuario.model;

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

@Entity
@Table (name="ciudadanos")
public class Ciudadano implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8108626855795525565L;
	
	//@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	//@GenericGenerator(name="native",strategy="native")
	@Id
	@GeneratedValue
	private Integer idCiudadano;
	private String tipoDocumento;
	private Integer numeroDocumento;
	private String nombre;
	private String apellido;
	private char tipoSangre;
	private String factorSangre;
	@Temporal (TemporalType.DATE)
	private Date fechaNacimiento;
	private String direccionResidencia;
	private Integer edad;
	private String telefono;
	private String municipio;
	private String email;
	private double estatura;
	//@Transient
	private Integer Port;
	
	
	public Ciudadano() {
	}
	public Ciudadano(String tipoDocumento, Integer numeroDocumento, String nombre, String apellido, char tipoSangre,
			String factorSangre, Date fechaNacimiento, String direccionResidencia, Integer edad, String telefono,
			String municipio, String email, double estatura) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
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
	public Integer getIdCiudadano() {
		return idCiudadano;
	}
	public void setIdCiudadano(Integer idCiudadano) {
		this.idCiudadano = idCiudadano;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public Integer getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(Integer numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
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
	public Integer getPort() {
		return Port;
	}
	public void setPort(Integer port) {
		Port = port;
	}
	@Override
	public String toString() {
		return "Ciudadano [idCiudadano=" + idCiudadano + ", tipoDocumento=" + tipoDocumento + ", numeroDocumento="
				+ numeroDocumento + ", nombre=" + nombre + ", apellido=" + apellido + ", tipoSangre=" + tipoSangre
				+ ", factorSangre=" + factorSangre + ", fechaNacimiento=" + fechaNacimiento + ", direccionResidencia="
				+ direccionResidencia + ", edad=" + edad + ", telefono=" + telefono + ", municipio=" + municipio
				+ ", email=" + email + ", estatura=" + estatura + ", Port=" + Port + "]";
	}
	
}
