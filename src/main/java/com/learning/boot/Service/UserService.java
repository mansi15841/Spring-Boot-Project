package com.learning.boot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.boot.dao.UserRepo;
import com.learning.boot.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	public User saveUser(User user) {
		System.out.println("UserService.saveUser()");
		userRepo.save(user);
		return user;
	}
	
	public List<User> getAllUsers(){
		System.out.println("UserService.getAllUsers()");
		return userRepo.findAll();
	}
}
