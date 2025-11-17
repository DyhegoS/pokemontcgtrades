package com.reginasofts.pokemontcgtrades.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reginasofts.pokemontcgtrades.dto.UserDTO;
import com.reginasofts.pokemontcgtrades.entities.Role;
import com.reginasofts.pokemontcgtrades.entities.User;
import com.reginasofts.pokemontcgtrades.projections.UserDetailsProjection;
import com.reginasofts.pokemontcgtrades.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		List<UserDetailsProjection> result = userRepository.searchUserAndRolesByEmail(username);
		if(result.size() == 0) {
			throw new UsernameNotFoundException("usuário não encontrado");
		}
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(result.get(0).getPassword());
		for(UserDetailsProjection projection : result) {
			user.addRole(new Role(projection.getRoleId(), projection.getAuthority()));
		}
		
		return user;
	}

	protected User authenticated() {
		try{
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
			Jwt jwtPrincipal = (Jwt) authentication.getPrincipal();
			String username = jwtPrincipal.getClaim("username");
			return userRepository.findByEmail(username).get();
		}
		catch(Exception e){
			throw new UsernameNotFoundException("User not found");
		}
	}

	@Transactional(readOnly = true)
	public UserDTO getMe(){
		User user = authenticated();
		return new UserDTO(user);
	}

	@Transactional
	public Page<UserDTO> findAll(String name, Pageable pageable) {
		Page<User> result = userRepository.searchByName(name, pageable);
        return result.map(x -> new UserDTO(x));
	}
	
}
