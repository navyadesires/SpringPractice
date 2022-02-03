package com.mouritech.firstspringmvcapp.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mouritech.firstspringmvcapp.model.Greetings;

@Controller
@RequestMapping("/greetingscontroller")
public class GreetingsController {
	
	@RequestMapping("/saygreeting")
	public String greetingHandler(Model model) {
		
		Greetings greetings = new Greetings();
		greetings.setMessage("Good Morning Ramya");
		greetings.setDateTime(LocalDateTime.now().toString());
		//we can access this object in the view
		//we are sending the response to the associated view
		model.addAttribute("greetingsobj", greetings);
		//the above object will be returned to greetings.jsp
		return "greetings";
	}

}