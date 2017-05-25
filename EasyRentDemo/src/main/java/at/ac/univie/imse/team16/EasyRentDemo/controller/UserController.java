package at.ac.univie.imse.team16.EasyRentDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import at.ac.univie.imse.team16.EasyRentDemo.model.User;
import at.ac.univie.imse.team16.EasyRentDemo.service.UserService;
import at.ac.univie.imse.team16.EasyRentDemo.service.UserValidator;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
//	@Autowired
//	private SecurityService securityService;
	
	@Autowired
	private UserValidator userValidator;

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration(Model model){
	
		model.addAttribute("userform", new User());
		
		return "registration";
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registration(@ModelAttribute("userform") User userform, BindingResult bindingResult, Model model){
		userValidator.validate(userform, bindingResult);
	
		if (bindingResult.hasErrors()){
			return "registration";
		}
		
		userService.save(userform);
		return "redirect:/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, String error, String logout){
		if (error != null) 
			model.addAttribute("error", "Invalid credentials");
		if (logout != null)
			model.addAttribute("message", "You have been logged out successfully");
		return "login";
	}
	
	@RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
	public String welcome(Model model) {
		return "welcome";
	}
}
