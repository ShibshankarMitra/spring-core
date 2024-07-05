package com.Spring.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.AsyncHandlerInterceptor;


public class NameInterceptor implements AsyncHandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("This is pre handle");
		return true ;
	}

}
