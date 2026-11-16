package com.learning.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learning.boot.entity.User;
import com.learning.boot.Service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public UserController(UserService userService) {
		// TODO Auto-generated constructor stub
		this.userService = userService;
	}

	@GetMapping("/")
	public String helloUser() {
		System.out.println("UserController.helloUser()");
		return "welcome";
	}
	
	@PostMapping
	@ResponseBody
	public User saveUser(@RequestBody User user) {
		userService.saveUser(user);
		return user;
	}
	
	@GetMapping("/getAllUsers")
	@ResponseBody
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/getUser/{id}")
	@ResponseBody
	public User getUser(@PathVariable int id) {
		System.out.println("UserController.getUser()");
		return userService.getUserById(id);
	}
	
}
