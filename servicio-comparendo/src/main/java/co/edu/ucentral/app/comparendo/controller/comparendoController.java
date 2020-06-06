package co.edu.ucentral.app.comparendo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.app.comparendo.model.Comparendo;
import co.edu.ucentral.app.comparendo.model.Inmovilizacion;
import co.edu.ucentral.app.comparendo.model.LugarInfraccion;
import co.edu.ucentral.app.comparendo.model.Municipio;
import co.edu.ucentral.app.comparendo.model.TipoInfraccion;
import co.edu.ucentral.app.comparendo.service.IComparendoService;
import co.edu.ucentral.app.comparendo.service.IInmovilizacionService;
import co.edu.ucentral.app.comparendo.service.ILugarInfraccionService;
import co.edu.ucentral.app.comparendo.service.IMunicipioService;
import co.edu.ucentral.app.comparendo.service.ITipoInfraccionService;

@RestController
public class comparendoController {

	@Autowired 
	IComparendoService comparendoService;
	
	@Autowired 
	IInmovilizacionService inmovilizacionService;
	
	@Autowired
	ILugarInfraccionService lugarInfraccionService;
	
	@Autowired
	IMunicipioService municipioService;
	
	@Autowired
	ITipoInfraccionService tipoInfraccionService;
	
	/////////////////////////////METODOS DE COMPARENDO//////////////////////////////////////////////////////////
	
	@GetMapping("/insertarcomparendo")
	public void insertarComparendo(@ModelAttribute Comparendo comparendo) {
		comparendoService.insertarComparendo(comparendo);
	}
	
	@GetMapping("/actualizarcomparendo")
	public void actualizarComparendo(@ModelAttribute Comparendo comparendo) {
		comparendoService.actualizarComparendo(comparendo);
	}
	
	@GetMapping("/buscarcomparendo/{numerocomparendo}")
	public Comparendo findbyNumeroComparendo(@PathVariable String numeroComparendo) {
		Optional<Comparendo> opt = comparendoService.findbyNumeroComparendo(numeroComparendo);
		Comparendo comparendoBus = new Comparendo();
		if(opt.isPresent())
		{
			comparendoBus = opt.get();
		}
		return comparendoBus;
	}
	
	/////////////////////////////METODOS DE INMOVILIZACION//////////////////////////////////////////////////////////
	
	@GetMapping("/insertarinmovilizacion")
	public void insertarInmovilizacion(@ModelAttribute Inmovilizacion inmovilizacion) {
		inmovilizacionService.insertarInmovilizacion(inmovilizacion);
	}
	
	/////////////////////////////METODOS DE LUGAR INFRACCION//////////////////////////////////////////////////////////
	
	@GetMapping("/insertarlugarinfraccion")
	public void insertarLugarInfraccion(@ModelAttribute LugarInfraccion lugarInfraccion) {
		lugarInfraccionService.insertarLugarInfraccion(lugarInfraccion);
	}
	
	/////////////////////////////METODOS DE MUNICIPIO//////////////////////////////////////////////////////////
	
	@GetMapping("/listarmunicipio")
	public List<Municipio> findAllMunicipio() {
			
		return municipioService.findAll();
	}
	
	@GetMapping("/buscarmunicipio/{idMunicipio}")
	public Municipio findById(@ModelAttribute Integer idMunicipio) {
		Optional<Municipio> opt = municipioService.findById(idMunicipio);
		Municipio municipioBus = new Municipio();
		if(opt.isPresent())
		{
			municipioBus = opt.get();
		}
		return municipioBus;
	}
	
	/////////////////////////////METODOS DE TIPOINFRACCION//////////////////////////////////////////////////////////
	
	@GetMapping("/listartipoinfraccion")
	public List<TipoInfraccion> findAllTipoInfraccion() {
			
		return tipoInfraccionService.findAll();
	}
	
	@GetMapping("/buscartipoinfraccion/{idTipoInfraccion}")
	public TipoInfraccion findByIdTipoInfraccion(@PathVariable Integer idTipoInfraccion) {
		Optional<TipoInfraccion> opt = tipoInfraccionService.findById(idTipoInfraccion);
		TipoInfraccion tipoInfraccionBus = new TipoInfraccion();
		if(opt.isPresent())
		{
			tipoInfraccionBus = opt.get();
		}
		return tipoInfraccionBus;
	}
}
