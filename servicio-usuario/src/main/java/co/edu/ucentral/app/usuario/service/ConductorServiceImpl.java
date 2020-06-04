package co.edu.ucentral.app.usuario.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.app.usuario.model.Conductor;
import co.edu.ucentral.app.usuario.repository.ConductorRepository;

@Service
public class ConductorServiceImpl implements IConductorService{

	@Autowired
	private ConductorRepository conductorRepo;
	
	@Override
	public Optional<Conductor> findbyNumeroDocumentoConductor(Integer numeroDocumento) {
		Optional<Conductor> opt = conductorRepo.findbyNumeroDocumentoConductor(numeroDocumento);
		return opt;
	}

	@Override
	public void insertarConductor(Conductor conductor) {
		conductorRepo.save(conductor);
		
	}

	@Override
	public void actualizarConductor(Conductor conductor) {
		Optional<Conductor> opt = conductorRepo.findbyNumeroDocumentoConductor(conductor.getNumeroDocumento());
		if(opt.isPresent())
		{
			Conductor conductorAct = opt.get();
			conductorAct.setTipoDocumento(conductor.getTipoDocumento());
			conductorAct.setNumeroDocumento(conductor.getNumeroDocumento());
			conductorAct.setNombre(conductor.getNombre());
			conductorAct.setApellido(conductor.getApellido());
			conductorAct.setTipoSangre(conductor.getTipoSangre());
			conductorAct.setFactorSangre(conductor.getFactorSangre());
			conductorAct.setFechaNacimiento(conductor.getFechaNacimiento());
			conductorAct.setDireccionResidencia(conductor.getDireccionResidencia());
			conductorAct.setEdad(conductor.getEdad());
			conductorAct.setTelefono(conductor.getTelefono());
			conductorAct.setMunicipio(conductor.getMunicipio());
			conductorAct.setEmail(conductor.getEmail());
			conductorAct.setEstatura(conductor.getEstatura());
			conductorAct.setNumeroLicencia(conductor.getNumeroLicencia());
			conductorAct.setFechaVencimiento(conductor.getFechaVencimiento());
			conductorAct.setCategoria(conductor.getCategoria());
			conductorRepo.save(conductorAct);
		}
	}

}
