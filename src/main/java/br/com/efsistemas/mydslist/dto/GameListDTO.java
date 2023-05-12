package br.com.efsistemas.mydslist.dto;

import org.springframework.beans.BeanUtils;

import br.com.efsistemas.mydslist.entities.GameList;

public class GameListDTO {

	
	private Long id;
	private String name;
	
	
	public GameListDTO() {
		
	}


	public GameListDTO(GameList entity) {
		
		BeanUtils.copyProperties(entity, this);
				
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
