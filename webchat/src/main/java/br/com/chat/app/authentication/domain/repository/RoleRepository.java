package br.com.chat.app.authentication.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.chat.app.authentication.domain.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	Role findByName(String name);
}
