package co.edu.ucentral.app.usuario.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.app.usuario.model.Ciudadano;
import co.edu.ucentral.app.usuario.model.Conductor;
import co.edu.ucentral.app.usuario.model.Funcionario;
import co.edu.ucentral.app.usuario.model.Policia;
import co.edu.ucentral.app.usuario.service.ICiudadanoService;
import co.edu.ucentral.app.usuario.service.IConductorService;
import co.edu.ucentral.app.usuario.service.IFuncionarioService;
import co.edu.ucentral.app.usuario.service.IPoliciaService;

@RestController
public class UsuarioController {

	
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IConductorService conductorService;
	
	@Autowired
	private IFuncionarioService funcionarioService;
	
	@Autowired
	private IPoliciaService policiaService;

	/////////////////////////////METODOS DE CIUDADANO//////////////////////////////////////////////////////////
	
	@GetMapping("/insertarciudadano")
	public void insertarCiudadano(@ModelAttribute Ciudadano ciudadano)
	{		
		ciudadanoService.insertarCiudadano(ciudadano);
	}
	
	@GetMapping("/actualizarciudadano")
	public void actualizarCiudadano(@ModelAttribute Ciudadano ciudadano)
	{
		ciudadanoService.actualizarCiudadano(ciudadano);
		
	}
	
	@GetMapping("/buscarciudadano/{numeroDocumento}")
	public Ciudadano findbyNumeroDocumentoCiudadano(@PathVariable Integer numeroDocumento)
	{
		Optional<Ciudadano> opt = ciudadanoService.findbyNumeroDocumentoCiudadano(numeroDocumento);
		Ciudadano ciudadanoBus = new Ciudadano();
		if(opt.isPresent())
		{
			ciudadanoBus = opt.get();
		}
		return ciudadanoBus;		
	}
	
	/////////////////////////////METODOS DE CONDUCTOR//////////////////////////////////////////////////////////
	
	@GetMapping("/insertarconductor")
	public void insertarConductor(@ModelAttribute Conductor conductor)
	{
		
		conductorService.insertarConductor(conductor);
		
	}
	
	@GetMapping("/actualizarconductor")
	public void actualizarConductor(@ModelAttribute Conductor conductor)
	{
		conductorService.actualizarConductor(conductor);
		
	}
	
	@GetMapping("/buscarconductor/{numeroDocumento}")
	public Conductor findbyNumeroDocumentoConductor(@PathVariable Integer numeroDocumento)
	{
		Optional<Conductor> opt = conductorService.findbyNumeroDocumentoConductor(numeroDocumento);
		Conductor conductorBus = new Conductor();
		if(opt.isPresent())
		{
			conductorBus = opt.get();
		}
		return conductorBus;		
	}
	
	/////////////////////////////METODOS DE FUNCIONARIO//////////////////////////////////////////////////////////
	
	@GetMapping("/insertarfuncionario")
	public void insertarFuncionario(@ModelAttribute Funcionario funcionario)
	{
		
		funcionarioService.insertarFuncionario(funcionario);
		
	}
	
	/////////////////////////////METODOS DE POLICIA//////////////////////////////////////////////////////////
	
	@GetMapping("/insertarpolicia")
	public void insertarPolicia(@ModelAttribute Policia policia)
	{
		
		policiaService.insertarPolicia(policia);
		
	}
	
	@GetMapping("/actualizarpolicia")
	public void actualizarPolicia(@ModelAttribute Policia policia)
	{
		policiaService.actualizarPolicia(policia);
		
	}
	
	@GetMapping("/buscarpolicia/{numeroDocumento}")
	public Policia findbyNumeroDocumentoPolicia(@PathVariable Integer numeroDocumento)
	{
		Optional<Policia> opt = policiaService.findbyNumeroDocumentoPolicia(numeroDocumento);
		Policia policiaBus = new Policia();
		if(opt.isPresent())
		{
			policiaBus = opt.get();
		}
		return policiaBus;		
	}
}
