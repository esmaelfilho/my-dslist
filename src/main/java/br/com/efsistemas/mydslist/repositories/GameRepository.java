package br.com.efsistemas.mydslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.efsistemas.mydslist.dto.GameMinDTO;
import br.com.efsistemas.mydslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

	
	
}
