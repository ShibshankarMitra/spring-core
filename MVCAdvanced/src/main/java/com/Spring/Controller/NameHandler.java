package com.Spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/name")
public class NameHandler {
	
	
@RequestMapping("/home")
	public String showName() {
		return "name";
	}

@RequestMapping("/submit")
public String SubmitName(@RequestParam("username") String name, Model m) {
	
	m.addAttribute("name", name);
	System.out.println("Inside Handler");
	return "success";
}

}
