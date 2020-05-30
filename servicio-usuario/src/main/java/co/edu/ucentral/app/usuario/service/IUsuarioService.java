package co.edu.ucentral.app.usuario.service;

import java.util.List;
import java.util.Optional;

import co.edu.ucentral.app.usuario.model.Usuario;



public interface IUsuarioService {

	public List<Usuario> findAll();
	public Usuario buscar(Integer id);
	public void insertarUsuario(Usuario usuario);
	public void actualizarUsuario(Usuario usuario);
	
	
}
