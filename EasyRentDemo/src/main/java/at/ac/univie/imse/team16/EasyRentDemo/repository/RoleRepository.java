package at.ac.univie.imse.team16.EasyRentDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import at.ac.univie.imse.team16.EasyRentDemo.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

	@Query("select a.name from Role a, User b where b.username=?1 and a.id = b.id")
    List<String> findRoleByUsername(String username);
	
}
