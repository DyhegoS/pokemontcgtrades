package com.reginasofts.pokemontcgtrades.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.reginasofts.pokemontcgtrades.dto.UserDTO;
import com.reginasofts.pokemontcgtrades.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	 @PreAuthorize("hasRole('ROLE_ADMIN')")
	 @GetMapping
	    public ResponseEntity<Page<UserDTO>> findAll(
	        @RequestParam(name = "username", defaultValue = "") String username,
	        Pageable pageable){
	        Page<UserDTO> dto = userService.findAll(username, pageable);
	        return ResponseEntity.ok(dto);
	    }
	
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    @GetMapping(value = "/me")
	public ResponseEntity<UserDTO> getMe(){
		UserDTO dto = userService.getMe();
		return ResponseEntity.ok(dto);
	}

}
