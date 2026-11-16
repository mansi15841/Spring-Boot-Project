package com.learning.boot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.boot.Repository.UserRepository;
import com.learning.boot.entity.User;
import com.learning.boot.exception.UserNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		// TODO Auto-generated constructor stub
		this.userRepository = userRepository;
	}
	
	public User saveUser(User user) {
		System.out.println("UserService.saveUser()");
		userRepository.save(user);
		return user;
	}
	
	public List<User> getAllUsers(){
		System.out.println("UserService.getAllUsers()");
		return userRepository.findAll();
	}
	
	public User getUserById(int id) {
		System.out.println("UserService.getUserById()");
		return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("user is not found with id: "+id));
	}
}
