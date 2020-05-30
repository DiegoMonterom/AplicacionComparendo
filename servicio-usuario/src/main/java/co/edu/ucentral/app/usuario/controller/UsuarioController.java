package co.edu.ucentral.app.usuario.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ucentral.app.usuario.model.Usuario;
import co.edu.ucentral.app.usuario.service.IUsuarioService;

@RestController
public class UsuarioController {

	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Value("${server.port}")
	private Integer port;

	@GetMapping("/listar")
	public List<Usuario> listarUsuario()
	
	{
		
		return  usuarioService.findAll().stream().map(usuario->{usuario.setPort(port); return usuario;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/buscar/{id}")
	public Usuario buscar(@PathVariable Integer id)
	{
	System.out.println("ENTRA AL CONTROLADOR DE USUARIO");
		return  usuarioService.buscar(id);
	}
	
	@GetMapping("/insertar")
	public void insertarUsuario(Usuario usuario)
	{
		
		usuarioService.insertarUsuario(usuario);
		
	}
	
	@GetMapping("/actualizar")
	public void actualizarUsuario(Usuario usuario)
	{
		usuarioService.actualizarUsuario(usuario);
		
	}
	
	


}
