package co.edu.ucentral.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.ucentral.app.model.Comparendo;
import co.edu.ucentral.app.service.IComparendoService;

@Controller
@RequestMapping("/comparendos")
public class ComparendoController {

	
	@Autowired
	private IComparendoService comparendoService;
	
	
	@PostMapping("/insertarComparendo")
	public String registrarComparendo(@ModelAttribute Comparendo comparendo,Model modelo)
	{
		comparendoService.registrarComparendo(comparendo);
		return "comparendos/registrarComparendo";
			
	}
	
	@GetMapping("/historialComparendos/{numeroIdentificacion}")
	public String consultarHistorialComparendos(@PathVariable Integer numeroIdentificacion,Model modelo)
	{
		List<Comparendo> listaComparendo = comparendoService.consultarHistorialComparendos(numeroIdentificacion);
		modelo.addAttribute("historial", listaComparendo);
		return "comparendos/mostrarHistorial";
	}
	
	
}
