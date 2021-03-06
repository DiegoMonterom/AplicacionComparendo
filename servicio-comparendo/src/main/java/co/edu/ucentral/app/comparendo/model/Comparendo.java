package co.edu.ucentral.app.comparendo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idcomparendo")
	private int idComparendo;
	@Column(name="numerocomparendo")
	private String numeroComparendo;
	@Column(name="fechainfraccion")
	private Date fechaInfraccion;
	private boolean accidente;
	@Column(name="reportafuga")
	private boolean reportaFuga;
	private boolean inmovilizacion;
	@Column(name="horainfraccion")
	private Date horaInfraccion;
	private String estado;
	
	public Comparendo() {
		
	}
	
	public Comparendo(int idComparendo, String numeroComparendo, Date fechaInfraccion, boolean accidente,
			boolean reportaFuga, boolean inmovilizacion, Date horaInfraccion, String estado) {
		super();
		this.idComparendo = idComparendo;
		this.numeroComparendo = numeroComparendo;
		this.fechaInfraccion = fechaInfraccion;
		this.accidente = accidente;
		this.reportaFuga = reportaFuga;
		this.inmovilizacion = inmovilizacion;
		this.horaInfraccion = horaInfraccion;
		this.estado = estado;
	}

	public int getIdComparendo() {
		return idComparendo;
	}

	public void setIdComparendo(int idComparendo) {
		this.idComparendo = idComparendo;
	}

	public String getNumeroComparendo() {
		return numeroComparendo;
	}

	public void setNumeroComparendo(String numeroComparendo) {
		this.numeroComparendo = numeroComparendo;
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
		return "Comparendo [idComaprendo=" + idComparendo + ", numeroComaprendo=" + numeroComparendo
				+ ", fechaInfraccion=" + fechaInfraccion + ", accidente=" + accidente + ", reportaFuga=" + reportaFuga
				+ ", inmovilizacion=" + inmovilizacion + ", horaInfraccion=" + horaInfraccion + ", estado=" + estado
				+ "]";
	}
}
