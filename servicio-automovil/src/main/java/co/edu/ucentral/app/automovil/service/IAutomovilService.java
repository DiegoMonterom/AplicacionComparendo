package co.edu.ucentral.app.automovil.service;

import java.util.List;
import java.util.Optional;

import co.edu.ucentral.app.automovil.model.Automovil;

public interface IAutomovilService {

	public List<Automovil> findAll();
	public Optional<Automovil> findbyPlaca(String placa);
	public void insertarAutomovil(Automovil automovil);
	public void actualizarAutomovil(Automovil automovil);
	public boolean validarPropietario(Integer idPropietario);
	public boolean prueba(Integer id);
}
