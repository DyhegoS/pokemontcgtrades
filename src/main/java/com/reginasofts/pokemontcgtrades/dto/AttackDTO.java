package com.reginasofts.pokemontcgtrades.dto;

import com.reginasofts.pokemontcgtrades.entities.Attacks;

public class AttackDTO {
	
	private Long id;
	private String name;
	private String type;
	private String effect;
	private Integer damage;
	
	public AttackDTO() {
	}

	public AttackDTO(Long id, String name, String type, String effect, Integer damage) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.effect = effect;
		this.damage = damage;
	}
	
	public AttackDTO(Attacks entity) {
		id = entity.getId();
		name = entity.getName();
		type = entity.getType();
		effect = entity.getEffect();
		damage = entity.getDamage();
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

	public String getEffect() {
		return effect;
	}

	public Integer getDamage() {
		return damage;
	}	
}
