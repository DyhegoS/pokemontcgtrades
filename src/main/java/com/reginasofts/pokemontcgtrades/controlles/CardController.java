package com.reginasofts.pokemontcgtrades.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reginasofts.pokemontcgtrades.dto.CardDTO;
import com.reginasofts.pokemontcgtrades.services.CardService;

@RestController
@RequestMapping(value = "/cards")
public class CardController {
	
	@Autowired
	private CardService cardService;
	
	@GetMapping
	public ResponseEntity<Page<CardDTO>> findAll(@RequestParam (name = "name", defaultValue = "") String name,
										   @RequestParam (name = "type", defaultValue = "") String type,
										   @RequestParam (name = "stage", defaultValue = "") String stage,
										   Pageable pageable){
		Page<CardDTO> dto = cardService.findAll(name, type, stage, pageable);
		return ResponseEntity.ok(dto);
	}
	
										

}
