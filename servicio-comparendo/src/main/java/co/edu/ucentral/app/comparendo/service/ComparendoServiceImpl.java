package co.edu.ucentral.app.comparendo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.app.comparendo.model.Comparendo;
import co.edu.ucentral.app.comparendo.repository.ComparendoRepository;

@Service
public class ComparendoServiceImpl implements IComparendoService{

	@Autowired
	private ComparendoRepository comparendoRepo;

	@Override
	public Optional<Comparendo> findbyNumeroComparendo(String numeroComparendo) {
		Optional<Comparendo> opt = comparendoRepo.findbyNumeroComparendo(numeroComparendo);
		return opt;
	}

	@Override
	public void insertarComparendo(Comparendo comparendo) {
		comparendoRepo.save(comparendo);
		
	}

	@Override
	public void actualizarComparendo(Comparendo comparendo) {
		Optional<Comparendo> opt = comparendoRepo.findbyNumeroComparendo(comparendo.getNumeroComparendo());
		if(opt.isPresent())
		{
			Comparendo comparendoAct = opt.get();
			comparendoAct.setEstado(comparendo.getEstado());
			comparendoRepo.save(comparendoAct);
		}
	}
	
}
