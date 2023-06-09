package br.com.efsistemas.mydslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.efsistemas.mydslist.dto.GameDTO;
import br.com.efsistemas.mydslist.dto.GameMinDTO;
import br.com.efsistemas.mydslist.entities.Game;
import br.com.efsistemas.mydslist.projections.GameMinProjection;
import br.com.efsistemas.mydslist.repositories.GameRepository;


@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAllMinDTO(){
		
		List<Game> result = gameRepository.findAll();
		
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
				
		return dto;
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id){
			
		Game result = gameRepository.findById(id).get();
		
		GameDTO dto = new GameDTO(result);
				
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
				
		return dto;
	}
	

}
