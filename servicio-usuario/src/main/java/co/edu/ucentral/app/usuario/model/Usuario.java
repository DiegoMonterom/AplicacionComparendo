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
@Table (name="usuarios")
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	//@GeneratedValue(strategy=GenerationType.AUTO, generator="native")
	//@GenericGenerator(name="native",strategy="native")
	@Id
	@GeneratedValue
	private Integer numerodocumento;
	//@Column
	private String tipodocumento;
	//@Column
	private String nombre;
	//@Column
	private String apellido;
	//@Column
	private char tiposangre;
	//@Column
	private String factorsangre;
	//@Column
	@Temporal (TemporalType.DATE)
	private Date fechanacimiento;
	//@Column
	private String direccionresidencia;
	//@Column
	private Integer edad;
	//@Column
	private Integer telefono;
	//@Column
	private String municipio;
	//@Column
	private String email;
	//@Column
	private double estatura;
	//@Transient
	private Integer Port;
	
	
	
	
	
	
	
	public Usuario() {
	}
	public Usuario(String tipoDocumento, Integer numeroDocumento, String nombre, String apellido, char tipoSangre,
			String factorSangre, Date fechaNacimiento, String direccionResidencia, Integer edad, Integer telefono,
			String municipio, String email, double estatura) {
		this.tipodocumento = tipoDocumento;
		this.numerodocumento = numeroDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tiposangre = tipoSangre;
		this.factorsangre = factorSangre;
		this.fechanacimiento = fechaNacimiento;
		this.direccionresidencia = direccionResidencia;
		this.edad = edad;
		this.telefono = telefono;
		this.municipio = municipio;
		this.email = email;
		this.estatura = estatura;
	}
	public String getTipoDocumento() {
		return tipodocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipodocumento = tipoDocumento;
	}
	public Integer getNumeroDocumento() {
		return numerodocumento;
	}
	public void setNumeroDocumento(Integer numeroDocumento) {
		this.numerodocumento = numeroDocumento;
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
		return tiposangre;
	}
	public void setTipoSangre(char tipoSangre) {
		this.tiposangre = tipoSangre;
	}
	public String getFactorSangre() {
		return factorsangre;
	}
	public void setFactorSangre(String factorSangre) {
		this.factorsangre = factorSangre;
	}
	public Date getFechaNacimiento() {
		return fechanacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechanacimiento = fechaNacimiento;
	}
	public String getDireccionResidencia() {
		return direccionresidencia;
	}
	public void setDireccionResidencia(String direccionResidencia) {
		this.direccionresidencia = direccionResidencia;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
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
		return "Usuario [tipoDocumento=" + tipodocumento + ", numeroDocumento=" + numerodocumento + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", tipoSangre=" + tiposangre + ", factorSangre=" + factorsangre
				+ ", fechaNacimiento=" + fechanacimiento + ", direccionResidencia=" + direccionresidencia + ", edad="
				+ edad + ", telefono=" + telefono + ", municipio=" + municipio + ", email=" + email + ", estatura="
				+ estatura + "]";
	}
	
	
	
	
	
	
}
