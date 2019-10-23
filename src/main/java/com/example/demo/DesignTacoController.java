package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// For logging
import lombok.extern.slf4j.Slf4j;


// This class will control "/design" http requests
@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {
	
	// This method control GET http request
	@GetMapping
	public String showDesignForm(Model model) {
		// Add text field to model
		model.addAttribute("message", "Create your Shaverma!");
		// Add Taco object to model (name design is a must)
		model.addAttribute("design", new Taco());
		// Pass data to view "design.html"
		return "design";
	}
	
	// This method handle POST method with data from input FORM
	@PostMapping
	public String processDesign(@ModelAttribute Taco taco) {
		log.info("Processing taco:" + taco.getName());
		// Process and go home for now
		return("home");
	}

}
