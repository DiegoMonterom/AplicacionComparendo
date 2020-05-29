package co.edu.ucentral.app.comparendo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.app.comparendo.repository.ComparendoRepository;

@Service
public class ComparendoServiceImpl {

	
	
	@Autowired
	private ComparendoRepository comparendoRepo;
	
}
