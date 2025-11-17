package com.reginasofts.pokemontcgtrades.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private String stage;
    private Integer hp;
    private String img;
    
    @ManyToMany
    @JoinTable(name = "tb_card_attack",
    		joinColumns = @JoinColumn(name = "card_id"),
    		inverseJoinColumns = @JoinColumn(name = "attack_id"))
    private Set<Attacks> attacks = new HashSet<>();
    private String ability;
    
    @ManyToMany(mappedBy = "cards")
    private List<Deck> decks = new ArrayList<>();
    
    public Card(Long id, String name, String type, String stage, Integer hp, String img, Set<Attacks> attacks, String ability) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.stage = stage;
        this.hp = hp;
        this.img = img;
        this.attacks = attacks;
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Set<Attacks> getAttack() {
        return attacks;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
    
    public List<Deck> getDeck(){
    	return decks;
    }

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return Objects.equals(id, other.id);
	}
}
