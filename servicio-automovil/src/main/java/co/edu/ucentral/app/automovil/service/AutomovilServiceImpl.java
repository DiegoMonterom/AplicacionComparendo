package co.edu.ucentral.app.automovil.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import co.edu.ucentral.app.automovil.model.Automovil;
import co.edu.ucentral.app.automovil.repository.AutomovilRepository;

//@Service
public class AutomovilServiceImpl implements IAutomovilService{

	
	
	//private ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	//private AutomovilRepository repo = context.getBean("automovilRepository", AutomovilRepository.class);
	
	
	@Autowired
	private AutomovilRepository automovilRepo;


	//private AutomovilServiceFeign clienteRest;
	
	@Override
	public List<Automovil> findAll() {
		
		Iterable<Automovil> it = automovilRepo.findAll();
		//context.close();
		return (List<Automovil>) it;
	}

	@Override
	public Optional<Automovil> findbyPlaca(String placa) {
		
		Optional<Automovil> opt = automovilRepo.findbyPlaca(placa);
		//context.close();
		return opt;
		
	}

	
	@Override
	public void insertarAutomovil(Automovil automovil) {
		
		automovilRepo.save(automovil);
		//context.close();
	}

	
	@Override
	public void actualizarAutomovil(Automovil automovil) {
		
		Optional<Automovil> opt = automovilRepo.findbyPlaca(automovil.getPlaca());
		if(opt.isPresent())
		{
			Automovil auto1 = opt.get();
			auto1.setColor(automovil.getColor());
			auto1.setIdPropietario(automovil.getIdPropietario());
			auto1.setTipoCombustible(automovil.getTipoCombustible());
			automovilRepo.save(auto1);
		}
		
		//context.close();
		
	
	}

	@Override
	public boolean validarPropietario(Integer idPropietario) {
		
		
		//clienteRest.validarPropietario(idPropietario);
		
		
		return false;
	}

	@Override
	public boolean prueba() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
}
