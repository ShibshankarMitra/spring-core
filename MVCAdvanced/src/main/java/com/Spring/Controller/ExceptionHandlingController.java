package com.Spring.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("exception")
public class ExceptionHandlingController {
	
	@RequestMapping("home")
	public String showhome() {
		
		String str=null;
		System.out.println(str.length());
		
		return "home";
		
	}
	
	//Commenting out the Controller specific exception Handling as we are using Central exception Handling
	
	
	
	//Mention the type of Exception class to be handled
//	@ExceptionHandler({NullPointerException.class})
//	public String handleNullPointer() {
//		
//		
//		return "error";
//	}
//	
//	//For handling Generic exceptions Use Java.lang.Exception Class
//	//send the https error response also using @responseStatus Annotation
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler({Exception.class})
//	public String handleGeneric() {
//		
//		
//		return "error";
//	}



}
