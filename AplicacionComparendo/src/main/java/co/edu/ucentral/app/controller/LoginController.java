package co.edu.ucentral.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.app.model.Login;
import co.edu.ucentral.app.service.IComparendoService;



@Controller
public class LoginController {
	
	
	@Autowired
	private IComparendoService comparendoService;

	@GetMapping("/")
	public String inicio(Model modelo, @ModelAttribute Login funcionario){

		modelo.addAttribute("funcionario", funcionario);
		return "inicio";
	}

	
	@PostMapping("/login")
	//@ResponseStatus(HttpStatus.CONTINUE)
	public String loginFuncionario(@ModelAttribute Login funcionario){
		
	
		comparendoService.login(funcionario.getUsuario(), funcionario.getContra());
		
		return "menuPrincipal/menuPrincipal";
	}
}

