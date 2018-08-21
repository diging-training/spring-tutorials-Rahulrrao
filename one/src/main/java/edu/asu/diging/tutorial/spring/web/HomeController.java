package edu.asu.diging.tutorial.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.asu.diging.tutorial.spring.service.MoodServiceImpl;

@Controller
public class HomeController {

	@Autowired
	private MoodServiceImpl service;
	
	
	@RequestMapping(value = "/")
	public String home(ModelMap map) {
	    map.addAttribute("mood", service.getCurrentMood());
	    return "index";
	}
	
	@RequestMapping(value = "/reason") 
	public String reason(@RequestParam("r")String reason, ModelMap map) {
		map.addAttribute("reason", service.getReason(reason));
		return "reason";
	}
}
