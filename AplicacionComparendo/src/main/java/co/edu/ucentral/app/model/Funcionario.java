package co.edu.ucentral.app.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table (name="funcionarios")
public class Funcionario implements Serializable {

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
	private String contrasena;
	@Transient
	private String confirmarContrasena;
	
	public Funcionario() {
		
	}
	
	public Funcionario(Integer idFuncionario, String nombreFuncionario, String apellidoFuncionario,
			String nombreUsuario, String contrasena, String confirmarContrasena) {
		super();
		this.idFuncionario = idFuncionario;
		this.nombreFuncionario = nombreFuncionario;
		this.apellidoFuncionario = apellidoFuncionario;
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
		this.confirmarContrasena = confirmarContrasena;
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

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getConfirmarContrasena() {
		return confirmarContrasena;
	}

	public void setConfirmarContrasena(String confirmarContrasena) {
		this.confirmarContrasena = confirmarContrasena;
	}

	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nombreFuncionario=" + nombreFuncionario
				+ ", apellidoFuncionario=" + apellidoFuncionario + ", nombreUsuario=" + nombreUsuario + ", contrasena="
				+ contrasena + ", confirmarContrasena=" + confirmarContrasena + "]";
	}
	
}
