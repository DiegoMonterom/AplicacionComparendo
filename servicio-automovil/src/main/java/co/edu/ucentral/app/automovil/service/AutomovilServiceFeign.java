package co.edu.ucentral.app.automovil.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//import co.edu.ucentral.app.automovil.cliente.UsuarioClienteRest;
import co.edu.ucentral.app.automovil.model.Automovil;
import co.edu.ucentral.app.automovil.model.Usuario;


//@Service ("serviceFeign")
//@Primary
@Service
public class AutomovilServiceFeign implements IAutomovilService{

	
	@Autowired
	private RestTemplate clienteRest;
	
	
	public boolean validarPropietario(Integer idPropietario) {
		System.out.println("servicio rest" + idPropietario);
		Map<String, String> variables = new HashMap<String, String>();
		variables.put("id", idPropietario.toString());
		System.out.println("map auto" + variables.get("id"));
		Usuario usuario = clienteRest.getForObject("http://localhost:58146/buscar/{id}", Usuario.class, variables);
		System.out.println("HASTA AQUI LLEGA");
		
		
		if(usuario!=null)
		{
			
			return true;
		}
		
		return false;
	}


	@Override
	public List<Automovil> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<Automovil> findbyPlaca(String placa) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void insertarAutomovil(Automovil automovil) {
		
		AutomovilServiceFeign a = new AutomovilServiceFeign();
		a.validarPropietario(103);
		
	}


	@Override
	public void actualizarAutomovil(Automovil automovil) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean prueba()
	{
		AutomovilServiceFeign a = new AutomovilServiceFeign();
		
		return a.validarPropietario(103);
		
	}
	
	

}
