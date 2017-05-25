package at.ac.univie.imse.team16.EasyRentDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import at.ac.univie.imse.team16.EasyRentDemo.model.User;

@Component
public class UserValidator implements Validator {

	@Autowired
	private UserService userService;
	
	@Override
	public boolean supports(Class<?> aClass) {
		return User.class.equals(aClass);
	}

	@Override
	public void validate(Object o, Errors errors) {
		
		User user = (User) o;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty");
		if (userService.findByUsername(user.getUsername()) != null){
			errors.rejectValue("email", "Userform.duplicateUsername");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
		if (user.getPassword().length() < 6 || user.getPassword().length() > 32){
			errors.rejectValue("password", "Userform.passwordSize");
		}
		
	}

}
