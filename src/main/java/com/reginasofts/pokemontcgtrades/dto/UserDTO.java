package com.reginasofts.pokemontcgtrades.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;

import com.reginasofts.pokemontcgtrades.entities.User;

public class UserDTO {
	
	private Long id;
	private String username;
	private String email;
	
	private List<String> roles = new ArrayList<>();
	
	public UserDTO() {
	}

	public UserDTO(User entity) {

		id = entity.getId();
		username = entity.getUsername();
		email = entity.getEmail();
		for(GrantedAuthority role : entity.getRoles()){
            roles.add(role.getAuthority());
        }
	}

	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public List<String> getRoles() {
		return roles;
	}
}
