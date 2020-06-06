package co.edu.ucentral.app.automovil.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import co.edu.ucentral.app.automovil.model.Ciudadano;

@FeignClient(name="servicio-usuario")
public interface AutomovilClienteRest {

	@GetMapping("/buscarciudadano/{numeroDocumento}")
	public Ciudadano buscar(@PathVariable Integer numeroDocumento);
	
}
