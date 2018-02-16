package br.com.chat.app.authentication.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.chat.app.authentication.domain.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}
