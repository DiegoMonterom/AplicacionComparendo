package co.edu.ucentral.app.comparendo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.ucentral.app.comparendo.model.TipoInfraccion;

@Repository
public interface TipoInfraccionRepository extends CrudRepository<TipoInfraccion, Integer> {

}
