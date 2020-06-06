package co.edu.ucentral.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.ucentral.app.model.Automovil;
import co.edu.ucentral.app.model.Comparendo;
import co.edu.ucentral.app.model.Login;
import co.edu.ucentral.app.model.Usuario;

@Controller
@RequestMapping("/menuPrincipal")
public class menuController {

	
	@GetMapping("/menuP")
	public String menuPrincipal()
	{
				
		return "menuPrincipal/menuPrincipal";
	}
	
	@GetMapping("/insertarAuto")
	public String TriggerInsertarAutomovil(Model modelo, @ModelAttribute Automovil automovil)
	{
		return "automoviles/insertarAuto";
	}
	
	@GetMapping("/consultarAuto")
	public String TriggerConsultarAutomovil(Model modelo, @ModelAttribute Automovil automovil)
	{
		return "automoviles/consultarAuto";
	}
	
	@GetMapping("/modificarAuto")
	public String TriggerModificarAutomovil(Model modelo, @ModelAttribute Automovil automovil)
	{
		return "automoviles/modificarAuto";
	}
	
	
	@GetMapping("/insertarUsuario")
	public String TriggerInsertarUsuario(Model modelo, @ModelAttribute Usuario usuario)
	{
		return "usuarios/menuUsuarios";
	}
	
	@GetMapping("/consultarUsuario")
	public String TriggerConsultarUsuario(Model modelo, @ModelAttribute Usuario usuario)
	{
		return "usuarios/consultarUsuario";
	}
	
	@GetMapping("/modificarUsuario")
	public String TriggerModificarUsuario(Model modelo, @ModelAttribute Usuario usuario)
	{
		return "usuarios/modificarUsuario";
	}
	
	
	@GetMapping("/insertarComparendo")
	public String TriggerInsertarComparendo(Model modelo, @ModelAttribute Comparendo comparendo)
	{
		return "comparendos/insertarComparendo";
	}
	
	@GetMapping("/consultarHistorial")
	public String TriggerConsultarComparendo(Model modelo, @ModelAttribute Usuario usuario)
	{
		return "comparendos/historialComparendos";
	}
	
	
	
	
}
