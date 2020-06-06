package co.edu.ucentral.app.automovil.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.edu.ucentral.app.automovil.cliente.AutomovilClienteRest;
//import co.edu.ucentral.app.automovil.cliente.UsuarioClienteRest;
import co.edu.ucentral.app.automovil.model.Automovil;
import co.edu.ucentral.app.automovil.model.Ciudadano;
import co.edu.ucentral.app.automovil.model.Usuario;
import co.edu.ucentral.app.automovil.repository.AutomovilRepository;



//@Primary
//@Service
@Service ("serviceFeign")
public class AutomovilServiceImpl implements IAutomovilService{

	
	@Autowired
	private AutomovilClienteRest clienteRest;
	
	@Autowired
	private AutomovilRepository autoRepo;
	
	/*
	public boolean validarPropietario(Integer idPropietario) {
		System.out.println("servicio rest" + idPropietario);
		Map<String, String> variables = new HashMap<String, String>();
		variables.put("id", idPropietario.toString());
		System.out.println("map auto" + variables.get("id"));
		Usuario usuario = clienteRest.getForObject("http://localhost:52152/buscar/{id}", Usuario.class, variables); //EL PUERTO DE USUARIOS ESTA DINAMICO, CAMBIAR EL PUERTO AQUI CADA VEZ QUE SE SUBA USUARIOS
		System.out.println("HASTA AQUI LLEGA");
		
		//List<Usuario> x = Optional.ofNullable(usuario).map(Arrays::asList).orElseGet(ArrayList::new);
		if(usuario!=null)
		{
			
			return true;
		}
		
		return false;
	}

*/
	@Override
	public List<Automovil> findAll() {
		// TODO Auto-generated method stub
		
		Iterable<Automovil> it  =  autoRepo.findAll();
		for(Automovil c:it)
		{
			System.out.println("el nombre es:" + c.getPlaca());
			
		}
		
		return (List<Automovil>) it;
	}


	@Override
	public Optional<Automovil> findbyPlaca(String placa) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void insertarAutomovil(Automovil automovil) {
		
		//AutomovilServiceImpl a = new AutomovilServiceImpl();
		//a.validarPropietario(103);
		
		autoRepo.save(automovil);
	}


	@Override
	public void actualizarAutomovil(Automovil automovil) {
		// TODO Auto-generated method stub
		
	}
	/*
	public boolean prueba(Integer id)
	{
		AutomovilServiceImpl a = new AutomovilServiceImpl();
		
		return a.validarPropietario(id);
		
	}
*/

	@Override
	public boolean validarPropietario(Integer idPropietario) {
		
		System.out.println("LLEGA AL SERVICIO FEIGN" + idPropietario);
		
		Ciudadano usuario = clienteRest.buscar(idPropietario);
		
		System.out.println(usuario.getNombre());
		
		if(usuario.getCedula()!=null)
		{
			
			return true;
		}
		
		return false;
	}



	
	

}
