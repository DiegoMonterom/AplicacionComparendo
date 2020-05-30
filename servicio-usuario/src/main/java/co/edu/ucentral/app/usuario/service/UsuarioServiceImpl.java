package co.edu.ucentral.app.usuario.service;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.ucentral.app.usuario.model.Usuario;
import co.edu.ucentral.app.usuario.repository.UsuarioRepository;



@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepo;

	@Override
	@Transactional (readOnly = true)
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional (readOnly = true)
	public Usuario buscar(Integer id) {
		
	
		return usuarioRepo.findById(id).orElse(null);
	}

	@Override
	public void insertarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
	
}
