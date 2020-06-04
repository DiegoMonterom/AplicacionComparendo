package co.edu.ucentral.app.automovil.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.app.automovil.model.Automovil;
import co.edu.ucentral.app.automovil.model.Usuario;
import co.edu.ucentral.app.automovil.service.IAutomovilService;

@RestController
public class AutomovilController {


	
	@Autowired
	@Qualifier ("serviceFeign")
	private IAutomovilService automovilService;
	
	
	@Value("${server.port}")
	private Integer port;
	
	
	@GetMapping("/listar")
	public List<Automovil> listarAutomovil()
	{
		
		return  automovilService.findAll().stream().map(automovil->{automovil.setPort(port); return automovil;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/buscar/{placa}")
	public Automovil buscarAutomovil(@PathVariable String placa)
	{
		Optional<Automovil> opt = automovilService.findbyPlaca(placa);
		Automovil auto1 = new Automovil();
		if(opt.isPresent())
		{
			auto1 = opt.get();
		}
		return auto1;
	}
	
	@GetMapping("/insertar")
	public void insertarAutomovil(Automovil automovil)
	{
		
		automovilService.insertarAutomovil(automovil);
		
	}
	
	@GetMapping("/actualizar")
	public void actualizarAutomovil(Automovil automovil)
	{
		automovilService.actualizarAutomovil(automovil);
		
	}
	
	@GetMapping("/prueba/{id}")
	public boolean prueba(@PathVariable("id") Integer id)
	{
		System.out.println("controlador auto");
<<<<<<< HEAD
		return automovilService.prueba();
	}	
=======
		return automovilService.prueba(id);
	}
	
	
>>>>>>> branch 'master' of https://github.com/DiegoMonterom/AplicacionComparendo.git

}
