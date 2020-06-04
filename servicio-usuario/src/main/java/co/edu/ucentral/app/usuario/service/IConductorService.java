package co.edu.ucentral.app.usuario.service;

import java.util.Optional;

import co.edu.ucentral.app.usuario.model.Conductor;

public interface IConductorService {

	public Optional<Conductor> findbyNumeroDocumentoConductor(Integer numeroDocumento);
	public void insertarConductor(Conductor conductor);
	public void actualizarConductor(Conductor conductor);
}
