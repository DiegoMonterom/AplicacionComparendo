package co.edu.ucentral.app.usuario.service;

import java.util.List;
import java.util.Optional;

import co.edu.ucentral.app.usuario.model.Ciudadano;



public interface IUsuarioService {

	public List<Ciudadano> findAll();
	public Ciudadano buscar(Integer id);
	public void insertarUsuario(Ciudadano usuario);
	public void actualizarUsuario(Ciudadano usuario);
	
	
}
