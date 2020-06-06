package co.edu.ucentral.app.model;


public class Login {

	private String usuario;
	private String contra;
	
	
	public Login() {
		
	}
	public Login(String usuario, String pass) {
	
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
