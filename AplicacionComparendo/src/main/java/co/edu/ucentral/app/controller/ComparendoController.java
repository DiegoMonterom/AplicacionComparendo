package co.edu.ucentral.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.edu.ucentral.app.model.Comparendo;
import co.edu.ucentral.app.service.IComparendoService;

@Controller
@RequestMapping("/comparendos")
public class ComparendoController {

	
	@Autowired
	private IComparendoService comparendoService;
	
	
	@PostMapping("/insertarComparendo")
	public String registrarComparendo(@ModelAttribute Comparendo comparendo,Model modelo, BindingResult result, RedirectAttributes atributes)
	{
		for(ObjectError error: result.getAllErrors()) {
			System.out.println(error.getDefaultMessage());
		}
		
		if(result.hasErrors()) {
			return "comparendos/registrarComparendo";
		}
		
		comparendoService.registrarComparendo(comparendo);
		
		atributes.addFlashAttribute("mensaje", "Comparendo Guardado con exito");
		
		
		
		return "comparendos/registrarComparendo";
			
	}
	
	@GetMapping("/historialComparendos/{numeroIdentificacion}")
	public String consultarHistorialComparendos(@PathVariable Integer numeroIdentificacion,Model modelo)
	{
		List<Comparendo> listaComparendo = comparendoService.consultarHistorialComparendos(numeroIdentificacion);
		modelo.addAttribute("historial", listaComparendo);
		return "comparendos/mostrarHistorial";
	}
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	       SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yy");
	       sdf.setLenient(true);
	       binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	       
	  
	}
}
