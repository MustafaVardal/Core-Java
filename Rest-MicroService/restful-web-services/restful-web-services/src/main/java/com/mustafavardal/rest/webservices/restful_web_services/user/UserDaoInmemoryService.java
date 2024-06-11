package com.mustafavardal.rest.webservices.restful_web_services.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

@Component
public class UserDaoInmemoryService {
	
	private static List<User> users = new ArrayList<>();
	private static int usersCount;
	static {
		users.add(new User(1, "Musty", new Date()));
		users.add(new User(2, "Yekbun", new Date()));
		users.add(new User(3, "Rajah", new Date()));
	}
	
	
	
	// findAll();
	// saveUser();
	// findUser();
	
	public List<User>  findAll() {
		return users;
	}
	
	public User getById(int id){
		Optional<User> foundUser = users.stream().filter(user -> user.getId() ==id).findFirst();
		if(foundUser.isPresent()) {
			return foundUser.get();
		}else 
		
		return null;
		
	}
	
	public User deleteById(int id){
		 Iterator<User> iterator= users.iterator();
		 
		 while(iterator.hasNext()) {
			 User user = iterator.next();
			 
			 if(user.getId() == id) {
				 iterator.remove();
				 return user;
			 }
		 }
		return null;
	}
	
	

	
	/*
	 * public User saveUser(User user) {
	 * 
	 * if(user.getId() == 0) { user.setId(usersCount); }
	 * 
	 * users.add(user); return user; }
	 */
	
	public User saveUser(User user) {
		Optional<User> addUser = users.stream().filter(u -> u.getId() == 0).findFirst();
		//Optional<User> addedUser = addUser.stream().filter(u -> addUser.isPresent()).findFirst();
		/*
		 * if(addUser.isPresent()) { user.setId(usersCount); }
		 */
		users.add(user);
		return user;
	}
	
	
	
	
}
	
	
	
	


