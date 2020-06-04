package co.edu.ucentral.app.service;

import java.util.List;

import co.edu.ucentral.app.model.Automovil;
import co.edu.ucentral.app.model.Comparendo;
import co.edu.ucentral.app.model.Usuario;

public interface IComparendoService {

	public void login(String username, String password);
	public void registrarAutomovil(Automovil automovil);
	public void registrarUsuario(Usuario usuario);
	public void registrarComparendo(Comparendo comparendo);
	
	public void actualizarAutomovil(Automovil automovil);
	public void actualizarUsuario(Usuario usuario);
	
	public Automovil consultarAutomovil(String placa);
	public Usuario consultarUsuario(Integer numeroDocumento);
	public List<Comparendo> consultarHistorialComparendos(Integer numeroDocumento);
	public Comparendo consultarComparendoIndividual(String numeroComparendo);
	
	public Automovil modificarAutomovil(Automovil automovil);
	public Usuario modificarUsuario(Usuario usuario);
}


