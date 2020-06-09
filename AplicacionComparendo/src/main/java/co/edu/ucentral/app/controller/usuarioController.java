package co.edu.ucentral.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.edu.ucentral.app.model.Ciudadano;
import co.edu.ucentral.app.model.Conductor;
import co.edu.ucentral.app.model.Funcionario;
import co.edu.ucentral.app.model.Policia;
import co.edu.ucentral.app.model.Usuario;
import co.edu.ucentral.app.service.IComparendoService;


@RestController
@RequestMapping("/usuarios")
public class usuarioController {

	
	@Autowired
	private IComparendoService usuarioService;
	
	@PostMapping("/insertarCiudadano")
	public String registrarCiudadano(@ModelAttribute Ciudadano usuario,Model modelo,BindingResult result, RedirectAttributes atributes)
	{
		
		for(ObjectError error: result.getAllErrors()) {
			System.out.println(error.getDefaultMessage());
		}
		
		if(result.hasErrors()) {
			return "usuarios/insertarCiudadano";
		}
		
		usuarioService.registrarCiudadano(usuario);
		
		atributes.addFlashAttribute("mensaje", "Ciudadano Guardado con exito");
		

		return "usuarios/insertarCiudadano";
	}
	
	@PostMapping("/insertarConductor")
	public String registrarConductor(@ModelAttribute Conductor usuario,Model modelo,BindingResult result, RedirectAttributes atributes)
	{
		
		for(ObjectError error: result.getAllErrors()) {
			System.out.println(error.getDefaultMessage());
		}
		
		if(result.hasErrors()) {
			return "usuarios/insertarConductor";
		}
		
		usuarioService.registrarConductor(usuario);
		
		atributes.addFlashAttribute("mensaje", "Conductor Guardado con exito");
		

		return "usuarios/insertarConductor";
	}
	
	
	@PostMapping("/insertarFuncionario")
	public String registrarFuncionario(@ModelAttribute Funcionario usuario,Model modelo,BindingResult result, RedirectAttributes atributes)
	{
		
		for(ObjectError error: result.getAllErrors()) {
			System.out.println(error.getDefaultMessage());
		}
		
		if(result.hasErrors()) {
			return "usuarios/insertarFuncionario";
		}
		
		
		
		usuarioService.registrarFuncionario(usuario);
		
		atributes.addFlashAttribute("mensaje", "Funcionario Guardado con exito");
		
		return "usuarios/insertarFuncionario";
	}
	
	@PostMapping("/insertarPolicia")
	public String registrarPolicia(@ModelAttribute Policia usuario,Model modelo,BindingResult result, RedirectAttributes atributes)
	{
		for(ObjectError error: result.getAllErrors()) {
			System.out.println(error.getDefaultMessage());
		}
		
		if(result.hasErrors()) {
			return "usuarios/insertarPolicia";
		}
		
		
		
		usuarioService.registrarPolicia(usuario);
		
		atributes.addFlashAttribute("mensaje", "Funcionario Guardado con exito");
		
		return "usuarios/insertarPolicia";
	}
	
	
	@GetMapping("/consultarUsuario/{numeroIdentificacion}")
	public String consultarUsuario(@PathVariable Integer numeroIdentificacion,Model modelo)
	{
		modelo.addAttribute("usuario", usuarioService.consultarUsuario(numeroIdentificacion));
		return "usuarios/mostrarUsuario";
	}
	
	
	@GetMapping("/modificarUsuario")
	public String modificarUsuario(@ModelAttribute Usuario usuario,Model modelo)
	{
		usuarioService.modificarUsuario(usuario);
		modelo.addAttribute("usuario", usuarioService.consultarUsuario(usuario.getNumerodocumento()));
		return "usuarios/mostrarUsuario";
	}
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	       SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy");
	       sdf.setLenient(true);
	       binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
}
