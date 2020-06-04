package co.edu.ucentral.app.usuario.service;

import java.util.Optional;

import co.edu.ucentral.app.usuario.model.Policia;

public interface IPoliciaService {

	public Optional<Policia> findbyNumeroDocumentoPolicia(Integer numeroDocumento);
	public void insertarPolicia (Policia policia);
	public void actualizarPolicia (Policia policia);
}
