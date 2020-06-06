package co.edu.ucentral.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.app.model.Automovil;
import co.edu.ucentral.app.service.IComparendoService;

@RestController
@RequestMapping("/automoviles")
public class automovilController {

	
	@Autowired
	public IComparendoService automovilService;
	
	
	@PostMapping("/insertarAuto")
	public String insertarAutomovil(@ModelAttribute Automovil automovil) 
	{
		
		System.out.println("LLEGA AL CONTROLLER DE AUTO");
		automovilService.registrarAutomovil(automovil);
		
		
		return "automoviles/insertarAuto";
	}
	
	
	@GetMapping("/consultarAuto/{placa}")
	public String consultarAutomovil(@PathVariable String placa, Model modelo) {
		
		System.out.println("LLEGA AL CONTROLLER DE AUTO" + placa);
		modelo.addAttribute("auto", automovilService.consultarAutomovil(placa));
		return "automoviles/mostrarAuto";
	}
	
	
	@PostMapping("/modificarAuto")
	public String modificarAutomovil(@ModelAttribute Automovil automovil,Model modelo)
	{
		
		automovilService.modificarAutomovil(automovil);
		modelo.addAttribute("auto", automovilService.consultarAutomovil(automovil.getPlaca()));
		return "automoviles/mostrarAuto";
	}
	
	
}
