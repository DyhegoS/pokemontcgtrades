package com.reginasofts.pokemontcgtrades.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.reginasofts.pokemontcgtrades.entities.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long>{
	
	
	@Query("SELECT obj FROM Card obj "
			+"WHERE UPPER (obj.name) LIKE UPPER(CONCAT('%', :name, '%')) AND UPPER(obj.type) LIKE UPPER(CONCAT('%', :type, '%')) AND UPPER(obj.stage) LIKE UPPER(CONCAT('%', :stage, '%'))")
	Page<Card> searchByNameTypeStage(String name, String type, String stage, Pageable pageable);
}
