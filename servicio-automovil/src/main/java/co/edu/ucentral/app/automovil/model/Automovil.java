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

@Entity
@Table (name="automoviles")
public class Automovil implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String placa;
	private Integer idciudadanos;
	private Integer numerolicenciatrafico;
	private String estado;
	private String marca;
	private Integer modelo;
	private String numerochasis;
	private Integer cilindraje;
	private String tipocombustible;
	private String color;
	private String numeromotor;
	private String tipocarroceria;
	@Temporal (TemporalType.DATE)
	private Date fechamatricula;
	private Integer numeropuertas;
	@Transient
	private Integer Port;
	

	public Automovil() {
	
	}
	public Automovil(String placa, Integer idPropietario, Integer numeroLicencia, String estado, String marca,
			Integer modelo, String numeroChasis, Integer cilindraje, String tipoCombustible, String color,
			String numeroMotor, String tipoCarroceria, Date fechMatricula, Integer numeroPuertas) {
		
		this.placa = placa;
		this.idciudadanos = idPropietario;
		this.numerolicenciatrafico = numeroLicencia;
		this.estado = estado;
		this.marca = marca;
		this.modelo = modelo;
		this.numerochasis = numeroChasis;
		this.cilindraje = cilindraje;
		this.tipocombustible = tipoCombustible;
		this.color = color;
		this.numeromotor = numeroMotor;
		this.tipocarroceria = tipoCarroceria;
		this.fechamatricula = fechMatricula;
		this.numeropuertas = numeroPuertas;
	}
	
	
	
	
	public Integer getIdAutomovil() {
		return id;
	}
	public void setIdAutomovil(Integer idAutomovil) {
		this.id = idAutomovil;
	}
	public Integer getIdCiudadanos() {
		return idciudadanos;
	}
	public void setIdCiudadanos(Integer idCiudadanos) {
		this.idciudadanos = idCiudadanos;
	}
	public Integer getNumeroLicenciaTrafico() {
		return numerolicenciatrafico;
	}
	public void setNumeroLicenciaTrafico(Integer numeroLicenciaTrafico) {
		this.numerolicenciatrafico = numeroLicenciaTrafico;
	}
	public Date getFechaMatricula() {
		return fechamatricula;
	}
	public void setFechaMatricula(Date fechaMatricula) {
		this.fechamatricula = fechaMatricula;
	}
	public Integer getPort() {
		return Port;
	}
	public void setPort(Integer port) {
		Port = port;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Integer getIdPropietario() {
		return idciudadanos;
	}
	public void setIdPropietario(Integer idPropietario) {
		this.idciudadanos = idPropietario;
	}
	public Integer getNumeroLicencia() {
		return numerolicenciatrafico;
	}
	public void setNumeroLicencia(Integer numeroLicencia) {
		this.numerolicenciatrafico = numeroLicencia;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getModelo() {
		return modelo;
	}
	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}
	public String getNumeroChasis() {
		return numerochasis;
	}
	public void setNumeroChasis(String numeroChasis) {
		this.numerochasis = numeroChasis;
	}
	public Integer getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(Integer cilindraje) {
		this.cilindraje = cilindraje;
	}
	public String getTipoCombustible() {
		return tipocombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		this.tipocombustible = tipoCombustible;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNumeroMotor() {
		return numeromotor;
	}
	public void setNumeroMotor(String numeroMotor) {
		this.numeromotor = numeroMotor;
	}
	public String getTipoCarroceria() {
		return tipocarroceria;
	}
	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipocarroceria = tipoCarroceria;
	}
	public Date getFechMatricula() {
		return fechamatricula;
	}
	public void setFechMatricula(Date fechMatricula) {
		this.fechamatricula = fechMatricula;
	}
	public Integer getNumeroPuertas() {
		return numeropuertas;
	}
	public void setNumeroPuertas(Integer numeroPuertas) {
		this.numeropuertas = numeroPuertas;
	}
	@Override
	public String toString() {
		return "Automovil [placa=" + placa + ", idPropietario=" + idciudadanos + ", numeroLicencia=" + numerolicenciatrafico
				+ ", estado=" + estado + ", marca=" + marca + ", modelo=" + modelo + ", numeroChasis=" + numerochasis
				+ ", cilindraje=" + cilindraje + ", tipoCombustible=" + tipocombustible + ", color=" + color
				+ ", numeroMotor=" + numeromotor + ", tipoCarroceria=" + tipocarroceria + ", fechMatricula="
				+ fechamatricula + ", numeroPuertas=" + numeropuertas + "]";
	}

	
	
	
	
}
