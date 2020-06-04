package co.edu.ucentral.app.comparendo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.app.comparendo.model.LugarInfraccion;
import co.edu.ucentral.app.comparendo.repository.LugarInfraccionRepository;

@Service
public class LugarInfraccionServiceImpl implements ILugarInfraccionService{

	@Autowired
	private LugarInfraccionRepository lugarInfraccionRepo;
	
	@Override
	public void insertarLugarInfraccion(LugarInfraccion lugarInfraccion) {
		lugarInfraccionRepo.save(lugarInfraccion);
	}

}
