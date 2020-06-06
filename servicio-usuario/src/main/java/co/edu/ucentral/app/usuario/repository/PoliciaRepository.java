package co.edu.ucentral.app.usuario.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.ucentral.app.usuario.model.Policia;

@Repository
public interface PoliciaRepository extends CrudRepository<Policia, Integer> {

	@Query("SELECT a FROM Policia a WHERE a.cedula=?1") 
	Optional<Policia> findbyNumeroDocumentoPolicia(Integer numeroDocumento);

	
}

