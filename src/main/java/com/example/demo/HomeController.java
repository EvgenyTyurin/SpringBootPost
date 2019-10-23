package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HTTP requests controller
 * @author EUTyrin
 *
 */

@Controller
public class HomeController {
	
	// http get of root -> Show home.html from templates dir 
	@GetMapping("/")
	public String home() {
		return "home";
	}

}
