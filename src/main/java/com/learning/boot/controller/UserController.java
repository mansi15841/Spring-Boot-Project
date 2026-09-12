package com.learning.boot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.boot.Service.UserService;
import com.learning.boot.model.User;

@RestController // == @Controller @ResponseBody 
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService ;
	}
	
	@GetMapping("/")
	public String helloUser() {
		System.out.println("UserController.helloUser()");
		return "Hello it's a spring boot rest api project";
	}
	
	@PostMapping
	public User saveUser(@RequestBody User user) {
		System.out.println("UserController.saveUser()");
		return userService.saveUser(user);
	}
	
	@GetMapping("/getAllUsers")
	public Map<Integer, User> getAllUsers(){
		System.out.println("UserController.getAllUsers()");
		return userService.getAllUsers();
	}
}
