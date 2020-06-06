package co.edu.ucentral.app.usuario.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table (name="funcionarios")
public class Funcionario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -858594266735802908L;

	@Id
	@GeneratedValue
	private Integer idFuncionario;
	private String nombreFuncionario;
	private String apellidoFuncionario;
	private String nombreUsuario;
	private String contraseña;
	@Transient
	private String confirmarContraseña;
	
	private Integer cedulaFuncionario;
	public Funcionario() {
		
	}
	
	public Funcionario(Integer idFuncionario, String nombreFuncionario, String apellidoFuncionario,
			String nombreUsuario, String contraseña, String confirmarContraseña, Integer cedulaFuncionario) {
		
		this.idFuncionario = idFuncionario;
		this.nombreFuncionario = nombreFuncionario;
		this.apellidoFuncionario = apellidoFuncionario;
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
		this.confirmarContraseña = confirmarContraseña;
		this.cedulaFuncionario = cedulaFuncionario;
	}

	public Integer getCedulaFuncionario() {
		return cedulaFuncionario;
	}

	public void setCedulaFuncionario(Integer cedulaFuncionario) {
		this.cedulaFuncionario = cedulaFuncionario;
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNombreFuncionario() {
		return nombreFuncionario;
	}

	public void setNombreFuncionario(String nombreFuncionario) {
		this.nombreFuncionario = nombreFuncionario;
	}

	public String getApellidoFuncionario() {
		return apellidoFuncionario;
	}

	public void setApellidoFuncionario(String apellidoFuncionario) {
		this.apellidoFuncionario = apellidoFuncionario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getConfirmarContraseña() {
		return confirmarContraseña;
	}

	public void setConfirmarContraseña(String confirmarContraseña) {
		this.confirmarContraseña = confirmarContraseña;
	}

	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nombreFuncionario=" + nombreFuncionario
				+ ", apellidoFuncionario=" + apellidoFuncionario + ", nombreUsuario=" + nombreUsuario + ", contraseña="
				+ contraseña + ", confirmarContraseña=" + confirmarContraseña + "]";
	}
	
}
