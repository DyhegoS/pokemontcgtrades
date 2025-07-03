package com.reginasofts.pokemontcgtrades.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reginasofts.pokemontcgtrades.entities.Card;

public interface CardRepository extends JpaRepository<Card, Long>{

}
