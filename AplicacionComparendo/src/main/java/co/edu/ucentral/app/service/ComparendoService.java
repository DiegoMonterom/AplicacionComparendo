package co.edu.ucentral.app.service;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import co.edu.ucentral.app.clienteFeign.clienteFeign;
import co.edu.ucentral.app.model.Automovil;
import co.edu.ucentral.app.model.Ciudadano;
import co.edu.ucentral.app.model.Comparendo;
import co.edu.ucentral.app.model.Conductor;
import co.edu.ucentral.app.model.Funcionario;
import co.edu.ucentral.app.model.Policia;
import co.edu.ucentral.app.model.Usuario;

@Service("serviceFeign")
public class ComparendoService implements IComparendoService{

	
	//@Autowired
	//private RestTemplate restTemplate;

	@Autowired
	private clienteFeign clienteFeign;
	
	
	@Override
	public void login(String username, String password) {
		
		
		//TODO: CONECTAR CON EL SERVICIO USUARIO
		
	}

	@Override
	public void registrarAutomovil(Automovil automovil) {
		System.out.println("LLEGA AL SERVICE REGISTRAR AUTO");
		// TODO: CONECTAR CON SERVICIO AUTOMOVIL
		System.out.println(automovil.toString());
		
		clienteFeign.insertar(automovil);
		
		//restTemplate.postForObject("http://servicio-automovil/insertar", automovil, Automovil.class);
		
	}

	@Override
	public void registrarUsuario(Usuario usuario) {
		// TODO: CONECTAR CON SERVICIO USUARIO
		
	}

	@Override
	public void registrarComparendo(Comparendo comparendo) {
		// TODO: CONECTAR CON SERVICIO COMPARENDO
		
	}

	
	@Override
	public void registrarCiudadano(Ciudadano usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarConductor(Conductor usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarFuncionario(Funcionario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registrarPolicia(Policia usuario) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void actualizarAutomovil(Automovil automovil) {
		// TODO: CONECTAR CON SERVICIO AUTOMOVIL
		
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		// TODO: CONECTAR CON SERVICIO USUARIO
		
	}

	
	public Automovil consultarAutomovil(String placa) {
		// TODO: CONECTAR CON SERVICIO AUTOMOVIL
		//new 
		System.out.println("LLEGA AL SERVICIO");
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		
		Automovil auto = null;
		
		
				
				
		
					try {
						auto = new Automovil("f", 123, 456, "prueba", "prueba", 1,"prueba", 789, "prueba", "prueba", "prueba", "prueba",formato.parse("03-06-2020" ), 4);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
		
		
		return auto; 
	}

	@Override
	public Usuario consultarUsuario(Integer numeroDocumento) {
		// TODO: CONECTAR CON SERVICIO USUARIO
		return null;
	}

	@Override
	public List<Comparendo> consultarHistorialComparendos(Integer numeroDocumento) {
		// TODO: CONECTAR CON SERVICIO COMPARENDO
		return null;
	}

	@Override
	public Comparendo consultarComparendoIndividual(String numeroComparendo) {
		// TODO: CONECTAR CON SERVICIO COMPARENDO
		return null;
	}

	@Override
	public Automovil modificarAutomovil(Automovil automovil) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario modificarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
