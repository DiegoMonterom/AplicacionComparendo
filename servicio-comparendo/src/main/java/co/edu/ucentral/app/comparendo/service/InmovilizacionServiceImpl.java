package co.edu.ucentral.app.comparendo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.app.comparendo.model.Inmovilizacion;
import co.edu.ucentral.app.comparendo.repository.InmovilizacionRepository;

@Service
public class InmovilizacionServiceImpl implements IInmovilizacionService{

	@Autowired
	private InmovilizacionRepository inmovilizacionRepo;
	
	@Override
	public void insertarInmovilizacion(Inmovilizacion inmovilizacion) {
		inmovilizacionRepo.save(inmovilizacion);
	}

}
