package com.learning.boot.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.learning.boot.model.User;

@Service
public class UserService {
	
	private static HashMap<Integer, User> allUsers = new HashMap<>();
	
	static {
		allUsers.put(1,new User(1,"Vinod","Male","Noida"));
		allUsers.put(2,new User(2,"Ashish","Male","GZB"));
		allUsers.put(3,new User(3,"Ankush","Male","Noida"));
		allUsers.put(4,new User(4,"Mukesh","Male","Gurugram"));
		allUsers.put(5,new User(5,"Sukh","Male","Noida"));
	}
	
	public User saveUser(User user) {
		System.out.println("UserService.saveUser()");
		allUsers.put(user.getId(), user);
		return user;
	}
	
	public Map<Integer, User> getAllUsers(){
		System.out.println("UserService.getAllUsers()");
		return allUsers;
	}
}
