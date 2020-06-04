package co.edu.ucentral.app.comparendo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.app.comparendo.model.Municipio;
import co.edu.ucentral.app.comparendo.repository.MunicipioRepository;

@Service
public class MunicipioServiceImpl implements IMunicipioService{

	@Autowired
	private MunicipioRepository municipioRepo;
	
	@Override
	public List<Municipio> findAll() {
		
		Iterable<Municipio> it = municipioRepo.findAll();		
		return (List<Municipio>)it;
	}

	@Override
	public Optional<Municipio> findById(Integer idMunicipio) {
		Optional<Municipio> opt = municipioRepo.findById(idMunicipio);
		return opt;
	}

}
