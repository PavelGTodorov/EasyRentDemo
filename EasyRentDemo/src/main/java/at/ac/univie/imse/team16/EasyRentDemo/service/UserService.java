package at.ac.univie.imse.team16.EasyRentDemo.service;

import at.ac.univie.imse.team16.EasyRentDemo.model.User;

public interface UserService {
	
	void save(User user);
	
	User findByUsername(String username);
	
}
