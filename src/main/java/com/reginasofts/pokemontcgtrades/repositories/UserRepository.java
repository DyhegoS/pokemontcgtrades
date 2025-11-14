package com.reginasofts.pokemontcgtrades.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.reginasofts.pokemontcgtrades.entities.User;
import com.reginasofts.pokemontcgtrades.projections.UserDetailsProjection;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
	
	@Query("SELECT obj FROM User obj " 
	        + "WHERE UPPER(obj.username) LIKE UPPER(CONCAT('%', :username, '%'))")
	    Page<User> searchByName(String username, Pageable pageable);

    @Query(nativeQuery = true, value = """
			SELECT tb_users.username AS username, tb_users.password, tb_role.id AS roleId, tb_role.authority
			FROM tb_users
			INNER JOIN tb_user_role ON tb_users.id = tb_user_role.user_id
			INNER JOIN tb_role ON tb_role.id = tb_user_role.role_id
			WHERE tb_users.username = :username
		""")
	List<UserDetailsProjection> searchUserAndRoles(String username);
}
