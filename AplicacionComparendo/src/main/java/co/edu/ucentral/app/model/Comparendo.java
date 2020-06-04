package co.edu.ucentral.app.model;

import java.util.Date;

public class Comparendo {


		private int idComparendo;
		private String numeroComaprendo;
		private Date fechaInfraccion;
		private boolean accidente;
		private boolean reportaFuga;
		private boolean inmovilizacion;
		private Date horaInfraccion;
		private String estado;

		public Comparendo() {}
		
		
		public Comparendo(int idComaprendo, String numeroComaprendo, Date fechaInfraccion, boolean accidente,
		boolean reportaFuga, boolean inmovilizacion, Date horaInfraccion, String estado) {
		super();
		this.idComparendo = idComaprendo;
		this.numeroComaprendo = numeroComaprendo;
		this.fechaInfraccion = fechaInfraccion;
		this.accidente = accidente;
		this.reportaFuga = reportaFuga;
		this.inmovilizacion = inmovilizacion;
		this.horaInfraccion = horaInfraccion;
		this.estado = estado;
		}

		public int getidComparendo() {
		return idComparendo;
		}

		public void setidComparendo(int idComaprendo) {
		this.idComparendo = idComaprendo;
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

}
