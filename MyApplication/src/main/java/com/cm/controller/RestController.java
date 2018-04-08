package com.cm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cm.modal.User;
import com.cm.services.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String Welcome() {
		return "welcomepage";
	}
		
	
	@GetMapping("/saveuser")
	public String saveUser(@RequestParam String username,@RequestParam String mail, @RequestParam String firstname, @RequestParam String lastname, @RequestParam int age,@RequestParam String address,@RequestParam String role ,@RequestParam String password) {
		User user = new User(username,mail, firstname, lastname, age,address,role, password);
		userService.saveMyUser(user);
		return "User Saved";
	}
}
