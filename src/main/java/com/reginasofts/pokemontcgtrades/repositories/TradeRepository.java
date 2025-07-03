package com.reginasofts.pokemontcgtrades.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reginasofts.pokemontcgtrades.entities.Trade;

public interface TradeRepository extends JpaRepository<Trade, Long>{

}
