package co.edu.ucentral.app.usuario.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.app.usuario.model.Ciudadano;
import co.edu.ucentral.app.usuario.repository.CiudadanoRepository;



@Service
public class CiudadanoServiceImpl implements ICiudadanoService {

	@Autowired
	private CiudadanoRepository ciudadanoRepo;

	@Override
	public void insertarCiudadano(Ciudadano ciudadano) {
		ciudadanoRepo.save(ciudadano);
	}

	@Override
	public void actualizarCiudadano(Ciudadano ciudadano) {
		
		Optional<Ciudadano> opt = ciudadanoRepo.findbyNumeroDocumentoCiudadano(ciudadano.getNumeroDocumento());
		if(opt.isPresent())
		{
			Ciudadano ciudadanoAct = opt.get();
			ciudadanoAct.setTipoDocumento(ciudadano.getTipoDocumento());
			ciudadanoAct.setNumeroDocumento(ciudadano.getNumeroDocumento());
			ciudadanoAct.setNombre(ciudadano.getNombre());
			ciudadanoAct.setApellido(ciudadano.getApellido());
			ciudadanoAct.setTipoSangre(ciudadano.getTipoSangre());
			ciudadanoAct.setFactorSangre(ciudadano.getFactorSangre());
			ciudadanoAct.setFechaNacimiento(ciudadano.getFechaNacimiento());
			ciudadanoAct.setDireccionResidencia(ciudadano.getDireccionResidencia());
			ciudadanoAct.setEdad(ciudadano.getEdad());
			ciudadanoAct.setTelefono(ciudadano.getTelefono());
			ciudadanoAct.setMunicipio(ciudadano.getMunicipio());
			ciudadanoAct.setEmail(ciudadano.getEmail());
			ciudadanoAct.setEstatura(ciudadano.getEstatura());
			ciudadanoRepo.save(ciudadanoAct);
		}
		
	}

	@Override
	public Optional<Ciudadano> findbyNumeroDocumentoCiudadano(Integer numeroDocumento) {
		Optional<Ciudadano> opt = ciudadanoRepo.findbyNumeroDocumentoCiudadano(numeroDocumento);
		return opt;
	}
	
}
