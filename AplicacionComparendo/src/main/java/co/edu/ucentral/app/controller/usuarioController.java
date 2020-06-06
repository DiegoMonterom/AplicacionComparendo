package co.edu.ucentral.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.ucentral.app.model.Ciudadano;
import co.edu.ucentral.app.model.Conductor;
import co.edu.ucentral.app.model.Funcionario;
import co.edu.ucentral.app.model.Policia;
import co.edu.ucentral.app.model.Usuario;
import co.edu.ucentral.app.service.IComparendoService;


@Controller
@RequestMapping("/usuarios")
public class usuarioController {

	
	@Autowired
	private IComparendoService usuarioService;
	
	@PostMapping("/insertarCiudadano")
	public String registrarCiudadano(@ModelAttribute Ciudadano usuario,Model modelo)
	{
		usuarioService.registrarCiudadano(usuario);
		
		return "usuarios/insertarCiudadano";
	}
	
	@PostMapping("/insertarConductor")
	public String registrarConductor(@ModelAttribute Conductor usuario,Model modelo)
	{
		usuarioService.registrarConductor(usuario);
		
		return "usuarios/insertarConductor";
	}
	
	
	@PostMapping("/insertarFuncionario")
	public String registrarFuncionario(@ModelAttribute Funcionario usuario,Model modelo)
	{
		usuarioService.registrarFuncionario(usuario);
		
		return "usuarios/insertarFuncionario";
	}
	
	@PostMapping("/insertarPolicia")
	public String registrarPolicia(@ModelAttribute Policia usuario,Model modelo)
	{
		usuarioService.registrarPolicia(usuario);
		
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
}
