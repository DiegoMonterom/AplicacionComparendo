package co.edu.ucentral.app.usuario.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.ucentral.app.usuario.model.Conductor;

@Repository
public interface ConductorRepository extends CrudRepository<Conductor, Integer>{

	Optional<Conductor> findbyNumeroDocumentoConductor(Integer numeroDocumento);

}
