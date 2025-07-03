package com.reginasofts.pokemontcgtrades.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String stage;
    private int hp;
    private String img;
    private List<String> attack;
    private String ability;
    
    public Card(Long id, String name, String stage, int hp, String img, List<String> attack, String ability) {
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

    public int getHp() {
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
    

    
    
}
