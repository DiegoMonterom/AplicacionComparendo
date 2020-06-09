package co.edu.ucentral.app.automovil.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.app.automovil.model.Automovil;
import co.edu.ucentral.app.automovil.model.Usuario;
import co.edu.ucentral.app.automovil.service.IAutomovilService;

@RestController
public class AutomovilController {


	
	@Autowired
	@Qualifier ("serviceFeign")
	private IAutomovilService automovilService;
	
	
	
	@GetMapping("/listar")
	public List<Automovil> listarAutomovil()
	{
		
		return  automovilService.findAll();
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
	
	@PostMapping("/insertar")
	@ResponseStatus(HttpStatus.CREATED)
	public void insertarAutomovil(@ModelAttribute("automovil") Automovil automovil)
	{
		System.out.println("LLEGA AL CONTROLADOR DEL SERVICIO AUTOMOVIL");
		System.out.println(automovil.toString());
		automovilService.insertarAutomovil(automovil);
		
	}
	
	@GetMapping("/actualizar")
	public void actualizarAutomovil(@ModelAttribute Automovil automovil)
	{
		
		automovilService.actualizarAutomovil(automovil);
		
	}
	
	@GetMapping("/prueba/{id}")
	public boolean validarPropietario(@PathVariable("id") Integer id)
	{
		System.out.println("controlador auto");
		return automovilService.validarPropietario(id);
	}
	
	

}
