package co.edu.ucentral.app.comparendo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.app.comparendo.model.TipoInfraccion;
import co.edu.ucentral.app.comparendo.repository.TipoInfraccionRepository;

@Service
public class TipoInfraccionServiceImpl implements ITipoInfraccionService{

	@Autowired
	private TipoInfraccionRepository tipoInfraccionRepo;

	@Override
	public List<TipoInfraccion> findAll() {
		Iterable<TipoInfraccion> it = tipoInfraccionRepo.findAll();
		return (List<TipoInfraccion>)it;
	}

	@Override
	public Optional<TipoInfraccion> findById(Integer idTipoInfraccion) {
		Optional<TipoInfraccion> opt = tipoInfraccionRepo.findById(idTipoInfraccion);
		return opt;
	}
}
