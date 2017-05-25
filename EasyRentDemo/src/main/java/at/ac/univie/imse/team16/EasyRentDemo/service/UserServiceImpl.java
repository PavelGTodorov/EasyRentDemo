package at.ac.univie.imse.team16.EasyRentDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import at.ac.univie.imse.team16.EasyRentDemo.model.Role;
import at.ac.univie.imse.team16.EasyRentDemo.model.User;
import at.ac.univie.imse.team16.EasyRentDemo.repository.RoleRepository;
import at.ac.univie.imse.team16.EasyRentDemo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public void save(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		Role role = new Role(user.getId(), "ROLE_USER");
		roleRepository.save(role);
		userRepository.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

}
