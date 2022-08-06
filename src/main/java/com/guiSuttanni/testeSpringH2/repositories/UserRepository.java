package com.guiSuttanni.testeSpringH2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiSuttanni.testeSpringH2.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
