package com.nto.test.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/all")
public class Resource {
	
	// repository
	private UserRepository userRepository;
	
	public Resource(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/")
	public List<Users> all() {
		
		return userRepository.findAll();
	}
	

}
