package edu.asu.diging.tutorial.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {
	
	
	@RequestMapping(value="/about")
	public String showExplanation() {
	    return "about";
	}
}
