package at.ac.univie.imse.team16.EasyRentDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
//	@Bean
//	public DataSource dataSource() {
//	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
//	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//	    dataSource.setUrl("jdbc:mysql://localhost:3306/imse");
//	    dataSource.setUsername("imse");
//	    dataSource.setPassword("imse");
//	    return dataSource;
//	}

//	@Bean
//	public EntityManager entityManager() {
//	    return entityManagerFactory().getObject().createEntityManager();
//	}
//
//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//	    LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//	    em.setDataSource(dataSource());
//	    em.setPackagesToScan("at.ac.univie.imse.team16.EasyRentDemo.model");
//	    return em;
//	}

//	@Bean
//	public JpaVendorAdapter jpaVendorAdapter(){
//		HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
//		hibernateJpaVendorAdapter.setShowSql(true);
//	}
	
}
