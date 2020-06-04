package co.edu.ucentral.app.comparendo.service;

import java.util.List;
import java.util.Optional;

import co.edu.ucentral.app.comparendo.model.Municipio;

public interface IMunicipioService {

	public List<Municipio> findAll();
	public Optional<Municipio> findById(Integer idMunicipio);
}
