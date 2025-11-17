package com.reginasofts.pokemontcgtrades.dto;

import java.util.HashSet;
import java.util.Set;

import com.reginasofts.pokemontcgtrades.entities.Attacks;
import com.reginasofts.pokemontcgtrades.entities.Card;

public class CardDTO {
	private Long id;
	private String name;
	private String type;
	private String stage;
	private Integer hp;
	private String img;
	
	private Set<AttackDTO> attacks = new HashSet<>();
	
	public CardDTO() {
	}

	public CardDTO(Long id, String name, String type, String stage, Integer hp, String img, Set<AttackDTO> attacks) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.stage = stage;
		this.hp = hp;
		this.img = img;
		this.attacks = attacks;
	}
	
	public CardDTO(Card entity) {
		id = entity.getId();
		name = entity.getName();
		type = entity.getType();
		stage = entity.getStage();
		hp = entity.getHp();
		img = entity.getImg();
		for(Attacks a : entity.getAttack()) {
			attacks.add(new AttackDTO(a));
		}
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getStage() {
		return stage;
	}

	public Integer getHp() {
		return hp;
	}

	public String getImg() {
		return img;
	}

	public Set<AttackDTO> getAttacks() {
		return attacks;
	}
}
