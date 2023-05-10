package br.com.efsistemas.mydslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.efsistemas.mydslist.dto.GameMinDTO;
import br.com.efsistemas.mydslist.entities.Game;
import br.com.efsistemas.mydslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAllMinDTO(){
		
		List<Game> result = gameRepository.findAll();
		
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
				
		return dto;
	}
	

}
