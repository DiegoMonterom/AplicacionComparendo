package co.edu.ucentral.app.usuario.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.app.usuario.model.Policia;
import co.edu.ucentral.app.usuario.repository.PoliciaRepository;

@Service
public class PoliciaServiceImpl implements IPoliciaService{

	@Autowired
	private PoliciaRepository policiaRepo;
	
	@Override
	public Optional<Policia> findbyNumeroDocumentoPolicia(Integer numeroDocumento) {
		Optional<Policia> opt = policiaRepo.findbyNumeroDocumentoPolicia(numeroDocumento);
		return opt;
	}

	@Override
	public void insertarPolicia(Policia policia) {
		policiaRepo.save(policia);
	}

	@Override
	public void actualizarPolicia(Policia policia) {
		Optional<Policia> opt = policiaRepo.findbyNumeroDocumentoPolicia(policia.getNumeroDocumentoPolicia());
		if(opt.isPresent())
		{
			Policia policiaAct = opt.get();
			policiaAct.setNumeroDocumentoPolicia(policia.getNumeroDocumentoPolicia());
			policiaAct.setNombrePolicia(policia.getNombrePolicia());
			policiaAct.setApellidoPolicia(policia.getApellidoPolicia());
			policiaAct.setNumeroPolicia(policia.getNumeroPolicia());
			policiaAct.setPlacaPolicia(policia.getPlacaPolicia());
			policiaAct.setEntidadPolicia(policia.getEntidadPolicia());
		}
	}

}
