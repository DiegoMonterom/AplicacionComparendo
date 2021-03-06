package co.edu.ucentral.app.model;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat.ISO;



public class Usuario {

	
	private Integer numerodocumento;
	private String tipodocumento;
	private String nombre;
	private String apellido;
	private char tiposangre;
	private String factorsangre;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechanacimiento;
	private String direccionresidencia;
	private Integer edad;
	private Integer telefono;
	private String municipio;
	private String email;
	private double estatura;
	
	
	
	public Integer getNumerodocumento() {
		return numerodocumento;
	}
	public void setNumerodocumento(Integer numerodocumento) {
		this.numerodocumento = numerodocumento;
	}
	public String getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
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
	public char getTiposangre() {
		return tiposangre;
	}
	public void setTiposangre(char tiposangre) {
		this.tiposangre = tiposangre;
	}
	public String getFactorsangre() {
		return factorsangre;
	}
	public void setFactorsangre(String factorsangre) {
		this.factorsangre = factorsangre;
	}
	public Date getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getDireccionresidencia() {
		return direccionresidencia;
	}
	public void setDireccionresidencia(String direccionresidencia) {
		this.direccionresidencia = direccionresidencia;
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

	
	
	
}
