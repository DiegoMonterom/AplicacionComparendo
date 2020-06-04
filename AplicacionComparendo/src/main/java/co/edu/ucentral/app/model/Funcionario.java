package co.edu.ucentral.app.model;


public class Funcionario {

	private String usuario;
	private String contra;
	
	
	public Funcionario() {
		
	}
	public Funcionario(String usuario, String pass) {
	
		this.usuario = usuario;
		this.contra = pass;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContra() {
		return contra;
	}
	public void setContra(String contra) {
		this.contra = contra;
	}
	
	
	
	
	
}
