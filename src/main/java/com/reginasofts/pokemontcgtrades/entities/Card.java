package com.reginasofts.pokemontcgtrades.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String stage;
    private Integer hp;
    private String img;
    private List<String> attack;
    private String ability;
    
    @ManyToMany(mappedBy = "cards")
    private List<Deck> decks = new ArrayList<>();
    
    public Card(Long id, String name, String stage, Integer hp, String img, List<String> attack, String ability) {
        this.id = id;
        this.name = name;
        this.stage = stage;
        this.hp = hp;
        this.img = img;
        this.attack = attack;
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<String> getAttack() {
        return attack;
    }

    public void setAttack(List<String> attack) {
        this.attack = attack;
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
