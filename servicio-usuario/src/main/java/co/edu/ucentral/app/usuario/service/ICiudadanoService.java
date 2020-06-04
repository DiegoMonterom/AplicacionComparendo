package co.edu.ucentral.app.usuario.service;

import java.util.Optional;

import co.edu.ucentral.app.usuario.model.Ciudadano;

public interface ICiudadanoService {

	public Optional<Ciudadano> findbyNumeroDocumentoCiudadano(Integer numeroDocumento);
	public void insertarCiudadano(Ciudadano ciudadano);
	public void actualizarCiudadano(Ciudadano ciudadano);
	
	
}
