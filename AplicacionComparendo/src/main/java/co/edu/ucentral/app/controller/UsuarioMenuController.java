package co.edu.ucentral.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.ucentral.app.model.Automovil;
import co.edu.ucentral.app.model.Ciudadano;
import co.edu.ucentral.app.model.Conductor;
import co.edu.ucentral.app.model.Funcionario;
import co.edu.ucentral.app.model.Policia;
import co.edu.ucentral.app.model.Usuario;

@Controller
@RequestMapping("/menuUsuarios")
public class UsuarioMenuController {

	
	@GetMapping("/insertarCiudadano")
	public String TriggerInsertarCiudadano(Model modelo, @ModelAttribute Ciudadano ciudadano)
	{
		return "usuarios/insertarCiudadano";
	}
	
	
	@GetMapping("/insertarConductor")
	public String TriggerInsertarConductor(Model modelo, @ModelAttribute Conductor conductor)
	{
		return "usuarios/insertarConductor";
	}
	
	@GetMapping("/insertarFuncionario")
	public String TriggerInsertarFuncionario(Model modelo, @ModelAttribute Funcionario funcionario)
	{
		return "usuarios/insertarFuncionario";
	}
	
	
	@GetMapping("/insertarPolicia")
	public String TriggerInsertarPolicia(Model modelo, @ModelAttribute Policia policia)
	{
		return "usuarios/insertarPolicia";
	}
}
