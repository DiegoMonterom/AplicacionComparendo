package co.edu.ucentral.app.clienteFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import co.edu.ucentral.app.model.Automovil;

@FeignClient(name="servicio-automovil")
public interface clienteFeign {

	
	@PostMapping("/insertar")
	public Automovil insertar(@ModelAttribute("automovil") Automovil automovil);
	
}
