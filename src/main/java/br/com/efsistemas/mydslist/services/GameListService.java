package br.com.efsistemas.mydslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.efsistemas.mydslist.dto.GameListDTO;
import br.com.efsistemas.mydslist.entities.GameList;
import br.com.efsistemas.mydslist.repositories.GameListRepository;


@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAllDTO(){
		
		List<GameList> result = gameListRepository.findAll();
		
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
				
		return dto;
	}
	
	

}
