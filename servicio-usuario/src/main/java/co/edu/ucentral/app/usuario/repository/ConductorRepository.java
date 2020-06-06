package co.edu.ucentral.app.usuario.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.ucentral.app.usuario.model.Conductor;

@Repository
public interface ConductorRepository extends CrudRepository<Conductor, Integer>{

	@Query("SELECT e FROM Conductor e WHERE e.numeroLicencia=?1") 
	Optional<Conductor> findbyNumeroDocumentoConductor(Integer numeroDocumento);

}
