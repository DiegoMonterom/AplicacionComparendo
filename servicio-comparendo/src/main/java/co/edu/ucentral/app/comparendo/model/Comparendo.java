package co.edu.ucentral.app.comparendo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="comparendos")
public class Comparendo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5936498238810961046L;
	
	@Id
	@GeneratedValue
	private int idComaprendo;
	private String numeroComaprendo;
	private Date fechaInfraccion;
	private boolean accidente;
	private boolean reportaFuga;
	private boolean inmovilizacion;
	private Date horaInfraccion;
	private String estado;
	
	public Comparendo(int idComaprendo, String numeroComaprendo, Date fechaInfraccion, boolean accidente,
			boolean reportaFuga, boolean inmovilizacion, Date horaInfraccion, String estado) {
		super();
		this.idComaprendo = idComaprendo;
		this.numeroComaprendo = numeroComaprendo;
		this.fechaInfraccion = fechaInfraccion;
		this.accidente = accidente;
		this.reportaFuga = reportaFuga;
		this.inmovilizacion = inmovilizacion;
		this.horaInfraccion = horaInfraccion;
		this.estado = estado;
	}

	public int getIdComaprendo() {
		return idComaprendo;
	}

	public void setIdComaprendo(int idComaprendo) {
		this.idComaprendo = idComaprendo;
	}

	public String getNumeroComaprendo() {
		return numeroComaprendo;
	}

	public void setNumeroComaprendo(String numeroComaprendo) {
		this.numeroComaprendo = numeroComaprendo;
	}

	public Date getFechaInfraccion() {
		return fechaInfraccion;
	}

	public void setFechaInfraccion(Date fechaInfraccion) {
		this.fechaInfraccion = fechaInfraccion;
	}

	public boolean isAccidente() {
		return accidente;
	}

	public void setAccidente(boolean accidente) {
		this.accidente = accidente;
	}

	public boolean isReportaFuga() {
		return reportaFuga;
	}

	public void setReportaFuga(boolean reportaFuga) {
		this.reportaFuga = reportaFuga;
	}

	public boolean isInmovilizacion() {
		return inmovilizacion;
	}

	public void setInmovilizacion(boolean inmovilizacion) {
		this.inmovilizacion = inmovilizacion;
	}

	public Date getHoraInfraccion() {
		return horaInfraccion;
	}

	public void setHoraInfraccion(Date horaInfraccion) {
		this.horaInfraccion = horaInfraccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Comparendo [idComaprendo=" + idComaprendo + ", numeroComaprendo=" + numeroComaprendo
				+ ", fechaInfraccion=" + fechaInfraccion + ", accidente=" + accidente + ", reportaFuga=" + reportaFuga
				+ ", inmovilizacion=" + inmovilizacion + ", horaInfraccion=" + horaInfraccion + ", estado=" + estado
				+ "]";
	}
}
