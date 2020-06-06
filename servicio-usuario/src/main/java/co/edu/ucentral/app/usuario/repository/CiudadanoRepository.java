package co.edu.ucentral.app.usuario.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.ucentral.app.usuario.model.Ciudadano;

@Repository
public interface CiudadanoRepository extends CrudRepository<Ciudadano, Integer> {

	@Query("SELECT v FROM Ciudadano v WHERE v.cedula=?1") 
	Optional<Ciudadano> findbyNumeroDocumentoCiudadano(Integer numeroDocumento);

}
