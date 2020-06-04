package co.edu.ucentral.app.comparendo.service;

import java.util.List;
import java.util.Optional;

import co.edu.ucentral.app.comparendo.model.TipoInfraccion;

public interface ITipoInfraccionService {

	public List<TipoInfraccion>findAll();
	public Optional<TipoInfraccion>findById(Integer idTipoInfraccion);
}
