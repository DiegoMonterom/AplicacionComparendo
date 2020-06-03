package co.edu.ucentral.app.comparendo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.ucentral.app.comparendo.model.Municipio;

@Repository
public interface MunicipioRepository extends CrudRepository<Municipio, Integer> {

}
