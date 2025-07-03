package com.reginasofts.pokemontcgtrades.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reginasofts.pokemontcgtrades.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
