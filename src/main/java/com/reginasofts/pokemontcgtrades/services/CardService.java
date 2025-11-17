package com.reginasofts.pokemontcgtrades.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reginasofts.pokemontcgtrades.dto.CardDTO;
import com.reginasofts.pokemontcgtrades.entities.Card;
import com.reginasofts.pokemontcgtrades.repositories.CardRepository;

@Service
public class CardService {
	
	@Autowired
	private CardRepository cardRepository;
	
	@Transactional(readOnly = true)
	public Page<CardDTO> findAll(String name, String type, String stage, Pageable pageable){
		Page<Card> result = cardRepository.searchByNameTypeStage(name, type, stage, pageable);
		return result.map(x -> new CardDTO(x));
		
	}
	
}
