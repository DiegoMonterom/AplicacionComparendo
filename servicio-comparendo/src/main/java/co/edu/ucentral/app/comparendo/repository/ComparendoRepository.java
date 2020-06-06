package co.edu.ucentral.app.comparendo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.ucentral.app.comparendo.model.Comparendo;

@Repository
public interface ComparendoRepository extends CrudRepository<Comparendo, Integer> {

	@Query("SELECT v FROM Comparendo v WHERE v.numeroComparendo=?1")
	Optional<Comparendo> findbyNumeroComparendo(String numeroComparendo);

}
