package co.edu.ucentral.app.usuario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.app.usuario.model.Funcionario;
import co.edu.ucentral.app.usuario.repository.FuncionarioRepository;

@Service
public class FuncionarioServiceImpl implements IFuncionarioService{

	@Autowired
	private FuncionarioRepository funcionarioRepo;
	
	@Override
	public void insertarFuncionario(Funcionario funcionario) {
		funcionarioRepo.save(funcionario);
	}

}
