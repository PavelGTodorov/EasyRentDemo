package at.ac.univie.imse.team16.EasyRentDemo.service;

public interface SecurityService {

	String findLoggedInUsername();
	
	void autologin(String username, String password);
	
}
