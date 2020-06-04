package co.edu.ucentral.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.ucentral.app.model.Usuario;
import co.edu.ucentral.app.service.IComparendoService;


@Controller
@RequestMapping("/usuarios")
public class usuarioController {

	
	@Autowired
	private IComparendoService usuarioService;
	
	@PostMapping("/insertarUsuario")
	public String registrarUsuario(@ModelAttribute Usuario usuario,Model modelo)
	{
		usuarioService.registrarUsuario(usuario);
		
		return "usuarios/registrarUsuario";
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
