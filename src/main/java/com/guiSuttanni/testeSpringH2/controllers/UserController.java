package com.guiSuttanni.testeSpringH2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guiSuttanni.testeSpringH2.entities.User;
import com.guiSuttanni.testeSpringH2.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;

	@GetMapping
	public List<User> findAll() {
		return repository.findAll();
	}
	
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		//Por motivos de pressa não estarei tratando as exceções neste caso, mas deveriam ser tratadas
		return repository.findById(id).get();
	}
	
	@PostMapping
	public User insert(@RequestBody User user) {
		return repository.save(user);
	}
}
