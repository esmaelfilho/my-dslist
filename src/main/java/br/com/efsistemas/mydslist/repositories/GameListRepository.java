package br.com.efsistemas.mydslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.efsistemas.mydslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

	
	
}
