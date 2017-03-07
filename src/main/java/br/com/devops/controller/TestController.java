package br.com.devops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController { 

	@RequestMapping({"/test", "/hi"})
	public String test(Model model){
		model.addAttribute("message", "Maven + Spring Up and Running");
		return "test/index";
	}
	
}
