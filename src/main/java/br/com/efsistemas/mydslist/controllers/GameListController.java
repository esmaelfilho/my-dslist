package br.com.efsistemas.mydslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.efsistemas.mydslist.dto.GameListDTO;
import br.com.efsistemas.mydslist.dto.GameMinDTO;
import br.com.efsistemas.mydslist.services.GameListService;
import br.com.efsistemas.mydslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	
	@Autowired
	private GameListService gameListService;
	

	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		
		return gameListService.findAllDTO();
		
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		
		return gameService.findByList(listId);
		
	}
	
	
}
