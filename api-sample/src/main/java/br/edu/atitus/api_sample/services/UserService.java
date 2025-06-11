package br.edu.atitus.api_sample.services;

import org.springframework.stereotype.Service;

import br.edu.atitus.api_sample.entities.UserEntity;
import br.edu.atitus.api_sample.repositories.UserRepository;

@Service
public class UserService {
	
	private final UserRepository repository;
	
	public UserService(UserRepository repository) {
		super();
		this.repository = repository;
	}

	public UserEntity save(UserEntity user) throws Exception {
		if (user == null)
			throw new Exception("Objeto não pode ser nulo");
		
		if (user.getName() == null || user.getName().isEmpty())
			throw new Exception("Nome inválido");
		user.setName(user.getName().trim());
		
		
		if (user.getEmail() == null || user.getEmail().isEmpty())
			throw new Exception("E-mail inválido");
		user.setEmail(user.getEmail().trim().toLowerCase());
		// TODO Validar o e-mail (texto@texto.texto) => REGEX
		
		if (user.getPassword() == null 
				|| user.getPassword().isEmpty()
				|| user.getPassword().length() < 8)
			throw new Exception("Password inválido");
		// TODO Validar a força da senha (Caracteres maiúsculos, minúsculos e númerais)
		
		if (user.getType() == null)
			throw new Exception("Tipo de usuário inválido");
		
		if (repository.existsByEmail(user.getEmail()))
			throw new Exception("Já existe usuário cadastrado com este e-mail");
		
		
		repository.save(user);
		
		return user;
	}

}
