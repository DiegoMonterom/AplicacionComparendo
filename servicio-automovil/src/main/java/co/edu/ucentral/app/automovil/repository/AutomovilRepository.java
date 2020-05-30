package co.edu.ucentral.app.automovil.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.ucentral.app.automovil.model.Automovil;


@Repository
public interface AutomovilRepository extends CrudRepository<Automovil, String> {

	@Query ("SELECT v FROM Automovil v WHERE v.placa=?1")
	public Optional<Automovil> findbyPlaca(String placa); 
	
}
