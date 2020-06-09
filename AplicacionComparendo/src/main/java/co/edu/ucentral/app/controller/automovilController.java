package co.edu.ucentral.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.edu.ucentral.app.model.Automovil;
import co.edu.ucentral.app.service.IComparendoService;

@RestController
@RequestMapping("/automoviles")
public class automovilController {

	
	@Autowired
	@Qualifier ("serviceFeign")
	public IComparendoService automovilService;
	
	
	@PostMapping("/insertarAuto")
	public String insertarAutomovil(@ModelAttribute("automovil") Automovil automovil,BindingResult result, RedirectAttributes atributes) 
	{
		
		System.out.println("LLEGA AL CONTROLLER DE AUTO");
		for(ObjectError error: result.getAllErrors()) {
			System.out.println(error.getDefaultMessage());
		}
		
		if(result.hasErrors()) {
			return "automoviles/insertarAuto";
		}
		
		automovilService.registrarAutomovil(automovil);
		
		atributes.addFlashAttribute("mensaje", "Automovil Guardado con exito");
		
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
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	       SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy");
	       sdf.setLenient(true);
	       binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	
}
