package br.com.efsistemas.mydslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.efsistemas.mydslist.dto.GameDTO;
import br.com.efsistemas.mydslist.dto.GameMinDTO;
import br.com.efsistemas.mydslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		
		return gameService.findAllMinDTO();
		
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable  Long id){
		
		return gameService.findById(id);
		
	}
	

}
