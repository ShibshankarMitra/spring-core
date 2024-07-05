package com.Spring.CentralExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerCentral {

	
	
	
	@ExceptionHandler({NullPointerException.class})
	public String handleNullPointer() {
		
		
		return "error";
	}
	
	//For handling Generic exceptions Use Java.lang.Exception Class
	//send the https error response also using @responseStatus Annotation
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler({Exception.class})
//	public String handleGeneric() {
//		
//		
//		return "error";
//	}
}
