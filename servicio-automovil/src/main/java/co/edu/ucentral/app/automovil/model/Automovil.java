package co.edu.ucentral.app.automovil.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
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
	private String placa;
	private Integer idPropietario;
	private Integer numeroLicencia;
	private String estado;
	private String marca;
	private Integer modelo;
	private String numeroChasis;
	private Integer cilindraje;
	private String tipoCombustible;
	private String color;
	private String numeroMotor;
	private String tipoCarroceria;
	@Temporal (TemporalType.DATE)
	private Date fechMatricula;
	private Integer numeroPuertas;
	@Transient
	private Integer Port;
	

	public Automovil() {
	
	}
	public Automovil(String placa, Integer idPropietario, Integer numeroLicencia, String estado, String marca,
			Integer modelo, String numeroChasis, Integer cilindraje, String tipoCombustible, String color,
			String numeroMotor, String tipoCarroceria, Date fechMatricula, Integer numeroPuertas) {
		
		this.placa = placa;
		this.idPropietario = idPropietario;
		this.numeroLicencia = numeroLicencia;
		this.estado = estado;
		this.marca = marca;
		this.modelo = modelo;
		this.numeroChasis = numeroChasis;
		this.cilindraje = cilindraje;
		this.tipoCombustible = tipoCombustible;
		this.color = color;
		this.numeroMotor = numeroMotor;
		this.tipoCarroceria = tipoCarroceria;
		this.fechMatricula = fechMatricula;
		this.numeroPuertas = numeroPuertas;
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
		return idPropietario;
	}
	public void setIdPropietario(Integer idPropietario) {
		this.idPropietario = idPropietario;
	}
	public Integer getNumeroLicencia() {
		return numeroLicencia;
	}
	public void setNumeroLicencia(Integer numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
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
		return numeroChasis;
	}
	public void setNumeroChasis(String numeroChasis) {
		this.numeroChasis = numeroChasis;
	}
	public Integer getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(Integer cilindraje) {
		this.cilindraje = cilindraje;
	}
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNumeroMotor() {
		return numeroMotor;
	}
	public void setNumeroMotor(String numeroMotor) {
		this.numeroMotor = numeroMotor;
	}
	public String getTipoCarroceria() {
		return tipoCarroceria;
	}
	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}
	public Date getFechMatricula() {
		return fechMatricula;
	}
	public void setFechMatricula(Date fechMatricula) {
		this.fechMatricula = fechMatricula;
	}
	public Integer getNumeroPuertas() {
		return numeroPuertas;
	}
	public void setNumeroPuertas(Integer numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	@Override
	public String toString() {
		return "Automovil [placa=" + placa + ", idPropietario=" + idPropietario + ", numeroLicencia=" + numeroLicencia
				+ ", estado=" + estado + ", marca=" + marca + ", modelo=" + modelo + ", numeroChasis=" + numeroChasis
				+ ", cilindraje=" + cilindraje + ", tipoCombustible=" + tipoCombustible + ", color=" + color
				+ ", numeroMotor=" + numeroMotor + ", tipoCarroceria=" + tipoCarroceria + ", fechMatricula="
				+ fechMatricula + ", numeroPuertas=" + numeroPuertas + "]";
	}

	
	
	
	
}
