package br.edu.atitus.api_sample.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.atitus.api_sample.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID>{
	
	boolean existsByEmail(String email);

}
