package co.edu.ucentral.app.usuario.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.ucentral.app.usuario.model.Usuario;



public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}
