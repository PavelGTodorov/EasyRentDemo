package at.ac.univie.imse.team16.EasyRentDemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import at.ac.univie.imse.team16.EasyRentDemo.model.User;

@Repository("UserRepository")
public interface UserRepository extends CrudRepository<User, Long> {
		
	User findByUsername(String username);
	
}
