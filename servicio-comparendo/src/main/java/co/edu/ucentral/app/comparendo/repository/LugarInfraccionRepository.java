package co.edu.ucentral.app.comparendo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.ucentral.app.comparendo.model.LugarInfraccion;

@Repository
public interface LugarInfraccionRepository extends CrudRepository<LugarInfraccion, Integer> {

}
