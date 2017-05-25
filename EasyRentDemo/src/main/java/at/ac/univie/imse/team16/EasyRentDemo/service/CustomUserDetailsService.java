package at.ac.univie.imse.team16.EasyRentDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import at.ac.univie.imse.team16.EasyRentDemo.config.CustomUserDetails;
import at.ac.univie.imse.team16.EasyRentDemo.model.User;
import at.ac.univie.imse.team16.EasyRentDemo.repository.RoleRepository;
import at.ac.univie.imse.team16.EasyRentDemo.repository.UserRepository;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
    public CustomUserDetailsService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByUsername(username);
		if(null == user){
			throw new UsernameNotFoundException("No user present with username: "+username);
		}else{
			List<String> roles = roleRepository.findRoleByUsername(username);
			return new CustomUserDetails(user, roles);
		}
	}

}
