package br.edu.atitus.api_sample.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.atitus.api_sample.entities.PointEntity;
import br.edu.atitus.api_sample.entities.UserEntity;

@Repository
public interface PointRepository extends JpaRepository<PointEntity, UUID>{
	
	List<PointEntity> findByUser(UserEntity user);

}
