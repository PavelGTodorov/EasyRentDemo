package at.ac.univie.imse.team16.EasyRentDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("at.ac.univie.imse.team16.EasyRentDemo.repository")
public class EasyRentDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyRentDemoApplication.class, args);
	}
}
