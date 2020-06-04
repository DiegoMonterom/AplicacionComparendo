package co.edu.ucentral.app.comparendo.service;

import java.util.Optional;

import co.edu.ucentral.app.comparendo.model.Comparendo;

public interface IComparendoService {

	public Optional<Comparendo>findbyNumeroComparendo(String numeroComparendo);
	public void insertarComparendo(Comparendo comparendo);
	public void actualizarComparendo(Comparendo comparendo);
}
